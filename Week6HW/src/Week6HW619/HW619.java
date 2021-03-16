
package Week6HW619;

import java.util.Scanner;


public class HW619 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter length of side: ");
        int side = input.nextInt();
        System.out.print("Enter single character: ");
        String character = input.next();
        
        squareOfAstresks(side,character);
    }
    
    
    
    
    public static void squareOfAstresks(int side, String character){
        int origSide = side;
        int counter = side;
        while(side != 0){
            counter = origSide;
            while (counter != 0){
                System.out.print(character);
                counter--;
            }
            System.out.println();
            side--;
        }
    }
    
}
