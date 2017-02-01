
public class Point {
	private double x;
	private double y;
	
	/*
	 * @Construct of Point class.
	 * @Arguments are aX and aY.
	 * */
	public Point(double aX, double aY) {
		this.x = aX;
		this.y = aY;
	}
	
	/*
	 * @Getter 
	 * - getX
	 * - getY
	 * */
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	/*
	 * @Find result between its and other point.
	 * */
	public double manhattanDistance(Point other) 
	{
		double deltaX, deltaY, sum;
		
		/*
		 * @Find Delta of X and Y.
		 * */
		deltaX = Math.abs(this.x - other.x);
		deltaY = Math.abs(this.y - other.y);
		
		/*
		 * @Find distance between of them.
		 * */
		sum = Math.abs(deltaX + deltaY);
		
		return sum;
	}
	
	public static void main(String[] args) 
	{
		double result; 
		
		Point ball = new Point(10, 10);
		Point doll = new Point(40, 50);
		
		result = ball.manhattanDistance(doll);
		System.out.println(result);
	}
}



