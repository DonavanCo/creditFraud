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
public class Output3 {

    /**
     * @param args the command line arguments
     */
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
        /**
         * C++ code
         * Step 1: Declare Identifiers
         * float purchasePrice = 0;
         * float stateTaxPercent = 0;
         * float stateTaxAmt = 0;
         * float countyTaxPercent = 0;
         * float countyTaxAmt = 0;
         * float totalTax = 0;
         * 
         * Step 2: Get values for variables
         * purchasePrice = 179.89;
         * stateTaxPercent = 0.08;
         * countyTaxPercent = 0.03;
         * 
         * Step 3: Calculate Amounts
         * stateTaxAmt = purchasePrice * stateTaxPercent;
         * countyTaxAmt = purchasePrice * countyTaxPercent;
         * totalTax = stateTaxAmt + countyTaxAmt;
         * stateTaxPercent = 8;
         * countyTaxPercent = 3;
         * 
         * Step 4: Display Values
         * cout << "Purchase Price: $" << purchasePrice << endl;
         * cout << "State Tax %: " << stateTaxPercent << '%' << endl;
         * cout << "State Tax Amount: $" << stateTaxAmt << endl;
         * cout << "County Tax %: " << countyTaxPercent << '%' << endl;
         * cout << "County Tax Amount: $" << countyTaxAmt << endl;
         * cout << "Total Tax Owed: $" << totalTax << endl;
         */
        //Java code
        //Step 1: Declare Identifiers
        double purchasePrice = 0;
        double stateTaxPercent = 0;
        double stateTaxAmt = 0;
        double countyTaxPercent = 0;
        double countyTaxAmt = 0;
        double totalTax = 0;
        
        //Step 2: Get values for variables
        purchasePrice = 179.89;
        stateTaxPercent = 0.08;
        countyTaxPercent = 0.03;
        
        //Step 3: Calculate Amounts
        stateTaxAmt = purchasePrice * stateTaxPercent;
        countyTaxAmt = purchasePrice * countyTaxPercent;
        totalTax = stateTaxAmt + countyTaxAmt;
        stateTaxPercent = 8;
        countyTaxPercent = 3;
        
        //Step 4: Display Values
        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("State Tax %: " + stateTaxPercent + '%');
        System.out.println("State Tax Amount: $" + decfor.format(stateTaxAmt));
        System.out.println("County Tax %: " + countyTaxPercent + '%');
        System.out.println("County Tax Amount: $" + decfor.format(countyTaxAmt));
        System.out.println("Total Tax Owed: $" + decfor.format(totalTax));
    }
    
}
