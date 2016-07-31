import java.util.ArrayList;

import com.sun.javafx.collections.MappingChange.Map;

public class Mine {
	
	private String[][] mine; 
	private Player user;
	private ArrayList movesMade;
	
	public Mine(){
		mine = new String[16][16];
		user = new Player();
		populateMine();
	}
	
	public void populateMine() {
		Gem garnet = new Gem("Garnet");
		Gem rose = new Gem("Rose Quartz");
		Gem amythest = new Gem("Amythest");
		Gem pearl = new Gem("Pearl");
		mine[user.getX()][user.getY()] = user.getIcon();
		mine[garnet.getX()][garnet.getY()] = garnet.getIcon();
		mine[pearl.getX()][pearl.getY()] = pearl.getIcon();
		mine[rose.getX()][rose.getY()] = rose.getIcon();
		mine[amythest.getX()][amythest.getY()] = amythest.getIcon();
	}
	
	public int dijksta(){
		return null;
	}

	public String toString(){
		String map = "|--------------------------------|\n";
		for (int i = 0 ; i < 16 ; i++) {
			map += "|";
			for (int j = 0 ; j <16 ; j++) {
				if (mine[i][j] == null)
				{
					mine[i][j] = " ";
				}
				map += mine[i][j] + " ";
			}
			map += "|\n";
		}
		map += "|--------------------------------|\n";
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
	}
}
