
package Week4HW420;
import java.util.Scanner;

class HW420 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double rate;
        double hours;
        double pay;
        int flag = 0;
        
        while (flag != -1){
            System.out.print("\nEnter hours worked or -1 to exit: ");
            hours = input.nextDouble();
            System.out.print("Enter hourly wage or -1 to exit: ");
            rate = input.nextDouble();
            
            if (hours > 40){
                pay = (rate * 40) + (rate * (hours - 40) * 1.5);
            }
            else{
                pay = rate * hours;
            }
            
            if (hours != -1){
                if (rate != -1){
                    System.out.printf("%nEmployee's gross pay is $%.2f", pay);   
                }
            }
            
            if (hours == -1){
                flag = -1;
            }
            if (rate == -1){
                flag = -1;
            }
        }
    }
}
