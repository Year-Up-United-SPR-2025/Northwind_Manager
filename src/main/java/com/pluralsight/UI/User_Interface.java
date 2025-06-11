package com.pluralsight.UI;

import com.pluralsight.Models.Employee;

public class User_Interface {

    Employee currentEmployee;
    private Console console;

    public User_Interface() {
        this.console = new Console();
    }

    public void display() {
        System.out.println("Welcome to the Northwind Database");
        currentEmployee = loginUser();
        System.out.println("Welcome, " + this.currentEmployee.getFirstName() + "!");

        showHomeMenu();
    }

    private Employee loginUser() {
        String s = console.promptForString("Just hit enter to login", true);
        Employee e = new Employee(1, "Matt", "Chris");
        return e;
    }

    private void showHomeMenu() {
        System.out.println("Home Menu Here");
    }
}
