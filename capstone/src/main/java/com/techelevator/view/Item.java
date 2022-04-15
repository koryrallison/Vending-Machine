package com.techelevator.view;

public class Item {

    private String productName;
    private String productLocation;
    private double price;
    private int amtAvailable = 5;

    /**
     * Building two constructors
     * one an Empty Item constructor
     * the second is loaded constructor that accepts
     * name, location in machine, and price
     */

    public Item(){

    }

    public Item(String productName,
                String productLocation,
                double price){
        this.productName = productName;
        this.productLocation = productLocation;
        this.price = price;

    }

    public String getProductName() {
        return productName;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public double getPrice() {
        return price;
    }

    public int getAmtAvailable() {
        return amtAvailable;
    }

    public void sellItem(){
        this.amtAvailable -= 1;
    }

    public String playSound(){
        return "";
    }
}
