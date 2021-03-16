
package Week4HW431;
import java.util.Scanner;


public class HW431 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        
        while ((num > 99999) || (num < 10000)){
           System.out.print("Enter a five digit number: ");
           num = input.nextInt(); 
        }
        
        int origNum = num;
        int int1 = num / 10000;
        int int2 = num % 10;
        
        if (int1 == int2){
            num = num / 10;
            num = num % 1000;
            int1 = num / 100;
            int2 = num % 10;
            
            if (int1 == int2){
                System.out.printf("%d is a palindrome%n", origNum);
            }
        }
        else{
            System.out.printf("%d is not a palindrome%n", origNum);
        }
    }
}
