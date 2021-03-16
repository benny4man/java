
package Week2HW232;
import java.util.Scanner;

public class HW232 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.println("Please enter five different numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            int num3 = input.nextInt();
            int num4 = input.nextInt();
            int num5 = input.nextInt();
            int post = 0;
            int negt = 0;
            int zerot = 0;
            
            if (num1 > 0){
                post = post + 1;
            }
            if (num2 > 0){
                post = post + 1;
            }
            if (num3 > 0){
                post = post + 1;
            }
            if (num4 > 0){
                post = post + 1;
            }
            if (num5 > 0){
                post = post + 1;
            }
            if (num1 < 0){
                negt = negt + 1;
            }
            if (num2 < 0){
                negt = negt + 1;
            }
            if (num3 < 0){
                negt = negt + 1;
            }
            if (num4 < 0){
                negt = negt + 1;
            }
            if (num5 < 0){
                negt = negt + 1;
            }
            if (num1 == 0){
                zerot = zerot + 1;
            }
            if (num2 == 0){
                zerot = zerot + 1;
            }
            if (num3 == 0){
                zerot = zerot + 1;
            }
            if (num4 == 0){
                zerot = zerot + 1;
            }
            if (num5 == 0){
                zerot = zerot + 1;
            }
            System.out.println(post + " of your numbers are positive");
            System.out.println(negt + " of your numbers are negative");
            System.out.println(zerot + " of your numbers are zeros");
    }
}
