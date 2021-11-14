import java.util.Scanner;

public class HeadOrTailGame {
    /**
     * Write a program that lets the user guess whether the flip of
     * a coin results in heads or tails. The program randomly generates an integer 0 or 1,
     * which represents head or tail. The program prompts the user to enter a guess and
     * reports whether the guess is correct or incorrect.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the coin, Tail(0) or Head(1)? : ");
        int guess = scanner.nextInt();

        int randomGuess = (int) (Math.random() * 2);

        if (guess == 0 && randomGuess ==0){
            System.out.println("ITS A TAIL, GREAT JOB!!!");
        }else if (guess ==  0 && randomGuess == 1){
            System.out.println("Its a Head, try again. ");
        }else if (guess == 1 && randomGuess == 1){
            System.out.println("ITS A HEAD, GREAT JOB!!!");
        }else if (guess == 1 && randomGuess == 0){
            System.out.println("Its a Tail, try again. ");
        }
    }
}
