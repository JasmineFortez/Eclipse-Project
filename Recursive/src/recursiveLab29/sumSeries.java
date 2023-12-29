package recursiveLab29;

public class sumSeries {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			 
			 System.out.printf("m(%d), sum of series = %f\n", i, sumseries(i));
		}

	}
	public static double sumseries (int m) {
		
		if(m <= 1) {
			return 1;
		}
		else {
			
			return  1  / m + sumseries (m - 1); 
				 
		}
		
	}

}
