
public class Player {
	
	private int x, y;
	private String marker;
	
	public Player() {
		x = randomGridCoor();
		y = randomGridCoor();
		marker = "x";
	}
	
	private int randomGridCoor() {
		return (int) (Math.random() * 16);
	}
	
	public void move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public String getIcon(){
		return marker;
	}
}
