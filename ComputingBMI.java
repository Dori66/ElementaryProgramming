import java.util.Scanner;

public class ComputingBMI {
    /**
     *  Write a program that prompts the
     * user to enter a weight in pounds and height in inches and displays the BMI. Note
     * that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        System.out.println("Enter height in inches: ");
        double heightInInches = scanner.nextDouble();

        //0.45359237 kilograms is 1 pound
        // 0.0254 meters is 1 inch

        double kilogramRate = 0.45359237;
        double meterRate = 0.0254;
        double kilograms = weightInPounds * kilogramRate;
        double meters = heightInInches * meterRate;
        double BMI = kilograms / Math.pow(meters,2);

        System.out.println("BMI is "+BMI);

    }
}
