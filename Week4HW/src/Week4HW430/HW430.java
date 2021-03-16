
package Week4HW430;
import java.util.Scanner;


public class HW430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int counter = 0;
        int counter2 = 0;
        
        System.out.print("Enter the size of a square: ");
        int size = input.nextInt();
        System.out.print("\n\n");
        
        while (counter != size){
            System.out.print("*");
            counter++;
        }
        
        counter = 0;
        
        while (counter != (size - 2)){
            System.out.print("\n*");
            while (counter2 != (size - 2)){
               System.out.print(" ");
               counter2++;
            }
            System.out.print("*");
            counter2 = 0;
            counter++;
        }
        
        counter = 0;
        System.out.print("\n");
        while (counter != size){
            System.out.print("*");
            counter++;
        }
    }
}
