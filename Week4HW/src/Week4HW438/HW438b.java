
package Week4HW438;
import java.util.Scanner;


public class HW438b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        int origNum = 0;
        double total = 1;
        int counter = 0;
        double e = 1;
        
        System.out.print("Enter number of terms to calculate: ");
        number = input.nextInt();
        origNum = number;
        counter = number;
        
        while (counter > 1){
            
            while (number > 1){
            total*=number;
            number--;
            }
            System.out.println(total);
            e += (1/total);
            total = 1;
            counter--;
            number = counter;
        }
        
        System.out.printf("e to %d terms = %.8f%n",origNum,e);
    }
    
}
