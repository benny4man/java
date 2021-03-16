
package Week4HW432;
import java.util.Scanner;


public class HW432 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int value = 1;
        int num;
        int origNum;
        int decimal = 0;
        
        System.out.print("Enter a binary number: ");
        num = input.nextInt();
        origNum = num;
        
        while (num > 0){
           int num1 = num % 10;
           
           if(num1 == 1){
               decimal += value;
           }
           num /= 10;
           value *= 2;
        }
        System.out.printf("The binary number %d is equal to %d in decimal%n",origNum,decimal);
    }
}
