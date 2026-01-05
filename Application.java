package com.example.M3_Activity3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static Map<String, Integer> products = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        products.put("Laptop",50000);
        products.put("Monitor", 7000);
        products.put("Mouse", 500);
        products.put("Keyboard", 1000);
        products.put("Printer", 6000);
        products.put("Speaker", 200);

        do {
            displayMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    searchProduct(scanner);
                    break;

                case 2:
                    addProduct(scanner);
                    break;

                case 3:
                    printProducts();
                    break;

                case 4:
                    findCheapestProduct();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");

            }

        } while ( choice != 5 );

        scanner.close();


    }

    private static void displayMenu() {
        System.out.println("\n\nSelect an option");
        System.out.println("1. Search a product");
        System.out.println("2. Add a product");
        System.out.println("3. Print all products and count");
        System.out.println("4. Find the cheapest product");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void searchProduct(Scanner scanner) {
        System.out.println("\nEnter product name to search: ");
        String input = scanner.nextLine().trim().toLowerCase();
        boolean found = false;

        if (!products.isEmpty()) {
            for (Map.Entry<String, Integer> entry : products.entrySet()) {
                if (entry.getKey().toLowerCase().equals(input)) {
                    System.out.println("Product found! Price: " + entry.getValue());
                    found = true;
                    break;

                }
            }

            if (!found) {
                System.out.println("Product not found!");

            }
        } else {
            System.out.println("\nProduct list is empty. Please add a product");
        }

    } // end of search product


    private static void addProduct(Scanner scanner) {
        System.out.println("\nEnter the product you want to add: ");
        String inputName = scanner.nextLine();

        System.out.println("\nEnter the price: ");
        String inputPrice = scanner.nextLine();

        // check first if the input is empty or not
        if(!inputName.isEmpty() && !inputPrice.isEmpty()){
            products.put(inputName, Integer.parseInt(inputPrice) );
            System.out.println("Product added.");

        } else {
            System.out.println("Invalid input. Please try again.");
        }

    } // end of add product

    private static void printProducts() {
        if (!products.isEmpty()){
            System.out.println("All products: ");

            for (Map.Entry<String, Integer> entry : products.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());

            }

            System.out.println("Total unique products: " + products.size());

        } else {
            System.out.println("\nProduct list is empty. Please add a product");

        }

    } // end of print product


    private static void findCheapestProduct(){
        String cheapestProduct = null;
        int cheapestPrice = Integer.MAX_VALUE; // default value should be the highest int that can be stored

        // loop all product
        for (Map.Entry<String, Integer> entry : products.entrySet()) {

            // compare all prices from cheapestPrice
            if (entry.getValue() < cheapestPrice) {
                cheapestPrice = entry.getValue();
                cheapestProduct = entry.getKey();

            }

        }

        System.out.println("Cheapest product: " + cheapestProduct + " - " + cheapestPrice);

    } // end of find cheapest product

}