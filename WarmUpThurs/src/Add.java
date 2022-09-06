import java.util.Scanner;

public class Add {

    public static void main(String args[]) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter an integer to check whether it is even or odd:");

        int number = myScanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }

}