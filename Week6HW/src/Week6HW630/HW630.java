
package Week6HW630;
import java.security.SecureRandom;
import java.util.Scanner;

public class HW630 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();

        int num =  randomNumbers.nextInt(1000);
        
        System.out.println("I'm thinking of a number between 1 and 1000");
        
        for(;;){
            System.out.println("What is your guess?");
            int guess = input.nextInt();
            
            guessNum(guess, num);
            
            if(guess == num){
                break;
            }
        }
    }
    
    public static void guessNum(int guess, int num){
        if(guess < num){
            System.out.println("Too low, try again");
        }
        if(guess > num){
            System.out.println("Too high, try again");
        }
        if(guess == num){
            System.out.println("Congratulations, you guessed the number!");
        }
    }
}
