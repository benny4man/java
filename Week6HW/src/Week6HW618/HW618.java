
package Week6HW618;

import java.util.Scanner;


public class HW618 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length of side: ");
        int side = input.nextInt();
        
        squareOfAstresks(side);
    }
    
    
    
    
    public static void squareOfAstresks(int side){
        int origSide = side;
        int counter = side;
        while(side != 0){
            counter = origSide;
            while (counter != 0){
                System.out.print("*");
                counter--;
            }
            System.out.println();
            side--;
        }
    }
}
