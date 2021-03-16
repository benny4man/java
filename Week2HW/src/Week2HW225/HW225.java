
package Week2HW225;
import java.util.Scanner;

public class HW225 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int num1 = input.nextInt();
            int num2 = num1 % 2;
            if (num2 == 0){
                System.out.println(num1 + " is even");
            }
            if (num2 != 0){
                System.out.println(num1 + " is odd");
            }
                
    }
}
