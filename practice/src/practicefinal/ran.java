package practicefinal;

public class ran {

	public static void main(String[] args) {
		int accumulate = 0;
	     for (int i = 0; i < 5; i++)
	     {
	          if (i % 2 == 0) 
	        	 continue;
		         accumulate += i;
	          
		         System.out.println(i+ " " + accumulate); 
	     }
	    // System.out.print(accumulate);
	     
	     Integer o = Integer.valueOf(90);
	     Integer j = Integer.valueOf("90");
	     System.out.println("compare: " + o.equals(j));
	     
	     Integer[] int1 = {1, 2, 3};
	     System.out.println(int1[0] + int1[1] + int1[2]);
	     System.out.println("length is: " + int1.length);
	}

}
