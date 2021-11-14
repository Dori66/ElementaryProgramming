import java.util.Scanner;

public class SortThreeIntegers {
    /**
     *  Write a program that prompts the user to enter three integers
     * and display the integers in non-decreasing order.
     * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number: ");
        int numberOne = scanner.nextInt();
        System.out.println("Number: ");
        int numberTwo = scanner.nextInt();
        System.out.println("Number: ");
        int numberThree = scanner.nextInt();

        if ((numberOne < numberTwo) && (numberOne < numberThree)){
            if (numberTwo < numberThree){
                System.out.println(numberOne +" , "+numberTwo+" , "+numberThree);
            }else if (numberThree < numberTwo){
                System.out.println(numberOne +" , "+numberThree+" , "+numberTwo);
            }
        }else if ((numberTwo < numberThree) && (numberTwo < numberOne)){
            if (numberOne < numberThree){
                System.out.println(numberTwo +" , "+numberOne+" , "+numberThree);
            }else if (numberThree < numberOne){
                System.out.println(numberTwo +" , "+numberThree+" , "+numberOne);
            }
        }else {
            System.out.println(numberThree +" , "+numberTwo+" , "+numberOne);
        }
    }
}
