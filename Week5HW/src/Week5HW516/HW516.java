
package Week5HW516;

import java.util.Scanner;


public class HW516 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number 1-30: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number 1-30: ");
        int num2 = input.nextInt();
        System.out.print("Enter a number 1-30: ");
        int num3 = input.nextInt();
        System.out.print("Enter a number 1-30: ");
        int num4 = input.nextInt();
        System.out.print("Enter a number 1-30: ");
        int num5 = input.nextInt();
        
        for (int counter = 0; counter != num1; counter ++){
            System.out.print("*");
        }
        System.out.println();
        for (int counter = 0; counter != num2; counter ++){
            System.out.print("*");
        }
        System.out.println();
        for (int counter = 0; counter != num3; counter ++){
            System.out.print("*");
        }
        System.out.println();
        for (int counter = 0; counter != num4; counter ++){
            System.out.print("*");
        }
        System.out.println();
        for (int counter = 0; counter != num5; counter ++){
            System.out.print("*");
        }
        System.out.println();
            
    }
}
