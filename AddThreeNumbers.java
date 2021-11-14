import java.util.Scanner;

public class AddThreeNumbers {
    /**
     * Revise the program to generate three single-digit integers and prompt the user to
     * enter the sum of these three integers.
     * */

    public static void main(String[] args) {
        int numberOne = (int) (Math.random() * 10);
        int numberTwo = (int) (Math.random() * 10);
        int numberThree = (int) (Math.random() * 10);

        int sum = numberOne + numberTwo + numberThree;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Here are three random numbers " +numberOne+", "+numberTwo+", "+numberThree);
        System.out.print("What is the Sum of these numbers: ");
        int inputSum = scanner.nextInt();

        if (inputSum != sum){
            System.out.println("Wrong the Sum is "+sum);
        }else {
            System.out.println("Well done.");
        }

    }
}
