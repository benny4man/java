
package Week6HW632;

import java.util.Scanner;


public class HW632 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter coordinates of two points to calculate distance");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        
        System.out.printf("The distance between the points (%.2f,%.2f) and (%.2f,%.2f) is: %.4f%n", x1,y1,x2,y2,distance(x1,y1,x2,y2));
    }
    
    
    
    public static double distance(double x1, double y1, double x2, double y2){
        double distance = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return distance;
    }
}
