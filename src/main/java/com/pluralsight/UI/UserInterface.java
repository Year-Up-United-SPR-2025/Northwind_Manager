package com.pluralsight.UI;

import com.pluralsight.Color.ColorCodes;
import com.pluralsight.Data.NorthwindDataManager;
import com.pluralsight.Models.Category;
import com.pluralsight.Models.Employee;

import java.util.List;

public class UserInterface {

    private Employee currentEmployee;
    private Console console;
    private NorthwindDataManager dataManager;

    public UserInterface(NorthwindDataManager dataManager){
        this.console = new Console();
        this.dataManager = dataManager;
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

    private void showHomeMenu() {

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
        List<Category> categories = dataManager.getCategories();


    }
}