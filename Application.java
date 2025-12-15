import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
    static Set<String> products = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        products.add("Laptop");
        products.add("Monitor");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Printer");

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
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while ( choice != 4 );

        scanner.close();


    }

    private static void displayMenu() {
        System.out.println("\n\nSelect an option");
        System.out.println("1. Search a product");
        System.out.println("2. Add a product");
        System.out.println("3. Print all products and count");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
      
    }

    private static void searchProduct(Scanner scanner) {
        String input = scanner.nextLine().trim().toLowerCase();
        boolean found = false;

        // check first if the products set is empty
        if(!products.isEmpty()){

            // loop all products on set to check for a match
            for (String product : products) {
                if (product.toLowerCase().equals(input)) {
                    System.out.println("Product found: " + product);
                    found = true;
                    break;
                }
            }

            // print if no input matches a product
            if (!found) {
                System.out.println("Product not found");
            }

        } else {
            System.out.println("\nProduct list is empty. Please add a product");

        }


    } // end of search product

    private static void addProduct(Scanner scanner) {
        System.out.println("\nEnter the product you want to add: ");

        String input = scanner.nextLine();

        // check first if the input is empty or not
        if(!input.isEmpty()){
            products.add(input);
            System.out.println("Product added.");

        } else {
            System.out.println("Invalid input. Please try again.");
        }

    } // end of add product

    private static void printProducts() {
        if (!products.isEmpty()){
            System.out.println("All products: ");

            for (String product: products){
                System.out.println(product);
            }

            System.out.println("Total unique products: " + products.size());

        } else {
            System.out.println("\nProduct list is empty. Please add a product");

        }

    } // end of print product


}
