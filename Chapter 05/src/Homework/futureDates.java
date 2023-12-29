package Homework;

import java.util.Scanner;

public class futureDates {

	public static void main(String[] args) {
		
		int today = 0;
		int future = 0;
	
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		today = input.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		future = input.nextInt();
		
		long math = (future + today) % 7;
		
		if (today == 0) {
			if (math == 0) {
				System.out.println("Today is Sunday and the future day is Sunday");
			}
			else if (math==1) {
				System.out.println("Today is Sunday and the future day is Monday");
			}
			else if (math==2) {
				System.out.println("Today is Sunday and the future day is Tuesday");
			}
			else if (math==3) {
				System.out.println("Today is Sunday and the future day is Wednesday");
			}
			else if (math==4) {
				System.out.println("Today is Sunday and the future day is Thursday");
			}
			else if (math==5) {
				System.out.println("Today is Sunday and the future day is Friday");
			}
			else if (math==6) {
				System.out.println("Today is Sunday and the future day is Saturday");
			}
			
		} // end of first if day 0
		else if (today == 1) {
			if (math == 0) {
				System.out.println("Today is Monday and the future day is Sunday");
			}
			else if (math==1) {
				System.out.println("Today is Monday and the future day is Monday");
			}
			else if (math==2) {
				System.out.println("Today is Monday and the future day is Tuesday");
			}
			else if (math==3) {
				System.out.println("Today is Monday and the future day is Wednesday");
			}
			else if (math==4) {
				System.out.println("Today is Monday and the future day is Thursday");
			}
			else if (math==5) {
				System.out.println("Today is Monday and the future day is Friday");
			}
			else if (math==6) {
				System.out.println("Today is Monday and the future day is Saturday");
			}
			
		} // end of second if day 1

		else if (today == 2) {
			if (math == 0) {
				System.out.println("Today is Tuesday and the future day is Sunday");
			}
			else if (math==1) {
				System.out.println("Today is Tuesday and the future day is Monday");
			}
			else if (math==2) {
				System.out.println("Today is Tuesday and the future day is Tuesday");
			}
			else if (math==3) {
				System.out.println("Today is Tuesday and the future day is Wednesday");
			}
			else if (math==4) {
				System.out.println("Today is Tuesday and the future day is Thursday");
			}
			else if (math==5) {
				System.out.println("Today is Tuesday and the future day is Friday");
			}
			else if (math==6) {
				System.out.println("Today is Tuesday and the future day is Saturday");
			}
			
		} // end of third if day 2
		else if (today == 3) {
			if (math == 0) {
				System.out.println("Today is Wednesday and the future day is Sunday");
			}
			else if (math==1) {
				System.out.println("Today is Wednesday and the future day is Monday");
			}
			else if (math==2) {
				System.out.println("Today is Wednesday and the future day is Tuesday");
			}
			else if (math==3) {
				System.out.println("Today is Wednesday and the future day is Wednesday");
			}
			else if (math==4) {
				System.out.println("Today is Wednesday and the future day is Thursday");
			}
			else if (math==5) {
				System.out.println("Today is Wednesday and the future day is Friday");
			}
			else if (math==6) {
				System.out.println("Today is Wednesday and the future day is Saturday");
			}
			
		} //end of third if day 3
		else if (today == 4) {
			if (math == 0) {
				System.out.println("Today is Thursday and the future day is Sunday");
			}
			else if (math==1) {
				System.out.println("Today is Thursday and the future day is Monday");
			}
			else if (math==2) {
				System.out.println("Today is Thursday and the future day is Tuesday");
			}
			else if (math==3) {
				System.out.println("Today is Thursday and the future day is Wednesday");
			}
			else if (math==4) {
				System.out.println("Today is Thursday and the future day is Thursday");
			}
			else if (math==5) {
				System.out.println("Today is Thursday and the future day is Friday");
			}
			else if (math==6) {
				System.out.println("Today is Thursday and the future day is Saturday");
			}
			
		} //end of fourth if day 4
		else if (today == 5) {
			if (math == 0) {
				System.out.println("Today is Friday and the future day is Sunday");
			}
			else if (math==1) {
				System.out.println("Today is Friday and the future day is Monday");
			}
			else if (math==2) {
				System.out.println("Today is Friday and the future day is Tuesday");
			}
			else if (math==3) {
				System.out.println("Today is Friday and the future day is Wednesday");
			}
			else if (math==4) {
				System.out.println("Today is Friday and the future day is Thursday");
			}
			else if (math==5) {
				System.out.println("Today is Friday and the future day is Friday");
			}
			else if (math==6) {
				System.out.println("Today is Friday and the future day is Saturday");
			}
			
		} //end of fifth if day 5
		else if (today == 6) {
			if (math == 0) {
				System.out.println("Today is Saturday and the future day is Sunday");
			}
			else if (math==1) {
				System.out.println("Today is Saturday and the future day is Monday");
			}
			else if (math==2) {
				System.out.println("Today is Saturday and the future day is Tuesday");
			}
			else if (math==3) {
				System.out.println("Today is Saturday and the future day is Wednesday");
			}
			else if (math==4) {
				System.out.println("Today is Saturday and the future day is Thursday");
			}
			else if (math==5) {
				System.out.println("Today is Saturday and the future day is Friday");
			}
			else if (math==6) {
				System.out.println("Today is Saturday and the future day is Saturday");
			}
			
		} //end of sixth day if day 6
		else {
			System.out.println("Invalid day");
		} //else
		
		input.close();

	}

}
