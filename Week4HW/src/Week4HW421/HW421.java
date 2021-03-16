
package Week4HW421;
import java.util.Scanner;

public class HW421 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        int largest = 0;
        int counter = 0;
        
        while (counter != 10){
            counter++;
            
            System.out.print("\nEnter a whole number: ");
            number = input.nextInt();
            
            if(number > largest){
                largest = number;
            }
        }
        System.out.printf("Largest number is: %d", largest);
    }
}
