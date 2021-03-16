
package Week6HW620;

import java.util.Scanner;


public class HW620 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter radius of a circle: ");
        double radius = input.nextDouble();
        
        System.out.printf("Area of a circle with radius of %.2f is %.2f%n",radius,circleArea(radius));
    }
    
    
    public static double circleArea(double radius){
        double area = Math.PI * (radius * radius);
        return area;
    }
}
