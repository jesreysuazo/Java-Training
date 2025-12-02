import java.util.Scanner;

public class ActivityThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first int: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second int: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + getSum(num1, num2));
        System.out.println("Difference: " + getDifference(num1, num2));
        System.out.println("Product: " + getProduct(num1, num2));

    } // end of main


    // helper methods
    private static int getSum(int a, int b) {
        return a + b;

    }

    private static int getDifference(int a, int b) {
        return a - b;

    }

    private static int getProduct(int a, int b) {
        return a * b;

    }

} // end of class