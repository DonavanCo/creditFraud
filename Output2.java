/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OutputLabs;

/**
 *
 * @author alads
 */
public class Output2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /** 
         * C++ code
         * Step 1: Declare Identifiers
         * float totalRevenue = 0;
         * float percentOfTotalRevenue = 0;
         * float onlineRetailRevenue = 0;
         * 
         * Step 2: Get values for variables
         * totalRevenue = 340.5;
         * percentOfTotalRevenue = 0.73;
         * 
         * Step 3: Calculate results
         * onlineRetailRevenue = totalRevenue * percentofTotalRevenue;
         * 
         * Step 4: Display results
         * cout << "Amazon's Total Revenue: $" << totalRevenue <<"M" <<endl;
         * cout << "Online Retail % of Total Revenue: " << percentOfTotalRevenue << "%" <<endl;
         * cout << "Online Retail's Revenue: $" << onlineRetailRevenue << "M" <<endl;
         */
        //Java code
        //Step 1: Declare Identifiers
        double totalRevenue = 0;
        double percentOfTotalRevenue = 0;
        double onlineRetailRevenue = 0;
        
        //Step 2: Get values for variables
        totalRevenue = 340.5;
        percentOfTotalRevenue = 0.73;
        
        //Step 3: Calculate results
        onlineRetailRevenue = totalRevenue * percentOfTotalRevenue;
        
        //Step 4: Display results
        System.out.println("Amazon's Total Revenue: $" + totalRevenue + "M");
        System.out.println("Online Retail % of Total Revenue: " + percentOfTotalRevenue + '%');
        System.out.println("Online Retail's Revenue: $" + onlineRetailRevenue + 'M');
    }
    
}
