import java.util.Scanner;

public class NumberOfYears {
    /**
     * Write a program that prompts the user to enter the
     * minutes (e.g., 1 billion), and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of minutes");
        long number = scanner.nextLong();

        int totalHoursOfYear = 365 * 24;
        int hours = (int) (number / 60);
        int years = hours / totalHoursOfYear;
        int days =  ((hours % totalHoursOfYear) / 24);
        System.out.println(number+" minutes is "+years+" years and "+days+" days");
    }
}
