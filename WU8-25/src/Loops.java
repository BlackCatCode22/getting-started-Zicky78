import java.util.Scanner;

public class Loops {

    public static void main(String args[]) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter two integers to find the product using loops:");

        int outerLoop = 0;
        int innerLoop = 0;

        int num1 = myScanner.nextInt();
        int num2 = myScanner.nextInt();

        int product = 0;

        while(outerLoop < num1) {

            while(innerLoop < num2) {
                product++;
                innerLoop++;
            }
            innerLoop = 0;
            outerLoop++;
        }

        System.out.println("The product of the two numbers is: " + product);

    }

}
