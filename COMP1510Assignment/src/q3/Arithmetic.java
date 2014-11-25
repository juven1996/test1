package q3;
import java.util.Scanner;
/**
 * <p>Calculate the sum, difference, quotient and 
 * the product from 2 numbers.</p>
 *
 * @author Juven Ardine Hernanto Putra
 * @version 1.0
 */

public class Arithmetic {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /**
         * <p>declares 2 numbers and all components as floating point 
         * numbers as the user may input decimals</p>
         */
        float number1;
        float number2;
        float sum;
        float diff;
        float quotient;
        float product;
        
        
        System.out.print("Please enter Number 1 : ");
        number1 = scan.nextFloat();
        System.out.print("Please enter Number 2 : ");
        number2 = scan.nextFloat();
        sum = number1 + number2;
        diff = number1 - number2;
        quotient = number1 / number2;
        product = number1 * number2;
        System.out.println("The sum of the numbers is : " + sum);
        System.out.println("The difference between those "
                + "numbers is : " + diff);
        System.out.println("The quotient is : " + quotient);
        System.out.println("The product is : " + product);
        
        System.out.println("Question three was called and ran sucessfully.");
        scan.close();
    }

};
