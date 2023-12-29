package BreakoutSession;

public class Session02 {

	public static void main(String[] args) {

		long numOfMillisecondsSinceUnixEpoch = System.currentTimeMillis();
		double numOfSecs = 0;
		double numOfMins = 0;
		double numOfHours = 0;
		double numOfDays = 0;
		double numOfYears = 0;
		
		numOfSecs =  numOfMillisecondsSinceUnixEpoch / 1000;
		numOfMins =  numOfSecs / 60;
		numOfHours = numOfMins / 60;
		numOfDays = numOfHours / 24;
		numOfYears = numOfDays / 365.25;
		
		System.out.println("Number of milliseconds since UNIX Epoch: " + numOfMillisecondsSinceUnixEpoch);
		System.out.println("Number of seconds since UNIX Epoch: " + numOfSecs);
		System.out.println("Number of minutes since UNIX Epoch: " + numOfMins);
		System.out.println("Number of hours since UNIX Epoch: " + numOfHours);
		System.out.println("Number of days since UNIX Epoch: " + numOfDays);
		System.out.println("Number of years since UNIX Epoch: " + numOfYears);		
	}

}
