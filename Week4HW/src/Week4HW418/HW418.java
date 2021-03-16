
package Week4HW418;
import java.util.Scanner;

public class HW418 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int accNum = 0;
        int begBal = 0;
        int charges = 0;
        int credits = 0;
        int limit = 0;
        
        System.out.print("Enter account number: ");
        accNum = input.nextInt();
        
        System.out.print("Enter balance at beginning of month: ");
        begBal = input.nextInt();
        
        System.out.print("Enter total charges for the month: ");
        charges = input.nextInt();
        
        System.out.print("Enter total credits applied for the month: ");
        credits = input.nextInt();
        
        System.out.print("Enter credit limit: ");
        limit = input.nextInt();
        
        int newBal = begBal + charges - credits;
        System.out.printf("%nNew balance is %d%n",newBal);
        if (newBal > limit){
            System.out.println("Credit limit exceeded");
        }
    }
}
