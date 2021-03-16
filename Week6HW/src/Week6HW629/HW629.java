
package Week6HW629;
import java.security.SecureRandom;
import java.util.Scanner;

enum Coin {HEADS,TAILS};

public class HW629 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int head = 0;
        int tail = 0;
        
        System.out.print("Enter amount of times to flip: ");
        int counter = input.nextInt();
        
        while (counter != 0){
            Coin side = coinToss();
            
            if (side == Coin.HEADS){
                head++;
            }
            else{
                tail++;
            }
            
            counter--;
        }
        
        System.out.printf("Times flipped heads: %d%n", head);
        System.out.printf("Times flipped tails: %d%n", tail);

    }
    
    public static Coin coinToss(){
        SecureRandom randomNumbers = new SecureRandom();
        Coin side;
        int flip = randomNumbers.nextInt(2);
        
        if (flip == 0){
            side = Coin.HEADS;
        }
        else{
            side = Coin.TAILS;
        }
        return side;
        
    }
}
