import java.util.Scanner;

public class QuadraticEquations {
    /**
     * Write a program that prompts the user to enter values for a, b, and c and displays
     * the result based on the discriminant. If the discriminant is positive, display two
     * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
     * has no real roots”.
     * */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double root = Math.sqrt(Math.pow(b,2) - 4 * a * c);
        double rootTest = Math.pow(b,2) - 4 * a * c;

        double result1 =  (-b + root)/ 2 * a;
        double result2 = (-b - root)/ 2 * a;

        if (rootTest < 0){
            System.out.println("The quation has no real roots");
        }else if (rootTest == 0){
            System.out.println("The equation has one root "+result1);
        }else {
            System.out.println("The equation has two roots "+result1 +" and "+result2);
        }
    }
}
