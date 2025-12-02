import java.util.Scanner;

public class ActivityTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your age: ");
        String input = scanner.nextLine();

        int ageInt = Integer.parseInt(input);
        double ageDouble =Double.parseDouble(input);


        System.out.println("Your age in int: " + ageInt);
        System.out.println("Your age in double: " + ageDouble);

        scanner.close();

    }// end of method

}