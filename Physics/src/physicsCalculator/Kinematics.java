package physicsCalculator;

import java.util.Scanner;

public class Kinematics {

	public static void main(String[] args) {
		

		Scanner input = new Scanner (System.in);
		double  x, v, t = 0, a ;
		System.out.println("I. Kinematics equation");
		System.out.print("Enter what you want to calculate on (distance / velocity / time / acceleration): ");
		String kin = input.next();
		System.out.println();
		System.out.println("Only input numbers without units");
		if(kin.compareTo("distance") == 0) {
			System.out.print("Enter acceleration in m/s^2: ");
			a = input.nextDouble();
			System.out.print("Enter time in s: ");
			t = input.nextDouble();
			System.out.print("Enter velocity in m/s: ");
			v = input.nextDouble();
			if(a == 0 && v > 0) {
				x =  ((v) * (t));
			}
			else if (a > 0 && v == 0){
				x = 0.5 * a * (Math.pow(t, 2));
			}
			else {
				x =  ((v) * (t)) + 0.5 * a * (Math.pow(t, 2));
			}
			System.out.print("Your distance is " + x + "m");
		}
		else if (kin.compareTo("velocity") == 0) {
			System.out.print("Enter acceleration in m/s^2: ");
			a = input.nextDouble();
			System.out.print("Enter time in s: ");
			t = input.nextDouble();
			System.out.print("Enter distance in m: ");
			x = input.nextDouble();
			if(a == 0 && x > 0) {
				v = x / t;
			}
			else if (x == 0 && a > 0) {
				v = (a * t);
			}
			else if (x == 0 && a == 0){
				v = 0;
			}
			else {
				v = x / t;
			}
			System.out.print("Your velocity is " + v + "m/s");

		}
		else if (kin.compareTo("time") == 0) {
			System.out.print("Enter acceleration in m/s^2: ");
			a = input.nextDouble();
			System.out.print("Enter distance in m: ");
			x = input.nextDouble();
			System.out.print("Enter velocity in m/s: ");
			v = input.nextDouble();
			if(a == 0 && x > 0) {
				t = x / v;
			}
			else if (x == 0 && a > 0) {
				t = Math.sqrt(x / (0.5 * a));
			}
			else if (x == 0 && a == 0){
				t = 0;
			}
			else {
				t = x / v;
			}
			System.out.print("Your time is " + t + "s");
		}
		else if (kin.compareTo("acceleration") == 0) {
			System.out.print("Enter time in s: ");
			t = input.nextDouble();
			System.out.print("Enter distance in m: ");
			x = input.nextDouble();
			System.out.print("Enter velocity in m/s: ");
			v = input.nextDouble();
			if(v == 0 && x > 0) {
				a = x / (Math.pow(t,  2));
			}
			else if (x == 0 && v > 0) {
				a = v / t;
			}
			else if (x == 0 && v == 0){
				a = 0;
			}
			else {
				a =  v / t;
			}
			System.out.print("Your time is " + a + "s");
		}

	}

}
