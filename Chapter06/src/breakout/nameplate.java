package breakout;

public class nameplate {

	public static void main(String[] args) {
		
		System.out.print( (char) ('A' + (int)( Math.random() * ( 'Z' -'A' + 1))));
		System.out.print((char) ('A' + (int) (Math.random() * ( 'Z' -'A' + 1))));
		System.out.print((char) ('A' + (int)( Math.random() * ( 'Z' -'A' + 1))));
		System.out.print(  (int) (Math.random() * ( '9' -'0' )));
		System.out.print(  (int) (Math.random() * ( '9' -'0' )));
		System.out.print(  (int) (Math.random() * ( '9' -'0' )));
		System.out.print(  (int) (Math.random() * ( '9' -'0' )));
	}

}
