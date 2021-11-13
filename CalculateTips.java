import java.util.Scanner;

public class CalculateTips {
    /**
     *  Write a program that reads the subtotal
     * and the gratuity rate, then computes the gratuity and total. For example, if the
     * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
     * as gratuity and $11.5 as total.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double rate = scanner.nextDouble();

        double tips = (subtotal * rate) / 100.0;
        double totalBill = tips + subtotal;

        System.out.println("The gratuity is $"+tips+" and total is $"+totalBill);
    }
}
