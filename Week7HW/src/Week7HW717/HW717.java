
package Week7HW717;

import java.security.SecureRandom;


public class HW717 {
    public static void main(String[] args) {
        SecureRandom ranNum = new SecureRandom();
        int[] totals = new int[13];
        
        for(int counter = 0; counter < 36_000_000;counter++){
            int num1 = 1 + ranNum.nextInt(6);
            int num2 = 1 + ranNum.nextInt(6);
            int sum = num1 + num2;
            
            ++totals[sum];
        }
        
        System.out.println("Total\tFrequency");
        for(int counter2 = 2; counter2 < 13; counter2++){
            System.out.printf("%d\t%d%n", counter2, totals[counter2]);
        }
    }
}
