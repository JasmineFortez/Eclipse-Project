package breakout;

public class breakoutsession02 {

	public static void main(String[] args) {
		Boolean boolVariable = true;
		char charVariable = 'W';
		int intVariable = 99;
		double doubleVariable = 12.3456;
		String stringValue1 = "Hello Marin";
		String stringValue2 = "Hello Marin";
		int jackpot = 1600000000; //1.6 billions
		
		System.out.printf("boolVariable\t>>%b\n", boolVariable);
		System.out.printf("charVariable\t>>%5c\n", charVariable);
		System.out.printf("intVariable\t>>%5d\n", intVariable);
		System.out.printf("doubleVariable\t>>%10.3f\n", doubleVariable);
		System.out.printf("stringVariable\t>>%-15s\n", stringValue1);
		System.out.printf("stringVariable\t>>%15s\n", stringValue2);
		System.out.printf("jackpot>>\t%,d\n", jackpot);
	}

}
