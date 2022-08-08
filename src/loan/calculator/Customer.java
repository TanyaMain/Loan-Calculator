
package loan.calculator;

import javax.swing.JOptionPane;

class Customer {
    
    protected  String customerName, contactNumber;
    protected  double productPrice, monthlyRepaymentAmount;
    protected  int numberOfMonths;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
      
        
       customerName = JOptionPane.showInputDialog(null,
                "Please enter the customer name", "Customer Name",
                JOptionPane.INFORMATION_MESSAGE);
   
        this.customerName = customerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
       contactNumber = JOptionPane.showInputDialog(null,
                "Please enter the customer number", "Customer Number",
                JOptionPane.INFORMATION_MESSAGE);
        this.contactNumber = contactNumber;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
         productPrice = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter the price of the product", "Product Price",
                JOptionPane.INFORMATION_MESSAGE));
        this.productPrice = productPrice;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        numberOfMonths = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter the price number of repayment months", "Number of Months",
                JOptionPane.INFORMATION_MESSAGE));
        this.numberOfMonths = numberOfMonths;
    }
    
    public double calculate_repayment(){
        
        return monthlyRepaymentAmount = productPrice/numberOfMonths;
       
    }
    
    public void getInfo(){
        
        setCustomerName(customerName);
        setContactNumber(contactNumber);
        setProductPrice(productPrice);
        setNumberOfMonths(numberOfMonths);
        
    }
    
    public double totalDue()
    {
        double totalDue;
        return totalDue  = monthlyRepaymentAmount * numberOfMonths;
        
    }
    
}
