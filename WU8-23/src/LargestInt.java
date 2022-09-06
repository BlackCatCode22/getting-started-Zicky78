import java.util.Scanner;

public class LargestInt {

    public static void main(String args[]) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter three integers to find the largest one: \n");

        int num1 = myScanner.nextInt();
        int num2 = myScanner.nextInt();
        int num3 = myScanner.nextInt();

        int largestInt = 0;

        if (num1 >= num2 && num1 >= num3) {
            largestInt = num1;
        } else if (num2 >= num3) {
            largestInt = num2;
        } else {
            largestInt = num3;
        }

        System.out.println("\n The largest integer is: " + largestInt);

    }

}
