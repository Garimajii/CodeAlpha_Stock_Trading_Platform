package mypack;
import java.util.HashMap;
import java.util.Map;


class TradingPlatform123 {
    Map<String, StockData> marketData;
    PortfolioTracker portfolio;

    public TradingPlatform123() {
        marketData = new HashMap<>();
        portfolio = new PortfolioTracker();
    }

    public void addMarketData(StockData stock) {
        marketData.put(stock.symbol, stock);
    }

    public void buyStock(String symbol, int quantity) {
        StockData stock = marketData.get(symbol);
        if (stock == null) {
            System.out.println("Stock not found for "+quantity);
            return;
        }
        portfolio.addStock(stock, quantity);
    }

    public void sellStock(String symbol, int quantity) {
        StockData stock = marketData.get(symbol);
        if (stock == null) {
            System.out.println("Stock not found for "+quantity);
            System.out.println();
            return;
        }
        portfolio.removeStock(stock, quantity);
    }

    public void printMarketData() {
        System.out.println("Market Data:");
        System.out.println();
        for (StockData stock : marketData.values()) {
            System.out.println(stock.symbol + ": " + stock.price);
        }
    }

    public void printPortfolio() {
        portfolio.printPortfolio();
    }
}

