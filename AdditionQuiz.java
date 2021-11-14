import java.util.Scanner;

public class AdditionQuiz {
    /**
     * Generate an addition question with two integers less than 100.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = (int) (Math.random() * 101);
        int numberTwo = (int) (Math.random() * 101);

        System.out.print("How much is "+ numberOne +" + "+numberTwo+" = ");
        int result = scanner.nextInt();
        if (result == (numberOne + numberTwo)){
            System.out.println("Well done");
        }else {
            System.out.println("Wrong result");
        }
    }
}
