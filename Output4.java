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
public class Output4 {

    /**
     * @param args the command line arguments
     */
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static void main(String[] args) {
        /**
         * C++ code
         * Step 1: Declare Identifiers
         * float mealCost = 0;
         * float taxPercent = 0;
         * float taxAmt = 0;
         * float tipPercent = 0;
         * float tipAmt = 0;
         * float totalBill = 0;
         * 
         * Step 2: Get values for variables
         * mealCost = 159.81;
         * tipPercent = 0.20;
         * taxPercent = 0.08;
         * 
         * Step 3: Calculate Variables
         * taxAmt = (mealCost * taxPercent);
         * tipAmt = (taxAmt + mealCost) * tipPercent;
         * totalBill = mealCost + taxAmt + tipAmt;
         * 
         * Step 4: Display Output
         * cout << "Meal Receipt" << endl;
         * cout << "Meal Cost: $" <<  mealCost << endl;
         * cout << "Tax Amount: $" << taxAmt << endl;
         * cout << "Tip Amount: $" << tipAmt << endl;
         * cout << "Total Bill: $" << totalBill << endl;        
         */
        //Java Code
        //Step 1: Declare Identifiers
        double mealCost = 0;
        double taxPercent = 0;
        double taxAmt = 0;
        double tipPercent = 0;
        double tipAmt = 0;
        double totalBill = 0;
        
        //Step 2: Get values for variables
        mealCost = 159.81;
        tipPercent = 0.20;
        taxPercent = 0.08;
        
        //Step 3: Calculate Variables
        taxAmt = (mealCost * taxPercent);
        tipAmt = (taxAmt + mealCost) * tipPercent;
        totalBill = mealCost + taxAmt + tipAmt;
        
        //Step 4: Display Output
        System.out.println("Meal Receipt\n");
        System.out.println(" Meal Cost: $" + decfor.format(mealCost));
        System.out.println("Tax Amount: $" + decfor.format(taxAmt));
        System.out.println("Tip Amount: $" + decfor.format(tipAmt));
        System.out.println("Total Bill: $" + decfor.format(totalBill));
    }
    
}
