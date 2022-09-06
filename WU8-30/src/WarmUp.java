import java.util.Scanner;

public class WarmUp {

    static void newMethod(){

        System.out.println("This is a new method \n");

    }

    static int addTwoNumbers(int num1, int num2){

        int sum = num1 + num2;

        return sum;

    }

    static double addTwoNumbers(double num1, double num2){
        double sum = num1 + num2;

        return sum;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers to add together");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("The sum of the two numbers is: " + addTwoNumbers(num1, num2));

    }





}
