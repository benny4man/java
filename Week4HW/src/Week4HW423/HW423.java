
package Week4HW423;
import java.util.Scanner;


public class HW423 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;
        int largest = 0;
        int secLargest = 0;
        int counter = 0;
        
        while (counter != 10){
            counter++;
            
            System.out.print("\nEnter a whole number: ");
            number = input.nextInt();
            
            if(number > largest){
                largest = number;
            }
            if(number < largest){
                if(number > secLargest){
                    secLargest = number;
                }
            }
        }
        System.out.printf("Largest number is: %d", largest);
        System.out.printf("%nSecond largest argest number is: %d", secLargest);
    }
}
