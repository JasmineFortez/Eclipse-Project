package homework;

public class testPoint {

	public static void main(String[] args) {
		
		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(10, 30.5);
		
		System.out.printf("The distance between (0, 0) and (10, 30.5) = %.4f\n", 
				point1.distance(point2));

	}

}
