import java.util.Scanner;

public class LotteryGame {
    /**
     * Generate a lottery of a three digit number. The program prompts the user to enter a three-digit number and
     * determines whether the user wins according to the following rules:
     * 1. If the user input matches the lottery number in the exact order, the award is
     * $10,000.
     * 2. If all digits in the user input match all digits in the lottery number, the award is
     * $3,000.
     * 3. If one digit in the user input matches a digit in the lottery number, the award is
     * $1,000.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3-digit number to WIN!: ");
        int number = scanner.nextInt();

        int winNumber = (int) ((Math.random() * 1000) +100);
        int testWinNumber = winNumber;
        int lastWinDigit = testWinNumber % 10;
        testWinNumber /= 10;
        int centerWinDigit = testWinNumber % 10;
        testWinNumber /= 10;
        int firstWinDigit = testWinNumber;


        int testNumber = number;
        int lastDigit = testNumber % 10;
        testNumber /= 10;
        int centerDigit = testNumber % 10;
        testNumber /= 10;
        int firstDigit = testNumber;

        if ((firstDigit == firstWinDigit) && (centerDigit == centerWinDigit) && (lastDigit == lastWinDigit )){
            System.out.println("YOU WON $10,000");
        }
        if ((firstDigit == firstWinDigit) || (firstDigit == centerWinDigit) || (firstDigit == lastWinDigit)
                || (centerDigit == firstWinDigit) || (centerDigit == centerWinDigit) || (centerDigit == lastWinDigit)
                || (lastDigit == firstWinDigit) || (lastDigit == centerWinDigit) || (lastDigit == lastWinDigit)){
            System.out.println("YOU WON $1,000");

        }
        if ((firstDigit == firstWinDigit) || (firstDigit == centerWinDigit) || (firstDigit == lastWinDigit)
                || (centerDigit == firstWinDigit) || (centerDigit == centerWinDigit) || (centerDigit == lastWinDigit)
                || (lastDigit == firstWinDigit) || (lastDigit == centerWinDigit) || (lastDigit == lastWinDigit)){

        }




    }
}
