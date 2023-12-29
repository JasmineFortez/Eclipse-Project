package geometricShapes;

public class geometricShapes {
	
	private double width = 0.0;
	private double height = 0.0;
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth (double width) {
		this.width = width; 
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return this.height * this.width;
	}
	
	public double getPerimeter() {
		return 2 * this.height + 2 * this.width;
	} 
	
	public geometricShapes (){}
	public geometricShapes (double width, double height) {
		super();
		this.height = height;
		this.width = width;
	}
	
	
}
