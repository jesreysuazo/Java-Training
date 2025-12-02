public class ActivityFive {

    public static void main(String[] args) {
        int result = getSum();

        System.out.println("Sum = " + result);

    } // end of main

    /*
    Method for getting sum
     */
    public static int getSum() {
        int sum = 0;

        for (int i = 1; i <= 50; i++) {
            sum += i;
        }

        return sum;

    } // end of method getSum

} // end of class