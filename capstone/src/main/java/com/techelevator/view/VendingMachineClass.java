package com.techelevator.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMachineClass implements VendingMachine {



    /**
     * csvFilePath intakes the CSV file which holds all product key value pairs
     *
     */

    @Override
    public void displayItems() {
        String csvFilePath = "./capstone/vendingmachine.csv";
        String vmLine = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
            while ((vmLine = reader.readLine()) != null) {
                System.out.println(vmLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getUserInput(){
        Scanner scanner = new Scanner(System.in);
        int userMenuChoice = 0;
        boolean repeat = true;

        while (repeat) {
            try {
                System.out.print("Choose menu option:  ");
                userMenuChoice = scanner.nextInt();
                if (userMenuChoice > 0 && userMenuChoice <= 4) {
                    repeat = false;
                } else {
                    System.out.println("Must be 1, 2, or 3");
                    repeat = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Must be 1, 2, or 3");
                scanner.next();
                repeat = true;
            }
        }
        //System.out.println(userMenuChoice);
        return userMenuChoice;

    }
}

