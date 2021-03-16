
package Week6HW635;
import java.security.SecureRandom;
import java.util.Scanner;

public class HW635 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        for(;;){
            int question = multiplication();
            int answer = input.nextInt();
            
            while (answer != question){
                System.out.println("No, please try again");
                answer = input.nextInt();
            }
            System.out.println("Very good!");
        }
    }
    
    public static int multiplication(){
        SecureRandom randomNumbers = new SecureRandom();
        
        int num1 = randomNumbers.nextInt(11);
        int num2 = randomNumbers.nextInt(11);
        
        int answer = num1 * num2;
        
        System.out.printf("How much is %d times %d%n",num1,num2);
        return answer;
    }
}
