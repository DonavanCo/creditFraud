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
public class Output6 {

    /**
     * @param args the command line arguments
     */
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
        //Step 1: Declare Identifiers
        double payAmount = 0;
        int payPeriods = 0;
        double annualPay = 0;
        
        //Step 2: Provide Values
        payAmount = 2580.00;
        payPeriods = 26;
        
        //Step 3: Calculate Annual Pay
        annualPay = payAmount * payPeriods;
        
        //Step 4: Display Output
        System.out.println("Employee's Annual Paystub");
        System.out.println("\nAmount Earned per Pay Period: $" + decfor.format(payAmount));
        System.out.println(" Total Number of Pay Periods: " + decfor.format(payPeriods));
        System.out.println("       Employee's Annual Pay: $" + decfor.format(annualPay));
    }
    
}
