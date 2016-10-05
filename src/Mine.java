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
	
	private void analyzeDistances(){
		// take every combination of edges and analyze them here 
	}
	
	public static void main(String [] args) {
		Mine play = new Mine();
		System.out.println(play.toString()); 
	}
}
