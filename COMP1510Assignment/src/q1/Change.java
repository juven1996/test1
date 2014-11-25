package q1;

import java.util.Scanner;
/**
 * <p>Calculates seconds and divides them into Hours, Minutes, and Seconds.</p>
 *
 * @author Juven Ardine Hernanto Putra
 * @version 1.0
 */


public class Change {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        /**
         * <p>declare and sets ten as constant 1000, which comes from 10*100 
         * to avoid decimals and to avoid magic numbers.</p>
         */
        final int ten = 1000;
        /**
         * <p>declare and sets five as constant 500, which comes from 5*100 
         * to avoid decimals and to avoid magic numbers.</p>
         */            
        final int five = 500;
        /**
         * <p>declare and sets two as constant 200, which comes from 2*100 
         * to avoid decimals and to avoid magic numbers.</p>
         */
        final int two = 200;
        /**
         * <p>declare and sets one as constant 100, which comes from 1*100 
         * to avoid decimals and to avoid magic numbers.</p>
         */
        final int one = 100;
        /**
         * <p>declare and sets quarter as constant 25, which comes 
         * from 0.25*100 to avoid decimals and to avoid magic numbers.</p>
         */
        final int quarter = 25;
        /**
         * <p>declare and sets dime as constant 10, which comes from 0.1*100 
         * to avoid decimals and to avoid magic numbers.</p>
         */
        final int dime = 10;
        /**
         * <p>declare and sets nickle as constant 5, which comes from 0.05*100 
         * to avoid decimals and to avoid magic numbers.</p>
         */
        final int nickle = 5;
        /**
         * <p><p>declare and sets ten as constant 1, which comes from 0.01*100 
         * to avoid decimals and to avoid magic numbers.</p>
         */
        final int penny = 1;
        /**
         * <p>declare total as double since the output includes decimal</p>
         */
        final double total;
       /**
        * <p>declares and sets multiplier as constant 100, this works so 
        * the total amount the user inputs will be multiplied by 100
        * to get rid of decimals.</p>
        */
        final int multiplier = 100;
       /**
        * <p>creates Integer variable called tempTotal where it will work
        * as the total that will be calculated in the conversion.</p>
        */
        final int tempTotal;
       /**
        * <p>sets the amount of Ten dollars as Integer.</p>
        */
        final int amountTen;
       /**
        * <p>sets the amount of Five dollars as Integer.</p>
        */
        final int amountFive;
       /**
        * <p>sets the amount of Two dollars as Integer.</p>
        */
        final int amountTwo;
       /**
        * <p>sets the amount of One dollars as Integer.</p>
        */
        final int amountOne;
       /**
        * <p>sets the amount of Quarters dollars as Integer.</p>
        */
        final int amountQrtr;
       /**
        * <p>sets the amount of Dimes dollars as Integer.</p>
        */
        final int amountDime;
       /**
        * <p>sets the amount of Nickles dollars as Integer.</p>
        */
        final int amountNickle;
       /**
        * <p>sets the amount of Pennies dollars as Integer.</p>
        */
        final int amountPenny;
       /**
        * <p>sets the total value from Ten calculation as Integer.</p>
        */
        final int totalValue1;
       /**
        * <p>sets the total value from Five calculation as Integer.</p>
        */
        final int totalValue2;
       /**
        * <p>sets the total value from Two calculation as Integer.</p>
        */
        final int totalValue3;
       /**
        * <p>sets the total value from One calculation as Integer.</p>
        */
        final int totalValue4;
       /**
        * <p>sets the total value from Quarter calculation as Integer.</p>
        */
        final int totalValue5;
       /**
        * <p>sets the total value from Dime calculation as Integer.</p>
        */
        final int totalValue6;
       /**
        * <p>sets the total value from Nickle calculation as Integer.</p>
        */
        final int totalValue7;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount of"
                + " money you want to convert : ");
        total = scan.nextDouble();
        System.out.println("You ammount of money is " + total);
        
        //Make numbers don't contain decimals
        tempTotal = (int) (total * multiplier);
        
        amountTen = (tempTotal / ten);
        totalValue1 = amountTen * ten;
        
        amountFive = ((tempTotal - (totalValue1)) / five);
        totalValue2 = amountFive * five;

        amountTwo = ((tempTotal - (totalValue1 + totalValue2)) / two);
        totalValue3 = amountTwo * two;
        
        amountOne = ((tempTotal - (totalValue1 + totalValue2 + totalValue3))
                / one);
        totalValue4 = amountOne * one;
        
        amountQrtr =  ((tempTotal - (totalValue1 + totalValue2 + totalValue3 
                + totalValue4)) / quarter);
        totalValue5 = (amountQrtr * quarter);
        
        amountDime =  ((tempTotal - (totalValue1 + totalValue2 + totalValue3 
                + totalValue4 + totalValue5)) / dime);
        totalValue6 = (amountDime * dime);
        
        amountNickle = ((tempTotal - (totalValue1 + totalValue2 + totalValue3 
                + totalValue4 + totalValue5 + totalValue6)) / nickle);
        totalValue7 = (amountNickle * nickle);
        

        amountPenny =  ((tempTotal - (totalValue1 + totalValue2 + totalValue3 
                + totalValue4 + totalValue5 + totalValue6 + totalValue7))
                / penny);
       
        System.out.println(amountTen + " Ten dollars");
        System.out.println(amountFive + " Five dolars");
        System.out.println(amountTwo + " Two dollars");
        System.out.println(amountOne + " One dollars");
        System.out.println(amountQrtr + " Quarters");
        System.out.println(amountDime + " Dimes");
        System.out.println(amountNickle + " Nickles");
        System.out.println(amountPenny + " Pennies");
        System.out.println("Question one was called and ran sucessfully.");
        scan.close();
    }

};
