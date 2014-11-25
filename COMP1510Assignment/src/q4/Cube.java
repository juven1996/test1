package q4;
import java.util.Scanner;
/**
 * <p>Calculates the volume and surface area by 
 *   inputing the length of a cube.</p>
 *   
 * @author Juven Ardine Hernanto Putra
 * @version 1.0
 */

public class Cube {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         * <p>Declares length as Integer so it has 
         * data type and can be used</p>
         */
        int length;
        /**
         * <p>Declares volume as Integer so it has 
         * data type and can be used</p>
         */
        int volume;
        /**
         * <p>Declares area as Integer so it has 
         * data type and can be used</p>
         */
        int area;
        
        System.out.println("Please enter the length of the cube : ");
        length = scan.nextInt();
        volume = length * length * length;
        area = length * length;
        
        System.out.println("The Volume of the cube is : " + volume);
        System.out.println("The Surface Area of the cube is : " + area);
        System.out.println("Question four was called and ran sucessfully.");
        scan.close();
    }

};
