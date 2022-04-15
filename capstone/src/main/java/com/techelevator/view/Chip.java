package com.techelevator.view;

public class Chip extends Item{
    public static int chipsSold;

    public Chip(String name, String location, double price){
        super(name, location, price);
        chipsSold++;
    }

    @Override
    public String playSound(){
        return "Crunch Crunch, Yum!";
    }

}

