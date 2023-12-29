package Practice;

public class practices {

	public static void main(String[] args) {
		
		int i = 99;
		int newNum = i--;
		System.out.println(newNum);
		
		System.out.println((i % 3 == 0) ? 50 : 20 );
		
		System.out.println(false^false);
		
		System.out.println(Math.sin(Math.toRadians(30)));
		System.out.println(Math.toDegrees(Math.asin(0.5)));
		
		i = 1;
		while(i <10) {
			if ((i++) % 2 == 0) {
				//System.out.println(i);
			}
		}
		
		for (int j = 0; j < 3; ++j) {
			System.out.print(j);
		}
		
		String no = "no ";
		String yes = "no ";
		System.out.println(no.equals(yes));
		System.out.println(no == yes);
		char ch = 6;
		System.out.println(ch >= 'a');
		System.out.println(yes.length());

	}

	

}
