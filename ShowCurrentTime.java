public class ShowCurrentTime {

    /** America clock */
    public static void main(String[] args) {
        //Obtain the total miliseconds since midnight
        long totalMilliseconds = System.currentTimeMillis();

        //Obtainn the total seconds since midnight
        long totalSeconds = totalMilliseconds / 60;

        //Compute the current seconds in minute in the hour
        long currentSecond = totalSeconds % 60;

        //Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        //Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        //Obtain the total hours
        long totalHours = totalMinutes / 60;

        //Compute the current hour
        long currentHour = totalHours % 24;

        //Display
        System.out.println("Current time is "+currentHour +":"+currentMinute+":"+currentSecond);
        System.out.println(totalMilliseconds);
    }
}
