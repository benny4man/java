
package Week5HW524;


public class HW524 {
    public static void main(String[] args) {
        
        int counter2 = 0;
        
        for (int counter = 1;counter != 9; counter+=2){
           for (int spaces = 10;spaces != counter2; spaces--){
               System.out.print(" ");
           }
           for (int dots = 0;dots != counter; dots++){
               System.out.print("*");
           }
           System.out.println();
           counter2++;
       }
       counter2 = 8;
       
       for (int counter = 5;counter != -1; counter-=2){
           for (int spaces = 0;spaces != counter2; spaces++){
               System.out.print(" ");
           }
           for (int dots = counter;dots != 0; dots--){
               System.out.print("*");
           }
           System.out.println();
           counter2++;
       }
    }
}
