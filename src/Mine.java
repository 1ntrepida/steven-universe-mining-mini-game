import java.util.ArrayList;

import com.sun.javafx.collections.MappingChange.Map;

public class Mine {
	
	private String[][] mine;
	private ArrayList<Gem> gems;
	
	public Mine(){
		mine = new String[16][16];
		gems = new ArrayList<Gem>();
		populateMine();
	}
	
	private void populateMine() {
		gems.add(new Gem("Garnet"));
		gems.add(new Gem("Rose Quartz"));
		gems.add(new Gem("Amythest"));
		gems.add(new Gem("Pearl"));
		
		for (int i = 0; i < gems.size() ; i++) {
			Gem crystal = gems.get(i);
			System.out.println(crystal.getName() + " x:"+ crystal.getX() +" y:"  + crystal.getY());
			mine[crystal.getX()][crystal.getY()] = crystal.getIcon();
		}
	}
	
	/**
	private Gem furthestToUserStart() {
		int maxDistance = 0;
		Gem furthest = null;
		for (int i = 0; i < gems.size() ; i++){
			int distance = calculateDistanceFromGemToUser(gems.get(i));
			if (maxDistance < distance){
				maxDistance = distance;
				furthest = gems.get(i);
			}
		}
		return furthest;
	}
	**/
	
	
	/**
	 * moves needed to move in a coor plane from gem to gem
	 * @param gem1
	 * @param gem2
	 * @return
	 */
	private int calculateDistanceFromGemToGem(Gem gem1, Gem gem2){
		return (Math.abs(gem1.getX()-gem2.getX()) + (Math.abs(gem1.getY()-gem2.getY())));
	}
	
	public String toString(){
		String map = "|-------------------------------|\n";
		for (int i = 0 ; i < 16 ; i++) {
			map += "|";
			for (int j = 0 ; j <16 ; j++) {
				if (mine[i][j] == null)
				{
					mine[i][j] = " ";
				}
				map += mine[i][j] + "|";
			}
			map += "\n";
		}
		map += "|-------------------------------|\n";
		return map;
	}
	
	
	public static void main(String [] args) {
		Mine play = new Mine();
		System.out.println(play.toString()); 
	}
}
