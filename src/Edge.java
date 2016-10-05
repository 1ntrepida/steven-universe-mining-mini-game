
public class Edge {
	
	Gem one, two;
	int distance;

	public Edge(Gem one, Gem two){
		this.one = one;
		this.two = two;
		distance = calculateDistance();
	}
	
	//pythagorean theorem
	private int calculateDistance(){
		return (int) Math.sqrt(Math.pow(Math.abs(one.getX()-two.getX()), 2) + Math.pow(Math.abs(one.getY()-two.getY()), 2));
	}
	
}
