
public class Gem {
	
	private int coorX, coorY; 
	private String icon, name;
	
	public Gem(String name){
		coorX = randomGridCoor();
		coorY = randomGridCoor();
		this.name = name;
		this.icon = "*";
	}
	
	public int getX(){
		return coorX;
	}
	
	public int getY(){
		return coorY;
	}
	
	public String getIcon(){
		return icon;
	}
	
	public String getName(){
		return name;
	}
	
	private int randomGridCoor() {
		return (int) Math.random() * 16;
	}
}
