import java.util.Scanner; //import scanner object

// Calculator.java
// Zach Smith 8/16/22
// Warm Up Exercise for CIT-63

// Gets two integer inputs and displays the sum, product, and largest integer
public class Calculator { //class declaration

    public static void main(String args[]) { //main method

        System.out.println("Please enter two integers"); //prompt for user input

        Scanner userInput = new Scanner(System.in); //initialize the scanner object

        int num1 = userInput.nextInt(); //get the user input, storing it in the integers
        int num2 = userInput.nextInt();

        int sum = num1 + num2; //declare and assign the sum and product
        int product = num1 * num2;


        System.out.println("The sum of the two numbers is " + sum); //display the results
        System.out.println("The product of the two numbers is " + product);

        if (num1 >= num2) { //if num1 is greater than or equal num2, display it
            System.out.println("The largest of the two numbers is " + num1);
        } else { //else display num2
            System.out.println("The largest of the two numbers is " + num2);
        }

    }

}
