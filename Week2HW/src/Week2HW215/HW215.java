
package Week2HW215;
import java.util.Scanner;

public class HW215 {
    
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int var1 = input.nextInt();
            System.out.print("Please enter a second number: ");
            int var2 = input.nextInt();
            int sum = var1 + var2;
            int prod = var1 * var2;
            int diff = var1 - var2;
            int quo = var1 / var2;
            System.out.println("The sum of your numbers is: " + sum);
            System.out.println("The product of your numbers is: " + prod);
            System.out.println("The difference of your numbers is: " + diff);
            System.out.println("The quotient of your numbers is: " + quo);
    }
}
