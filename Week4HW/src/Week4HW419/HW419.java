
package Week4HW419;
import java.util.Scanner;

public class HW419 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 0;
        double total = 0;
        double item = 0;
        
        while (flag != -1){
            total += item;
            
            System.out.print("\nEnter item cost or -1 to exit: ");
            item = input.nextDouble();
            
            if (item == -1){
                flag = -1;
            }
        }
        
        double pay = 200 + (total * .09);
        System.out.printf("%nEmployee's pay is $%.2f", pay);
    }
}
