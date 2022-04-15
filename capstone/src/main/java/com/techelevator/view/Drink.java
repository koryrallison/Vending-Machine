package com.techelevator.view;

public class Drink extends Item{
    public static int drinkSold;

    public Drink(String name, String location, double price){
        super(name, location, price);
        drinkSold++;
    }

    @Override
    public String playSound(){
        return "Slurp Slurp, Yum!";
    }
}
