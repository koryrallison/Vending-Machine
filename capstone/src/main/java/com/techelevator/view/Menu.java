package com.techelevator.view;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.io.InputStream;
import java.io.OutputStream;

public class Menu {

    private VendingMachine vendingMachine = new VendingMachine();
    VendingMachine vM800 = new VendingMachine();
    public Map<String, Item> duplicateMap = VendingMachine.getInventoryMap();

    private PrintWriter out;
    private Scanner in;

    public Menu(){

    }

    public Menu(InputStream input, OutputStream output){
        this.out = new PrintWriter(output);
        this.in = new Scanner(input);
    }

    public Object getOptionChoice(Object[] options){
        Object choice = null;
        while(choice == null){
            mainMenu();
            choice = getUserInput(options);
        }
        return choice;
    }

    private Object getUserInput(Object[] options) {
        Object choice = null;
        String userInput = in.nextLine();
        try {
            int userSelected = Integer.parseInt(userInput);
            if (userSelected > 0 && userSelected <= options.length) {
                choice = options[userSelected - 1];
            }

        } catch (NumberFormatException e) {

        }

        if (choice == null) {
            out.println(System.lineSeparator() + "*** " + userInput + " is not a valid option ***" +
                    System.lineSeparator());
        }
        return choice;
    }

    public void mainMenu() {
        System.out.println("MAIN MENU");
        System.out.println(">> (1) - Display Vending Machine Items");
        System.out.println(">> (2) - Purchase");
        System.out.println(">> (3) - Exit");
        System.out.println("---------------------------------------");
    }

    public void purchaseMenu() {
        System.out.println("---------------------------------------");
        System.out.println("PURCHASE MENU");
        System.out.println("1: Feed Money");
        System.out.println("2. Select Product");
        System.out.println("3. Finish Transaction");
        System.out.println("---------------------------------------");
        System.out.println("Current Money Provided: ");
    }

    public void secretMenu() {
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Secret Menu!");
        System.out.println("---------------------------------------");
        System.out.println(">> (1) Get Sales Report");
    }


}
