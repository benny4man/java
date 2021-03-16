
package Week2HW216;
import java.util.Scanner;

public class HW216 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int num1 = input.nextInt();
            System.out.print("Please enter a second number: ");
            int num2 = input.nextInt();
            if (num1 > num2){
                System.out.println(num1 + " is larger");
                        }
            if (num2 > num1){
                System.out.println(num2 + " is larger");
                        }
            if (num1 == num2){
                System.out.println("These numbers are equal");
                        }
    }
}
