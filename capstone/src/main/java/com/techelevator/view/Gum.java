package com.techelevator.view;

public class Gum extends Item{

    private static int gumSold;

    public Gum(String name, String location, double price){
        super(name, location, price);
        gumSold++;
    }

    @Override
    public String playSound(){
        return "Chew Chew, Yum!";
    }
}
