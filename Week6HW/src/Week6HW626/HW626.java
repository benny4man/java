
package Week6HW626;

import java.util.Scanner;


public class HW626 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number to be reversed: ");
        int num = input.nextInt();
        
        reverser(num);
        System.out.println();
    }
    
    public static void reverser(int num){
        int counter = 0;
        int origNum = num;
        while (num >= 1){
            num /= 10;
            counter++;
        }
        while (counter != 0){
            int digit = origNum%10;
            origNum /= 10;
            System.out.print(digit);
            counter--;
        }
    }
}
