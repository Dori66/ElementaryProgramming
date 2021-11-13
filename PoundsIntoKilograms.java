import java.util.Scanner;

public class PoundsIntoKilograms {
    /**
     * Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it
     * to kilograms, and displays the result. One pound is 0.454 kilograms.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value of pounds: ");
        double pounds = scanner.nextDouble();

        double kilogram = pounds * 0.454;

        System.out.println(pounds+" pounds are "+kilogram+" kilograms");
    }
}
