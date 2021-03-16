
package Week2HW230;
import java.util.Scanner;

public class HW230 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Please enter a five digit number: ");
            int num1 = input.nextInt();
            int num2 = num1 / 10;
            int num3 = num2 / 10;
            int num4 = num3 / 10;
            int num5 = num4 / 10;
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            int d3 = num3 % 10;
            int d4 = num4 % 10;
            int d5 = num5 % 10;
            System.out.println(d5 + " " + d4 + " " + d3 + " " + d2 + " " + d1);
    }
}
