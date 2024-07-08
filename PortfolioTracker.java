package mypack;
import java.util.HashMap;
import java.util.Map;



class PortfolioTracker {
    Map<String, Integer> stocks;
    double value;

    public PortfolioTracker() {
        stocks = new HashMap<>();
        value = 0.0;
    }

    public void addStock(StockData stock, int quantity) {
        stocks.put(stock.symbol, quantity);
        value += stock.price * quantity;
    }

    public void removeStock(StockData stock, int quantity) {
        int currentQuantity = stocks.getOrDefault(stock.symbol, 0);
        if (currentQuantity < quantity) {
            System.out.println("Insufficient quantity for "+stock.symbol);
            System.out.println();
            return;
        }
        stocks.put(stock.symbol, currentQuantity - quantity);
        value -= stock.price * quantity;
    }

    public void printPortfolio() {
        System.out.println("Portfolio:");
        System.out.println();
        for (Map.Entry<String, Integer> entry : stocks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
           
        }
        System.out.println("Value: " + value);
    }
}

