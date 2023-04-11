package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Bank vietcombank = new Bank("Vietcombank");
        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;
        System.out.printf("""
                ======== Welcome to %s App ========
                1. Add a new customer
                2. Add a transaction
                3. View a customer
                4. Quit%n""", vietcombank.getName());
        while(!isQuit) {
            System.out.print("Please select a menu: (1 - 4): ");
            String select = scanner.nextLine().trim();
            switch (select) {
                case "1" -> {
                    System.out.println("-------- Add a new customer --------");
                    System.out.print("Enter customer name: ");
                    String input = scanner.nextLine().trim();
                    vietcombank.addCustomer(input);
                }
                case "2" -> {
                    System.out.println("-------- Add a transaction --------");
                    System.out.print("Enter sender name: ");
                    String senderName = scanner.nextLine().trim();
                    System.out.print("Enter receiver name: ");
                    String receiverName = scanner.nextLine().trim();
                    System.out.print("Enter amount ($): ");
                    double amount = Double.parseDouble(scanner.nextLine().trim());
                    vietcombank.addTransaction(senderName, receiverName, amount);
                }
                case "3" -> {
                    System.out.println("-------- View a customer --------");
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine().trim();
                    vietcombank.printCustomer(name);
                }
                case "4" -> {
                    isQuit = true;
                }
            }
        }
    }
}

class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>(5000);
    }

    public String getName() {
        return name;
    }

    public void addCustomer(String name) {
        var customer = findCustomer(name);
        if (customer == null) {
            customer = new Customer(name);
            customers.add(customer);
            System.out.println("Added successfully: " + customer);
            return;
        }
        System.out.println("Added failed: Customer is already existed");
    }

    public void addTransaction(String senderName, String receiverName, double amount) {
        var sender = findCustomer(senderName);
        var receiver = findCustomer(receiverName);

        // Validate the sender and the receiver
        if (sender == null) {
            System.out.println("Transaction failed: Sender not found");
            return;
        }
        if (receiver == null) {
            System.out.println("Transaction failed: Receiver not found");
            return;
        }

        // Processing the transaction
        sender.debit(amount);
        receiver.credit(amount);
        System.out.println("Transaction successfully");
    }

    public void printCustomer(String name) {
        var customer = findCustomer(name);
        if (customer == null) {
            System.out.println("Print failed: Customer not found");
            return;
        }
        System.out.println(customer);
    }

    private Customer findCustomer(String name) {
        for (var c : customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }


}

class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<>(500);
    }

    public String getName() {
        return name;
    }

    public void credit(double amount) {
        transactions.add(amount);
    }

    public void debit(double amount) {
        transactions.add(-amount);
    }

    @Override
    public String toString() {
        return String.format("Name = %s, transactions = %s", name, transactions.toString());
    }
}
