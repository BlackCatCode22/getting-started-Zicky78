import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {

        System.out.println("Please enter two numbers");

        Scanner userInputObj = new Scanner(System.in);

        int num1;
        int num2;

        num1 = userInputObj.nextLine();
        num2 = userInputObj.nextLine();

        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is " + sum);

        int product = num1 * num2;

        System.out.println("The sum of the two numbers is " + product);

        if(num1 > num2) {
            System.out.println("The largest of the two numbers is " + num1);
        } else {
            System.out.println("The largest of the two numbers is " + num2);
        }
    }
}
