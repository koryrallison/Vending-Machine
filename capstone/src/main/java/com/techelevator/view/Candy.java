package com.techelevator.view;

public class Candy extends Item{

    public static int candySold;

    public Candy(String name, String location, double price){
        super(name, location, price);
        candySold++;
    }

    @Override
    public String playSound(){
        return "Munch Munch, Yum!";
    }

}
