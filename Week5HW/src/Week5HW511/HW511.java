
package Week5HW511;
import java.util.Scanner;


public class HW511 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        int smallest;
        int counter = 1;
        int values;
        
        System.out.print("Enter amount of values to enter: ");
        values = input.nextInt();
        
        System.out.print("\nEnter a whole number: ");
        number = input.nextInt();
            
        smallest = number;
        
        while (counter != values){
            counter++;
            
            System.out.print("\nEnter a whole number: ");
            number = input.nextInt();
            
            if(number < smallest){
                smallest = number;
            }
        }
        System.out.printf("Smallest number is: %d%n", smallest);
    }
    
}
