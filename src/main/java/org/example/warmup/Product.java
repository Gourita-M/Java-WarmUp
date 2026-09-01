package org.example.warmup;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        if(price < 0){
            this.price = 0.0;
        }else{
            this.price = price;
        }
        if(stock < 0){
            this.stock = 0;
        }else{
            this.stock = stock;
        }
 
        this.name = name;
        
    }

    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getStock()
    {
        return stock;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }

    public void showInfo() {
        System.out.println("Product: " + name);
        System.out.println("Prince: " + price);
    }

    public void applyDiscount(double percentage)
    {
        double discount = this.price * percentage / 100 ;
        this.price = this.price - discount; 
    }
    public void sell(int quantity)
    {
        if(quantity > this.stock){
            System.out.println("Sorry We don't have This Amount");
        }else{
            this.stock -= quantity;
        }
    }
    public boolean isAvailable()
    {
        if(this.stock <= 0){
            return false;
        }else{
            return true;
        }
    }
}
