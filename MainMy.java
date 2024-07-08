package mypack;

public class MainMy {
	// Main.java
	public static void main(String[] args) {
        TradingPlatform123 platform = new TradingPlatform123();

        // Add market data
        platform.addMarketData(new StockData("AAPL", 150.23, 2.5));
        platform.addMarketData(new StockData("GOOG", 2500.12, -1.2));
        platform.addMarketData(new StockData("AMZN", 3000.50, 3.1));

        // Buy and sell stocks
        platform.sellStock("AAPL",29);
        platform.buyStock("GOOG", 3);
        platform.sellStock("null",29);
        platform.buyStock("AMZN", 15);
        ;
        // Print market data and portfolio
        platform.printMarketData();
        System.out.println();
        platform.printPortfolio();
       
    }
}

	

