import java.util.Scanner;

public class CalculatingEnergy {
    /**
     * Write a program that calculates the energy needed
     * to heat water from an initial temperature to a final temperature. Your program
     * should prompt the user to enter the amount of water in kilograms and the initial
     * and final temperatures of the water. The formula to compute the energy is
     * Q = M * (finalTemperature – initialTemperature) * 4184
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double kgOfWater = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();

        double Q = kgOfWater *(finalTemperature - initialTemperature) * 4184;
        System.out.println("The energy needed is "+Q);
    }
}
