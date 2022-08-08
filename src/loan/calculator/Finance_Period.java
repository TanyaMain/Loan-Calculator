
package loan.calculator;

public class Finance_Period extends  Customer {
    
@Override 
public double calculate_repayment()
    {
    
        if(numberOfMonths > 3)
        {
               monthlyRepaymentAmount = productPrice/numberOfMonths*1.25;
        }
        else
        {
             return monthlyRepaymentAmount = productPrice/numberOfMonths;
        }
        return monthlyRepaymentAmount;
    }
}
