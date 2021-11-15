import java.util.Scanner;

public class RPSGAME {
    /**
     *  The program randomly generates a number 0, 1, or 2 representing
     * scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
     * 2 and displays a message indicating whether the user or the computer wins, loses,
     * or draws
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int randomPick =  (int) (Math.random() * 3);

        System.out.println("0-Rock, 1-Papper, 2-Scissor");
        System.out.print("Choose:");

        int playerPick = scanner.nextInt();
        if (randomPick == 0 && playerPick == 0){
            System.out.println("Rock - Rock, No Winner");
        }
        if (randomPick == 0 && playerPick == 1){
            System.out.println("Rock - Papper, You WON!!!");
        }
        if (randomPick == 0 && playerPick == 2){
            System.out.println("Rock - Scissor, You LOST!!!");
        }

        if (randomPick == 1 && playerPick == 0){
            System.out.println("Papper - Rock, You LOST!!");
        }
        if (randomPick == 1 && playerPick == 1){
            System.out.println("Papper - Papper, No Winner");
        }
        if (randomPick == 1 && playerPick == 2){
            System.out.println("Papper - Scissor, You WON!!!");
        }

        if (randomPick == 2 && playerPick == 0){
            System.out.println("Scissor - Rock, You WON!!!");
        }
        if (randomPick == 2 && playerPick == 1){
            System.out.println("Scissor - Papper, You WON!!!");
        }
        if (randomPick == 2 && playerPick == 2){
            System.out.println("Scissor - Scissor, No Winner");
        }
    }
}
