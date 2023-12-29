package LabCode;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	public GeometricObject()
	{
		dateCreated = new java.util.Date();	
	}
	
	public GeometricObject(String color, boolean filled)
	{
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String get_color()
	{
		return color;
	}
	
 
	public void set_color(String p_color)
	{
		color = p_color;
	}
	
	public boolean is_filled()
	{
		return filled;
	}
	
	public void set_filled (boolean p_filled)
	{
		filled = p_filled;
	}
	
	public java.util.Date get_Date_Created()
	{
		return dateCreated;
	}

	public String toString()
	{
		return "Created on "+ dateCreated + "\n Color: "+ color + "\n filled: "+ filled;
	}
	
	public double getArea() {
		return 0.0; //stub
	}

	public double getPerimeter() {
		return 0.0; //stub
	}
}