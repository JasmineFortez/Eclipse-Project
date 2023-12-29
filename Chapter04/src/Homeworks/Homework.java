package Homeworks;
import java.util.Scanner;
public class Homework {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
double a = 0.0;
double b = 0.0;
double c = 0.0;
double rootOne = 0.0; double rootTwo = 0.0; double discriminant = 0.0;
System.out.print("Enter a, b, and c: ");
a = input.nextDouble(); 
b = input.nextDouble(); 
c = input.nextDouble();
discriminant = Math.pow(b, 2) - 4*a*c; 
rootOne = - (b) + Math.sqrt(discriminant);
rootTwo = - (b) - Math.sqrt(discriminant);
rootOne = rootOne / (2*a);
rootTwo = rootTwo / (2*a);
if (discriminant > 0) {
System.out.print("The real roots are: " + rootOne + " and " + rootTwo); }
else if (discriminant == 0) {
System.out.print("The real root is: " + (int) rootOne);
}
else {
System.out.print("The equation has no real roots");
}
input.close(); }
}