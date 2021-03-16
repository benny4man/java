
package Week8HW806;


public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        
        saver1.modifyInterestRate(4);
        
        System.out.printf("%-10s%-10s%-10s%n", "Month","Saver 1","Saver 2");
        
        for (int counter = 0; counter != 13; counter++){
            System.out.printf(
            "%-10d$%-10.2f$%-10.2f%n",counter,saver1.getBalance(),saver2.getBalance());
            
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        
        saver1.modifyInterestRate(5);
        System.out.printf(
            "%-10d$%-10.2f$%-10.2f%n",13,saver1.getBalance(),saver2.getBalance());
    }
}
