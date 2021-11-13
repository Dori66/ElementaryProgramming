import java.util.Scanner;

public class DisplayTime {
    /** obtains minutes and remaining seconds from an amount of time
     in seconds.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a integer for seconds: ");
        int seconds = scanner.nextInt();

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + " seconds is "+minutes+" minutes and "+remainingSeconds+ " seconds");
    }
}
