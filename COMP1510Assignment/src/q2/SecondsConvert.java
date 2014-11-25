package q2;
import java.util.Scanner;
/**
 * <p>Convert seconds to components of Hours, Minutes and Seconds. </p>
 *
 * @author Juven Ardine Hernanto Putra
 * @version 1.0
 */


public class SecondsConvert {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * @param args command line arguments.
     */
    public static void main(String[] args) {
    /**
     * declares variables as Integer since Integer is the only
     * one which is appropriate.
     */
        int hour;
        int minute;
        int second;
        int totalTime;
        int remain1;
        int hourSec;
        int minuteSec;
        final int secHour = 3600;
        final int secMinute = 60;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please enter the amount of seconds "
                + "you want to convert : ");
        totalTime = scan.nextInt();
 
        hour = totalTime / secHour;
        hourSec = hour * secHour;
        remain1 = totalTime - (hourSec);
        minute = remain1 / secMinute;
        minuteSec = minute * secMinute;
        second = totalTime - (hourSec + minuteSec);
              
        System.out.println(hour + ":" + minute + ":" + second);
        System.out.println("Question two was called and ran sucessfully.");
        scan.close();
    }

};
