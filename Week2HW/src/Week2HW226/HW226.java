
package Week2HW226;
import java.util.Scanner;

public class HW226 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int num1 = input.nextInt();
            System.out.print("Please enter a second number: ");
            int num2 = input.nextInt();
            int var = num1 % num2;
            System.out.println(var);
            if (var == 0){
                System.out.println(num1 + " is a multiple of " + num2);
            }
            if (var != 0){
                System.out.println(num1 + " is not a multiple of " + num2);
            }
    }
}
