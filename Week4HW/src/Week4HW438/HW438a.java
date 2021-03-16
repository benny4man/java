
package Week4HW438;
import java.util.Scanner;


public class HW438a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        int origNum = 0;
        int total = 1;
        
        System.out.print("Enter a non-negative integer: ");
        number = input.nextInt();
        origNum = number;
        
        while (number > 1){
            total*=number;
            number--;
        }
        
        System.out.printf("%d! = %d%n",origNum,total);
    }
}
