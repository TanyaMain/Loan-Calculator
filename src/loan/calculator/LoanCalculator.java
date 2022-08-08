
package loan.calculator;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class LoanCalculator {

    public static void main(String[] args) {
        
        Finance_Period Finance_Period_OBJ = new Finance_Period();
        Finance_Period_OBJ.getInfo();
        DecimalFormat df = new DecimalFormat("0.00");
        
         JOptionPane.showMessageDialog(null,
                 "Customer Name: " + Finance_Period_OBJ.getCustomerName() 
               + "\nCustomer Contact: " + Finance_Period_OBJ.getContactNumber() 
               + "\nProduct Amount: R " + df.format(Finance_Period_OBJ.getProductPrice()) 
               + "\nRepayment Months: " + Finance_Period_OBJ.getNumberOfMonths()
               + "\nMonthly Repayment: R " + df.format(Finance_Period_OBJ.calculate_repayment())
               + "\nTotal Due: R " + df.format(Finance_Period_OBJ.totalDue())
         );
    }
    
}
