
package Week7HW712;

import java.util.Scanner;


public class HW712 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] num = {0,0,0,0,0};
        
        for(int counter = 0; counter != 5; counter++){
            System.out.print("Enter a number between 10-100: ");
            int number = input.nextInt();
            
            for(int counter2 = 0; counter2 != 5; counter2++){
                if(number == num[counter2]){
                    num[counter2] = 0;
                }
            }
            num[counter] = number;
            
            System.out.println();
            for (int index : num){
                if(index != 0){
                    System.out.println(index);
                }
            }
            
        }
    }
}
