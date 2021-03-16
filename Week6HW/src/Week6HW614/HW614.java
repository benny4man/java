
package Week6HW614;

import java.util.Scanner;


public class HW614 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 1;
        
        while(flag == 1){
            System.out.print("Enter base number or -1 to exit: ");
            int base = input.nextInt();
            if(base == -1){
                flag = 0;
                break;
            }
            System.out.print("Enter exponent number or -1 to exit: ");
            int power = input.nextInt();
            if(power == -1){
                flag = 0;
                break;
            }
            
            System.out.println(integerPower(base, power));
        }
    }
    
    
    public static int integerPower(int base, int power){
        int total = 1;
        
        while (power != 0){
            total *= base;
            power--;
        }
        
        return total;
    }
}
