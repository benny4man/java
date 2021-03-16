
package Week6HW68;

import java.util.Scanner;


public class HW68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 1;
        double total = 0;
        
        while(flag == 1){
            System.out.print("Enter hours parked or -1 to exit: ");
            double hours = input.nextInt(); 
            
            if(hours == -1){
                flag = 0;
                break;
            }
            double charge = calculateCharges(hours);
            System.out.printf("Charge: $%.2f%n", charge);
            total += charge;
            System.out.printf("Total: $%.2f%n%n", total);
        }
        
        
        
    }



    public static double calculateCharges(double hours){
        double charge = 0;
        
        if(hours <= 3){
            charge = 2.0;
        }
        else{
            hours -= 3;
            charge = (hours * .5) + 2;
        }
        
        if (hours >= 24 || charge > 10.00){
            charge = 10.0;
        }
        return charge;
    }
}