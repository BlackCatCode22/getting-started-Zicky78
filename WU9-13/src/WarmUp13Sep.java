import java.util.Scanner;

public class WarmUp13Sep {
    static void myMethodUsingArray01(){
        int num1 = 0;
        System.out.println("\n Hello from myMethodUsingArray01\n\n");
        String[] animals = {"lion", "tiger", "bear"};
        // Output the array of animals
        for (int i=0; i<3; i++) {
            System.out.println("\n in the for loop of myMethodUsingArray01 and..");
            System.out.println("and i = " + i);
            System.out.println("animal at element number " + i + " is " +
                    animals[i]);
        }

        // find the length of the array
        num1 = animals.length;
        // TODO: output the length of the array

        System.out.println("\n The length of the array is: " + num1);

        // TODO: use the length of the array in a loop control variable to output the animals array

        System.out.println("\n The animals in the array are: ");

        for (int i = 0; i < num1; i++) {
            System.out.println("\n" + animals[i]);
        }

        }
        static void myMethodUsingArray02(String animal01, String animal02){
            System.out.println("\n Hello from myMethodUsingArray02\n\n");
            System.out.println("\n animal01 is " + animal01 + "\n");
            System.out.println("\n animal02 is " + animal02 + "\n");
            String[] myNewArray = {animal01, animal02};
            // TODO: fill new array with animal01 and animal02 and output!

            System.out.println("\n The animals in the array are: ");

            for(int i = 0; i < myNewArray.length; i++) {
                System.out.println("\n" + myNewArray[i]);
            }
        }
        public static void main(String[] args){
            System.out.println("\n Welcome to Java WarmUp ");
            System.out.println("\n ======================= ");
            System.out.println("\n Tuesday September 13, 2022 ");
            // Create two methods that have arrays
            // References:
            // https://www.w3schools.com/java/java_methods.asp
            // https://www.w3schools.com/java/java_arrays.asp
            myMethodUsingArray01();
            myMethodUsingArray02("cat","dog");
        }


}
