
public class Mine {
	String[][] mine; 
	
	
	public Mine(){
		mine = new String[16][16];
		populateMine();
	}
	
	public void populateMine() {
		Gem garnet = new Gem("Garnet");
		Gem rose = new Gem("Rose Quartz");
		Gem amythest = new Gem("Amythest");
		Gem pearl = new Gem("Pearl");
		mine[garnet.getX()][garnet.getY()] = garnet.getIcon();
		mine[pearl.getX()][pearl.getY()] = pearl.getIcon();
		mine[rose.getX()][rose.getY()] = rose.getIcon();
		mine[amythest.getX()][amythest.getY()] = amythest.getIcon();
	}

	public String toString(){
		String map = "|------------------|\n";
		for (int i = 0 ; i < 16 ; i++) {
			map += "|";
			for (int j = 0 ; i <16 ; i++) {
				map += mine[i][j];
			}
			map += "|\n";
		}
		map += "|------------------|\n";
		return map;
	}
	
	public static void main(String [] args) {
	}
}
