import java.util.Scanner;

public class CelsiusToFahrenheit {
    /**
     * Write a program that reads a Celsius degree in
     * a double value from the console, then converts it to Fahrenheit and displays the
     * result.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Celsius degree: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32; // Formula to convert

        System.out.println(celsius+" Celsius is equal to "+ fahrenheit + " fahrenheit");
    }
}
