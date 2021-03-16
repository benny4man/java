
package Week6HW617;

import java.util.Scanner;


public class HW617 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (isEven(num) == true){
            System.out.printf("%d is even%n", num);
        }
        else{
            System.out.printf("%d is odd%n", num);
        }
    }
    
    public static boolean isEven(int num){
        boolean answer;
        
        if ((num%2) == 0){
            answer = true;
        }
        else{
            answer = false;
        }
        
        return answer;
    }
}
