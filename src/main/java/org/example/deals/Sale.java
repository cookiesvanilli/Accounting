package org.example.deals;

public class Sale extends Deal {
    public String productName;
    public int price;

    public Sale(String productName, int price) {
        super("Sale of " + productName + " for " + price + " RUB", 0, price);
        this.productName = productName;
        this.price = price;
    }

}
