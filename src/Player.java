
public class Player {
	
	int x, y;
	String marker;
	
	public Player() {
		x = randomGridCoor();
		y = randomGridCoor();
		marker = "x";
	}
	
	private int randomGridCoor() {
		return (int) Math.random() * 16;
	}
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
}
