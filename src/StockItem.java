
/**
 * A class representing an item in stock in some sort
 * of inventory system
 */
public class StockItem {
    //TODO: add fields for a: name, stockNumber, price, units.
    private String name;
    private int stockNumber;
    private double price;
    private int units;
    
    //TODO: create a constructor that takes name, stockNumber and price as arguments
    // and sets units to 0.
    public StockItem(String name, int stockNumber, double price) {
        this.name = name;
        this.stockNumber = stockNumber;
        this.price = price;
        this.units = 0;
    }
    
    //TODO: create accessor ("getter") methods for price, stock number and name.
    public String getName() {
        return this.name;
    }

    public int getStockNumber() {
        return this.stockNumber;
    }

    public double getPrice() {
        return this.price;
    }
    
    //TODO: create a method increaseTotalStock that increases units by a given quantity.
    public void increaseTotalStock(int quantity) {
        this.units += quantity;
    }
    
    //TODO:create a mutator ("setter") method setPrice that sets price to a given amount. 
    public void setPrice(double price) {
        this.price = price;
    }
    
    //TODO: create a method calculateTotalPrice that returns the total price of the current inventory
    // (Calculated as current price * number of units)
    public double calculateTotalPrice() {
        double totalPrice = (this.price * this.units);
        return totalPrice;
    }
    
    
}
