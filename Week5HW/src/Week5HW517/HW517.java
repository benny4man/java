
package Week5HW517;

import java.util.Scanner;


public class HW517 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int flag = 1;
        double total = 0;
        double price;
        
        while (flag != 0){
            System.out.print("Enter product code or -1 to exit: ");
            int prod = input.nextInt();
            System.out.print("Enter units sold: ");
            int amount = input.nextInt();
            System.out.println();
            
            switch (prod){
                case -1:
                    flag = 0;
                    break;
                case 5:
                    price = 6.87;
                    total += price * amount;
                    break;
                case 4:
                    price = 4.49;
                    total += price * amount;
                    break;
                case 3:
                    price = 9.98;
                    total += price * amount;
                    break;
                case 2:
                    price = 4.50;
                    total += price * amount;
                    break;
                case 1:
                    price = 2.98;
                    total += price * amount;
                    break;
                default:
                    System.out.println("Please enter valid product code");
                    break;
                    
                
                    
                }
            }
        System.out.printf("Retail value of all products sold: $%.2f%n",total);
        }
    }

