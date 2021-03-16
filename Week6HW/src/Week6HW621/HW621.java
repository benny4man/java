
package Week6HW621;

import java.util.Scanner;


public class HW621 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer between 1 and 99999: ");
        int num = input.nextInt();
        
        displayDigits(num);
    }
    
    public static void displayDigits(int num){
        int counter = 0;
        int div = 0;
        if (num >= 1 && num <= 9){
            counter = 1;
            div = 1;
        }
        if (num >= 10 && num <= 99){
            counter = 2;
            div = 10;
        }
        if (num >= 100 && num <= 999){
            counter = 3;
            div = 100;
        }
        if (num >= 1000 && num <= 9999){
            counter = 4;
            div = 1000;
        }
        if (num >= 10000 && num <= 99999){
            counter = 5;
            div = 10000;
        }
        
        int digit = num/div;
        System.out.print(digit);
        div/=10;
        
        while (counter != 0){
            if (div == 0){
                break;
            }
            digit = num/div;
            digit = digit%10;
            System.out.print("  ");
            System.out.print(digit);
            div/=10;
            counter--;
        }
        System.out.println();
    }
}
