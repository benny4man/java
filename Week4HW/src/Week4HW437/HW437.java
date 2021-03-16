
package Week4HW437;
import java.util.Scanner;


public class HW437 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int largest = 0;
        int total = 0;
        
        System.out.print("Enter a non-negative integer: ");
        num1 = input.nextInt();
        System.out.print("Enter a second non-negative integer: ");
        num2 = input.nextInt();
        System.out.print("Enter a third non-negative integer: ");
        num3 = input.nextInt();
        
        if (num1 > num2){
            if (num1 > num3){
               largest = num1; 
            }
            else{
                total += (num1*num1);
            }
        }
        else{
            total += (num1*num1);
        }
        ///////////////////////
        if (num2 > num3){
            if (num2 > num1){
               largest = num2; 
            }
            else{
                total += (num2*num2);
            }
        }
        else{
            total += (num2*num2);
        }
        /////////////////////////
        if (num3 > num1){
            if (num3 > num2){
               largest = num3; 
            }
            else{
                total += (num3*num3);
            }
        }
        else{
            total += (num3*num3);
        }
        System.out.println(largest);
        System.out.println(total);
        System.out.println(largest*largest);
        
        if ((largest*largest) == total){
            System.out.printf("The numbers %d,%d,%d could form the sides of a right triangle%n", num1, num2, num3);
        }
        else{
            System.out.printf("The numbers %d,%d,%d could not form the sides of a right triangle%n", num1, num2, num3);
        }
    }
}
