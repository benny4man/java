
package Week7HW710;

import java.util.Scanner;


public class HW710 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] earnings = new int[11];
        
        for (;;){
            System.out.print("Enter employee's sales or -1 to exit: ");
            int sales = input.nextInt();
            
            double total = 200 + (sales * 1.09);
            
            if (sales == -1){
                break;
            }
            if (total >= 200 && total <= 299){
                ++earnings[2];
            }
            if (total >= 300 && total <= 399){
                ++earnings[3];
            }
            if (total >= 400 && total <= 499){
                ++earnings[4];
            }
            if (total >= 500 && total <= 599){
                ++earnings[5];
            }
            if (total >= 600 && total <= 699){
                ++earnings[6];
            }
            if (total >= 700 && total <= 799){
                ++earnings[7];
            }
            if (total >= 800 && total <= 899){
                ++earnings[8];
            }
            if (total >= 900 && total <= 999){
                ++earnings[9];
            }
            if (total >= 1000){
                ++earnings[10];
            }
        }
        System.out.println("\nSalary\tRange");
        
        for (int counter = 2; counter != 11; counter++){
            int range1 = counter * 100;
            int range2 = range1 + 99;
            if (range2 < 1000){
                System.out.printf("%d\t%d-%d%n",earnings[counter],range1,range2);
            }
            else{
                System.out.printf("%d\t%d+%n",earnings[counter],range1);
            }
            
        }
        System.out.println();
    }
}
