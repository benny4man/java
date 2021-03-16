
package Week6HW615;

import java.util.Scanner;


public class HW615 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side a of a triangle: ");
        double side1 = input.nextInt();
        System.out.print("Enter side b of a triangle: ");
        double side2 = input.nextInt();
        
        System.out.printf("%nHypotenuse of the triangle is: %.3f%n", hypotenuse(side1,side2));
    }
    
    
    public static double hypotenuse(double side1, double side2){
        double hypot = Math.sqrt((Math.pow(side1,2) + Math.pow(side2,2)));
        return hypot;
    }
}
