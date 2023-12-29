package homework;

public class MyPoint {

	private double x = 0;
	private double y = 0;
	
	MyPoint(){}
	
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance (MyPoint point2) {
		double distance = 0;
		double x1 = point2.getX();
		double y1 = point2.getY();

		distance =   Math.sqrt( Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));
		
		return distance;
	}
}
