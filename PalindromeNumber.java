import java.util.Scanner;

public class PalindromeNumber {
    /**
     * Write a program that prompts the user to enter a three-digit
     * integer and determines whether it is a palindrome number. A number is palindrome if it reads the same from right to left and from left to right.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit integer: ");
        int number = scanner.nextInt();

        int testNumber = number;
        int lastDigit = testNumber % 10; // 1
        testNumber /= 10; //12
        int centerDigit = testNumber % 10; //2
        testNumber /= 10;

        if (testNumber == lastDigit){
            System.out.println(number + " is palidrome");
        }else {
            System.out.println(number +" is not palindrome");
        }

    }
}
