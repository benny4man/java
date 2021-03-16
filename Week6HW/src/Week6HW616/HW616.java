
package Week6HW616;
import java.util.Scanner;


public class HW616 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = input.nextInt();
        
        boolean answer = isMultiple(num1,num2);
        if (answer == true){
            System.out.printf("%n%d is a multiple of %d%n", num2, num1);
        }
        else{
            System.out.printf("%n%d is not a multiple of %d%n", num2, num1);
        }
    }
    
    public static boolean isMultiple(int num1, int num2){
        boolean answer;
        
        if ((num2%num1) == 0){
            answer = true;
        }
        else{
            answer = false;
        }
        
        return answer;
    }
}
