package com.techelevator.view;

import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    BigDecimal moneyTotal = BigDecimal.valueOf(0);

    public static Map<String, Item> inventoryMap = new HashMap<>();

    public static Map<String, Item> getInventoryMap() {
        return inventoryMap;
    }

    Scanner sc = new Scanner(System.in);

    public Chip makeChip(String fileLine) {
        String[] itemInfo = fileLine.split("\\|");
        String location = itemInfo[0];
        String name = itemInfo[1];
        Double price = new Double(itemInfo[2]);
        String type = itemInfo[3];

        Chip chip = new Chip(name, location, price);
        return chip;
    }

    public void inventoryChip(String location, Chip chip) {
        inventoryMap.put(location, chip);
    }

    public Drink makeDrink(String fileLine) {
        String[] itemInfo = fileLine.split("\\|");
        String location = itemInfo[0];
        String name = itemInfo[1];
        Double price = new Double(itemInfo[2]);
        String type = itemInfo[3];

        Drink drink = new Drink(name, location, price);
        return drink;
    }

    public void inventoryDrink(String location, Drink drink) {
        inventoryMap.put(location, drink);
    }

    public Candy makeCandy(String fileLine) {
        String[] itemInfo = fileLine.split("\\|");
        String location = itemInfo[0];
        String name = itemInfo[1];
        Double price = new Double(itemInfo[2]);
        String type = itemInfo[3];

        Candy candy = new Candy(name, location, price);
        return candy;
    }

    public void inventoryCandy(String location, Candy candy) {
        inventoryMap.put(location, candy);
    }

    public Gum makeGum(String fileLine) {
        String[] itemInfo = fileLine.split("\\|");
        String location = itemInfo[0];
        String name = itemInfo[1];
        Double price = new Double(itemInfo[2]);
        String type = itemInfo[3];

        Gum gum = new Gum(name, location, price);
        return gum;
    }

    public void inventoryGum(String location, Gum gum) {
        inventoryMap.put(location, gum);
    }

    protected Map<String, Item> fillMachine() {

        try (Scanner fileInput = new Scanner(new File("/home/kory/Repos/Logical-Branching/TestMenu/vendingmachine.csv"))) {
            while (fileInput.hasNextLine()) {
                String line = fileInput.nextLine();
                String[] itemInfo = line.split("\\|");
                String location = itemInfo[0];
                String name = itemInfo[1];
                Double price = new Double(itemInfo[2]);
                String type = itemInfo[3];

                if (type.equals("Chip")) {
                    Chip chip = makeChip(line);
                    inventoryChip(location, chip);
                } else if (type.equals("Drink")) {
                    Drink drink = makeDrink(line);
                    inventoryDrink(location, drink);
                } else if (type.equals("Candy")) {
                    Candy candy = makeCandy(line);
                    inventoryCandy(location, candy);
                } else if (type.equals("Gum")) {
                    Gum gum = makeGum(line);
                    inventoryGum(location, gum);
                }


            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return inventoryMap;
    }

    public void displayItems() {

        String csvFilePath = "/home/kory/Repos/module-1-capstone/capstone/vendingmachine.csv";
        String vmLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
            while ((vmLine = reader.readLine()) != null) {
                System.out.println(vmLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
