
package Week7HW719;

import java.util.Scanner;


public class HW719 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean[] seats = {false,false,false,false,false,false,false,false,false,false};
        boolean fFull = false;
        boolean eFull = false;
        int assignment = 0;
        
        
        while (fFull == false || eFull == false){
            System.out.print("Please type 1 for First Class or 2 for Economy: ");
            int choice = input.nextInt();
            
            for(;;){
                // first class choice
                if(fFull == false || eFull == false){
                    if (choice == 1){
                        if(isFull(seats, choice) == true){
                            // is full re-assignment
                            System.out.print("First Class is full would you like to move to Economny Class?(1 for yes, 2 for no): ");
                            int resign = input.nextInt();
                            fFull = true;
                            // check for possible choice
                            while(resign != 1 && resign != 2){
                                System.out.print("Error invalid option\nWould you like to move to Economny Class?(1 for yes, 2 for no): ");
                                resign = input.nextInt();
                            }
                            if (resign == 1){
                                choice = 2;
                            }
                            else{
                                System.out.println("Next flight leaves in 3 hours");
                                break;
                            }

                        }
                        else{
                            // is not full assign
                            for(int counter = 0; counter < 5; counter++){
                                if (seats[counter] == false){
                                    assignment = 1 + counter;
                                    seats[counter] = true;
                                    break;
                                }
                            }
                            System.out.printf("Seat number: %d\nClass: First\n\n", assignment);
                            break;
                        }
                    }
                    // econ class choice
                    if (choice == 2){
                        if(isFull(seats, choice) == true){
                            // is full re-assignment
                            System.out.print("Economy Class is full would you like to move to First Class?(1 for yes, 2 for no): ");
                            int resign = input.nextInt();
                            eFull = true;
                            // check for possible choice
                            while(resign != 1 && resign != 2){
                                System.out.print("Error invalid option\nWould you like to move to First Class?(1 for yes, 2 for no): ");
                                resign = input.nextInt();
                            }
                            if (resign == 1){
                                choice = 1;
                            }
                            else{
                                System.out.println("Next flight leaves in 3 hours");
                                break;
                            }

                        }
                        else{
                            // is not full assign
                            for(int counter = 5; counter < 10; counter++){
                                if (seats[counter] == false){
                                    assignment = 1 + counter;
                                    seats[counter] = true;
                                    break;
                                }
                            }
                            System.out.printf("Seat number: %d\nClass: Economy\n\n", assignment);
                            break;
                        }
                    }
                }
                else{
                    break;
                }
            }   
        }
        System.out.println("We're sorry all seats are currently full");
    }
    
    public static boolean isFull(boolean[] array, int type){
        boolean answer = false;
        
        if(type == 1){
            int fCounter = 0;
            for(int counter = 0; counter < 5; counter++){
                if (array[counter] == true){
                    fCounter++;
                }
            }
            if (fCounter == 5){
                answer = true;
            }
        }
        if(type == 2){
            int fCounter = 0;
            for(int counter = 5; counter < 10; counter++){
                if (array[counter] == true){
                    fCounter++;
                }
            }
            if (fCounter == 5){
                answer = true;
            }
        }
       return answer; 
    }
}
