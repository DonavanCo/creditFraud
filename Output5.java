/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OutputLabs;
import java.text.DecimalFormat;
/**
 *
 * @author alads
 */
public class Output5 {

    /**
     * @param args the command line arguments
     */
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
        //Step 1: Declare Identifiers
        final int TOTAL_NUM_VALUES = 5;
        int num1 = 0;
        double num2 = 0;
        double num3 = 0;
        int num4 = 0;
        int num5 = 0;
        double sum = 0;
        double avg = 0;
        
        //Step 2: Provide Values
        num1 = 34;
        num2 = 61.5;
        num3 = 91.8;
        num4 = 73;
        num5 = 102;
        
        //Step 3: Calculate Values
        sum = num1 + num2 + num3 + num4 + num5;
        avg = sum / TOTAL_NUM_VALUES;
        
        //Step 4: Display Output
        System.out.println("    The sum of the five numbers is: " + sum);
        System.out.println("The average of the five numbers is: " + decfor.format(avg));
       

    }
    
}
