import java.util.Scanner;

public class ComputeAverage {
    /** gives an example of reading multiple input from the keyboard. The program
     reads three numbers and displays their average.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner

        System.out.print("Number one: ");
        int numberOne = scanner.nextInt();//Store number 1
        System.out.print("NumberTwo: ");
        int numberTwo = scanner.nextInt();// Store number 2
        System.out.print("NumberThree: ");
        int numberThree = scanner.nextInt(); // Store number 3

        double average = (numberOne + numberTwo + numberThree) /3.0; // Add them and divide by 3, then assign it to average variable
        System.out.println("The Average of number "+numberOne+", number "+numberTwo+" and number "+numberThree+" is "+average);


    }
}
