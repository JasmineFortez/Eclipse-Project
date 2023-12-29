package breakout;

import java.util.Random;

public class circleTest {

	public static void main(String[] args) {
		SimpleCircle[] myCircleList = new SimpleCircle[3];
		Random randomObject = new Random();
		for (int i = 0; i < myCircleList.length; i++)
		myCircleList[i] = new SimpleCircle(randomObject.nextInt(20)); for (SimpleCircle object: myCircleList)
		System.out.printf("%s\n", object.toString());
		System.out.printf("Total area of circles in array: %.4f", getAreaOfCircles(myCircleList));
		}
	
	public static double getAreaOfCircles(SimpleCircle[] circleList) { 
		double totalArea = 0.0;
		for (SimpleCircle object: circleList)
		totalArea += object.getArea(); return totalArea;
		} 

	}


