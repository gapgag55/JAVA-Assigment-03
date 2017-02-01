
public class CircleDrawer {
	public static void main(String[] args) {
		Point ball = new Point(10, 20);
		Point doll = new Point(12, 18);
				
		Circle ballArea = new Circle(ball, 5);
		Circle dollArea = new Circle(doll, 20);
		
		System.out.println("Area of ball: " + ballArea.getArea());
		System.out.println("Line area of ball: " + ballArea.getCircumference());
		System.out.println(ballArea.toString() + "\n");
		
		System.out.println("Point doll insides ballArea: " + ballArea.contains(doll));
		System.out.println("Circle doll insides ballArea: " + ballArea.contains(dollArea));
	}
}
