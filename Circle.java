
public class Circle {
	
	private Point obj; 
	
	private double radius;
	
	private final double PI = Math.PI;
	
	/*
	 * @Constructor
	 * */
	public Circle(Point obj, double radius) {
		this.obj = obj;
		this.radius = radius;
	}
	
	/*
	 * @Getter: We have various method to get.
	 * - center
	 * - radius
	 * - area
	 * - Circumference
	 * - toString
	 * - contains(Point p)
	 * - contains(Circle c)
	 * */
	public String getCenter() {
		return this.getX() + ", " + this.getY();
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return PI * Math.pow(this.radius, 2);
	}
	
	public double getCircumference() {
		return 2 * PI * this.radius;
	}
	
	public String toString() {
		return  "Circle[center=("+ this.getCenter() +"), radius= "+ this.radius +"]";
	}
	
	/*
	 * @Method: They will be checked with another.
	 * - Parameter: Point other,
	 * - Parameter: Circle other
	 * */
	public boolean contains(Point other) {
		double startX, endX, startY, endY;
		
		startX = this.getStartX();
		startY = this.getStartY();
		
		endX  =  this.getEndX();
		endY   = this.getEndY();
		
		/*
		 * @Check: Begin point and End Point.
		 * @Find: If Other axis inside of this object.
		 * */
		if(other.getX() >= startX && other.getX() <= endX && other.getY() >= startY && other.getY() <= endY) {
			return true;
		}
		
		return false;
	}
	
	public boolean contains(Circle other) {
		double startX, endX, startY, endY;
		
		startX = this.getStartX();
		startY = this.getStartY();
		
		endX  =  this.getEndX();
		endY   = this.getEndY();
		
		/*
		 * @Check: Begin point and End Point.
		 * @Find: If Other axis inside of this object.
		 * */
		if(other.getStartX() >= startX && other.getEndX() <= endX && other.getStartY() >= startY && other.getEndY() <= endY) {
			return true;
		}
		
		return false;
	}
	
	/*
	 * @Getter helpers
	 * - Description: To Find Begin of point and End of Point
	 * 
	 * - getStartX, getStartY
	 * - getEndX, getEndY
	 **/
	public double getStartX() {
		return this.getX() - this.radius;
	}
	
	public double getEndX() {
		return this.getX() + this.radius;
	}
	
	public double getStartY() {
		return this.getY() - this.radius;
	}

	public double getEndY() {
		return this.getY() + this.radius;
	}
	
	
	/*
	 * @Private Method
	 * - getX: Find X axis of center circle
	 * - getY: Find Y axis of center circle
	 * */
	private double getX() {
		return this.obj.getX();
	}
	
	private double getY() {
		return this.obj.getY();
	}
}
