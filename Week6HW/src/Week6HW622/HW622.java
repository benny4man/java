
package Week6HW622;

import java.util.Scanner;


public class HW622 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1 to convert to celsius or 2 for fahrenheit: ");
        int type = input.nextInt();
        System.out.print("Enter temperature: ");
        double temp = input.nextInt();
        
        if (type == 1){
            System.out.printf("Converted temp is %.2f Celsius%n",celsius(temp));
        }
        if (type == 2){
            System.out.printf("Converted temp is %.2f Fahrenheit%n",fahrenheit(temp));
        }
    }
    
    public static double fahrenheit(double temp){
        double fahrenheit = 9.0 / 5.0 * temp + 32;
        return fahrenheit;
    }
    
    public static double celsius(double temp){
        double celsius = 5.0 / 9.0 * (temp - 32);
        return celsius;
    }
}
