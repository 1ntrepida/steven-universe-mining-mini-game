import java.util.ArrayList;

import com.sun.javafx.collections.MappingChange.Map;

public class Mine {
	
	private String[][] mine; 
	private Player user;
	private ArrayList<Gem> gems;
	
	public Mine(){
		mine = new String[16][16];
		user = new Player();
		gems = new ArrayList<Gem>();
		populateMine();
	}
	
	public void populateMine() {
		gems.add(new Gem("Garnet"));
		gems.add(new Gem("Rose Quartz"));
		gems.add(new Gem("Amythest"));
		gems.add(new Gem("Pearl"));
		
		mine[user.getX()][user.getY()] = user.getIcon();
		for (int i = 0; i < gems.size() ; i++) {
			Gem crystal = gems.get(i);
			System.out.println(crystal.getName() + " x:"+ crystal.getX() +" y:"  + crystal.getY());
			mine[crystal.getX()][crystal.getY()] = crystal.getIcon();
		}
	}
	
	/**
	 * Used to determine which node is closest to the player cursor
	 * @return returns the gem, either Garnet, Amythest, or Pearl
	 */
	public Gem closestToUserStart() {
		int minDistance = 16;
		Gem closest = null;
		for (int i = 0; i < gems.size() ; i++){
			int distance = calculateDistanceFromGemToUser(gems.get(i));
			if (minDistance > distance){
				minDistance = distance;
				closest = gems.get(i);
			}
		}
		return closest;
	}
	
	/**
	 * moves needed to move in a coor plane from gem to human
	 * @param gem
	 * @param human
	 * @return
	 */
	public int calculateDistanceFromGemToUser(Gem gem){
		return (Math.abs(gem.getX()-user.getX()) + (Math.abs(gem.getY()-user.getY())));
	}
	
	/**
	 * moves needed to move in a coor plane from gem to gem
	 * @param gem1
	 * @param gem2
	 * @return
	 */
	public int calculateDistanceFromGemToGem(Gem gem1, Gem gem2){
		return (Math.abs(gem1.getX()-gem2.getX()) + (Math.abs(gem1.getY()-gem2.getY())));
	}
	
	/**
	 * figures out shortest path that touches each node.
	 * @return
	 */
	public int dijksta(){
		
		return 0;
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
	
	public void movePlayer(String input){
		// check to see if the player already passed by this place
		
		//then move player 
		if (input.equals("up")){
			mine[user.getX()][user.getY()] = "  ";
			mine[user.getX()][user.getY()-1] = " x";
		}
	}
	
	public static void main(String [] args) {
		Mine play = new Mine();
		System.out.println(play.toString());
		Gem closest = play.closestToUserStart();
		System.out.println(closest.getName() + " X:" + closest.getX() + " Y:" + closest.getY());
		System.out.println(play.calculateDistanceFromGemToUser(closest));
	}
}
