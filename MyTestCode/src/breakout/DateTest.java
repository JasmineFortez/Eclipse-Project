package breakout;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		long time = 10000;
		
		for(long i = 0; i <= 8; i++) {
			Date myDate = new Date(time);
			System.out.printf("%s \n", myDate.toString());
			time *= 10;
		}
		
	

	}

}
