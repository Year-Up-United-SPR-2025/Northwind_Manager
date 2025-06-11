package com.pluralsight.UI;

import com.pluralsight.Color.ColorCodes;
import com.pluralsight.Models.Employee;

public class User_Interface {

    private Employee currentEmployee;
    private Console console;

    public User_Interface(){
        this.console = new Console();
    }


    public  void display(){
        System.out.println("Welcome to the Northwind Manager!");
        currentEmployee = loginUser();
        System.out.println("Welcome, " + this.currentEmployee.getFirstName() + "!");


        showHomeMenu();
    }


    private Employee loginUser(){
        String s = console.promptForString("Just hit enter to login as Matt", true);
        Employee e = new Employee(1, "Matt", "Christenson");
        return e;
    }

    private void showHomeMenu(){



        while(true){

            String[] menuOptions = {
                    "list product categories",
                    "list all products",
                    "list products by category",
                    "list products by price",
                    "list all suppliers",
                    "list products by supplier",
                    "exit"
            };

            int userChoice = console.promptForOption(menuOptions);
            switch (userChoice){
                case 1:
                    listCategoriesAll();
                    break;
                case 2:
                    listProductsAll();
                    break;
                case 3:
                    listProductsByCategory();
                    break;
                case 4:
                    listProductsByPrice();
                    break;
                case 5:
                    listSuppliersAll();
                    break;
                case 6:
                    listProductsBySupplier();
                    break;
                case 7:
                    System.exit(0);
            }
        }

    }

    private void listProductsBySupplier() {
    }

    private void listSuppliersAll() {
    }

    private void listProductsByPrice() {
    }

    private void listProductsByCategory() {
    }

    private void listProductsAll() {
    }

    private void listCategoriesAll() {
    }
}