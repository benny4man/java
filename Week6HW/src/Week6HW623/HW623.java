
package Week6HW623;

import java.util.Scanner;


public class HW623 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter a third number: ");
        int num3 = input.nextInt();
        
        System.out.printf("Smallest number is %d%n",minimum3(num1, num2, num3));
    }
    
    public static int minimum3(int num1, int num2, int num3){
        int min = Math.min(num1, num2);
        min = Math.min(num1,num3);
        if(num1 > num2 || num1 > num3){
            min = Math.min(num2,num3);
        }
        return min;
    }
}
