
package Week6HW631;

import java.security.SecureRandom;
import java.util.Scanner;

public class HW631 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom randomNumbers = new SecureRandom();

        int num =  randomNumbers.nextInt(1000);
        int counter = 1;
        
        System.out.println("I'm thinking of a number between 1 and 1000");
        
        for(;;){
            System.out.println("What is your guess?");
            int guess = input.nextInt();
            
            guessNum(guess, num, counter);
            
            if(guess == num){
                if (counter < 10){
                    System.out.println("Either you know the secret or you got lucky!");
                }
                if (counter == 10){
                    System.out.println("Aha, you know the secret!");
                }
                if (counter > 10){
                    System.out.println("You should be able to do better!");
                }
                break;
            }
            counter++;
        }
    }
    
    public static void guessNum(int guess, int num, int guesses){
        if(guess < num){
            System.out.println("Too low, try again");
        }
        if(guess > num){
            System.out.println("Too high, try again");
        }
        if(guess == num){
            System.out.printf("Congratulations, you guessed the number in %d guesses!%n",guesses);
        }
    }
}