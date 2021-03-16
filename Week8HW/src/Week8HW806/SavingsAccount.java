
package Week8HW806;


public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(double balance){
        this.savingsBalance = balance;
    }
    
    public static void modifyInterestRate(double rate){
        annualInterestRate = rate/100;
    }
    
    public static double getInterestRate(){
        return annualInterestRate;
    }
    
    public double getBalance(){
        return this.savingsBalance;
    }
    
    public void calculateMonthlyInterest(){
        double interest = savingsBalance * annualInterestRate / 12;
        this.savingsBalance += interest;
    }
    
    
}
