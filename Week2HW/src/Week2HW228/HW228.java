
package Week2HW228;
import java.util.Scanner;

public class HW228 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("Please enter the radius of a circle: ");
            float num1 = input.nextInt();
            float dia = 2 * num1;
            double circ = 2 * 3.14159 * num1;
            double area = (num1 * num1) * 3.14159;
            System.out.println(dia);
            System.out.println(circ);
            System.out.println(area);
    }
}
