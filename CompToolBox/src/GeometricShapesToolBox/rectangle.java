package GeometricShapesToolBox;

import geometricShapes.geometricShapes;

public class rectangle {

	public static void main(String[] args) {
		
		geometricShapes rect1 = new geometricShapes ();
		geometricShapes rect2 = new geometricShapes (3.5, 35.9);
		
		// rectangle 1
		System.out.print("Rectangle 1\n");
		System.out.printf("\nWidth = %.2f Height = %.2f", rect1.getWidth(), rect1.getHeight());
		rect1.setWidth(10);
		rect1.setHeight(3);
		System.out.printf("\nWidth = %.2f Height = %.2f", rect1.getWidth(), rect1.getHeight());
		System.out.printf("\nArea = %.2f", rect1.getArea());
		System.out.printf("\nPerimeter = %.2f", rect1.getPerimeter());
		
		
		// rectangle 2
		System.out.print("\n\nRectangle 2\n");
		System.out.printf("\nWidth = %.2f Height = %.2f", rect2.getWidth(), rect2.getHeight());
		System.out.printf("\nArea = %.2f", rect2.getArea());
		System.out.printf("\nPerimeter = %.2f", rect2.getPerimeter());
	
	}

}
