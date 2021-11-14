import java.util.Scanner;

public class FutureDays {
    /**
     * Write a program that prompts the user to enter an integer for
     * today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
     * prompt the user to enter the number of days after today for a future day and display the future day of the week.
     * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter today's day: ");
        int day = scanner.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int futureDay = scanner.nextInt();

       if (day == 1){
           if (futureDay == 1){
               System.out.println("Today is Monday and the future day is Tuesday");
           }else if (futureDay == 2){
               System.out.println("Today is Monday and the future day is Wednesday");
           }else if (futureDay == 3){
               System.out.println("Today is Monday and the future day is Thursday");
           }else if (futureDay == 4){
               System.out.println("Today is Monday and the future day is Friday");
           }else if (futureDay == 5){
               System.out.println("Today is Monday and the future day is Saturday");
           }else if (futureDay == 6){
               System.out.println("Today is Monday and the future day is Sunday");
           }
       }else if (day == 2){
           if (futureDay == 1){
               System.out.println("Today is Tuesday and the future day is Wednesday");
           }else if (futureDay == 2){
               System.out.println("Today is Tuesday and the future day is Thursday");
           }else if (futureDay == 3){
               System.out.println("Today is Tuesday and the future day is Friday");
           }else if (futureDay == 4){
               System.out.println("Today is Tuesday and the future day is Saturday");
           }else if (futureDay == 5){
               System.out.println("Today is Tuesday and the future day is Sunday");
           }else if (futureDay == 6){
               System.out.println("Today is Tuesday and the future day is Monday");
           }
       }
    }
}
