package toolBox;

import finance.Stock;

public class toolBox {

public static void main(String[] args) {
		
		/***** Empty stock : test default (no-arg) constructor ****/
		Stock empty = new Stock(); //No-arg constructor
		System.out.println("Empty STOCK (testing no-arg constructor)...\n"); 
		System.out.print("Get name for empty stock:  " + empty.getName());		 
		System.out.println("\nGet previous closing price set for Microsoft stock: " + empty.getPreviousClosingPrice());
		System.out.println("Get current closing price set for Microsoft stock: " + empty.getCurrentPrice());		
		System.out.printf("Percentage change in empty stock price: %.2f", empty.getChangePercent());
		
		/***** Oracle stock ****/	
		System.out.println("\n\nORACLE STOCK...");	
		//public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) 
		Stock oracle = new Stock ("ORCL", "Oracle Corporation", 34.5, 34.35);	
		//test getSymbol()
		System.out.printf("\nSymbol for Oracle stock price: %s", oracle.getSymbol());							
		//test getName()  
		System.out.print("\nGet name for Oracle stock:  " + oracle.getName());
		System.out.printf("\nPercentage change in Oracle stock price: %.2f", oracle.getChangePercent());
		
		
		/**** Microsoft stock ****/
		System.out.println("\n\nMICROSOFT STOCK...\n");
		Stock microsoft = new Stock();
		//test setSymbol(String symbol) 
		System.out.print("Set symbol for Microsoft stock price to \"MSFT\"");
		microsoft.setSymbol("MSFT");	
		//test setName(String name) 
		System.out.print("\nSet name for Microsoft stock to \"Miscrosoft Corporation\"");
		microsoft.setName("Miscrosoft Corporation");
		//test getName()	
		System.out.print("\nGet name for Microsoft stock:  " + microsoft.getName());		
		//test setPreviousClosingPrice(double previousClosingPrice) 		
		System.out.println("\nSet previous closing price for Microsoft stock to 50");
		microsoft.setPreviousClosingPrice(50.00);
		//test getPreviousClosingPrice() 
		System.out.println("Get previous closing price set for Microsoft stock: " + microsoft.getPreviousClosingPrice());
		//test setCurrentPrice(double currentPrice) 	 		 
		System.out.print("Set current closing price for Microsoft stock to 111.00"); //actual price 10/16/2018!
		microsoft.setCurrentPrice(111.00);
		//test getCurrentPrice()
		System.out.println("\nGet current closing price set for Microsoft stock: " + microsoft.getCurrentPrice());		
		System.out.printf("Percentage change in Microsoft stock price: %.2f", microsoft.getChangePercent());
		
	}
}
