import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    static List<String> products = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        products.add("Laptop");
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("Printer");

        System.out.println("All products:");
        for (int i = 0; products.size() > i; i++){
            System.out.println( (i+1) + ". " +products.get(i));
        }

        products.add("Webcam");
        products.remove("Mouse");

        System.out.println("All products:");
        for (int i = 0; products.size() > i; i++){
            System.out.println( (i+1) + ". " +products.get(i));
        }



        System.out.println("Enter product name to search: ");

        String input = scanner.nextLine().trim().toLowerCase();

        boolean found = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).toLowerCase().equals(input)) {
                System.out.println("Product found: " + products.get(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found");
        }


    }

}
