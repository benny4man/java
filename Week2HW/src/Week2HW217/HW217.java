
package Week2HW217;
import java.util.Scanner;

public class HW217 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter a number: ");
            int num1 = input.nextInt();
            System.out.print("Please enter a second number: ");
            int num2 = input.nextInt();
            System.out.print("Please enter a third number: ");
            int num3 = input.nextInt();
            int sum = num1 + num2 + num3;
            int aver = sum / 3;
            int prod = num1 * num2 * num3;
            System.out.println("The sum of your numbers is: " + sum);
            System.out.println("The product of your numbers is: " + prod);
            System.out.println("The average of your numbers is: " + aver);
            if (num1 > num2){
                if(num1 > num3){
                    System.out.println(num1 + " is largest");
                }
            }
            if (num2 > num3){
                if(num2 > num1){
                    System.out.println(num2 + " is largest");
                }
            }
            if (num3 > num1){
                if(num3 > num2){
                    System.out.println(num3 + " is largest");
                }
            }
            if (num1 < num2){
                if(num1 < num3){
                    System.out.println(num1 + " is smallest");
                }
            }
            if (num2 < num3){
                if(num2 < num1){
                    System.out.println(num2 + " is smallest");
                }
            }
            if (num3 < num2){
                if(num3 < num1){
                    System.out.println(num3 + " is smallest");
                }
            }
    }
}
