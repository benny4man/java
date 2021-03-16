
package Week4HW417;
import java.util.Scanner;

public class HW417 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int miles = 0;
        int gallons = 0;
        int totalGallons = 0;
        int totalMiles = 0;
        int rep = 1;
        
        while (rep == 1){
            totalMiles += miles;
            totalGallons += gallons;
            
            if(miles != 0){
                double mpg = (double) miles / gallons;
                System.out.printf("%nMiles per gallon for this trip: %.2f", mpg);
                
                double totalMpg = (double) totalMiles / totalGallons;
                System.out.printf("%nTotal miles per gallon: %.2f", totalMpg);
            }
            
            System.out.print("\nEnter miles or -1 to exit: ");
            miles = input.nextInt();
            System.out.print("\nEnter gallons or -1 to exit: ");
            gallons = input.nextInt();
            
            if (miles == -1){
                rep = 0;
            }
            if (gallons == -1){
                rep = 0;
                
            }
        }
        
        
    }
}
