package breakout;

import java.util.Date;
import java.util.Random;

public class SimpleCircle {
	
	private int radius = 1; private Date dateCreated;
	
	SimpleCircle() {
	dateCreated = new Date();
	}
	public SimpleCircle(int radius) {
	dateCreated = new Date();
	this.radius = radius; }
	
	public   double  getArea() {
		return Math.PI * radius * radius;
	}
	
	
	public String toString() {
	return "[Radius = " + Integer.toString(radius) + "; Area = " +
	Double.toString(getArea()) +
	"; Date created = \t" + dateCreated.toString() + "]";
	
	}
}