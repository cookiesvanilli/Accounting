package org.example.deals;

public class Expenditure extends Deal {
    public String productName;
    public int price;

    public Expenditure(String productName, int price) {
        super("Purchase " + productName + " for " + price + " RUB", price, 0);
        this.productName = productName;
        this.price = price;
    }
}
