package finance;


public class Stock {
	
	
	public String symbol = "Not specified ";
	public String name = "Not specified";
	
	public double previousClosingPrice = 0.0;
	public double currentPrice = 0.0;
	
	public Stock(){}
	public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
		this.currentPrice = currentPrice;
	}
	
	public String getName () {
		return name;
	}
	public double getPreviousClosingPrice () {
		return previousClosingPrice;
	}
	public double getCurrentPrice () {
		return currentPrice;
	}
	public double getChangePercent () {
		return ((currentPrice - previousClosingPrice)/currentPrice) * 100; 
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol (String symbol) {
		this.symbol = symbol;
	}
	public void setName (String name) {
		this.name = name;
	}
	public void setPreviousClosingPrice (double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public void setCurrentPrice (double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
}
