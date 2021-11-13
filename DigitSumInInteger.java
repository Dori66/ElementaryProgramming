import java.util.Scanner;

public class DigitSumInInteger {
    /**
     * Write a program that reads an integer between 0 and
     * 1000 and adds all the digits in the integer. For example, if an integer is 932, the
     * sum of all its digits is 14.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number betwen 0-99");
        int number = scanner.nextInt();
        int count = number % 10;//3 ,
        int count2 = number / 10; //9
        System.out.println(count + count2);




    }
}
