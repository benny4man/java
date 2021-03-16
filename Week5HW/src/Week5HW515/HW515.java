
package Week5HW515;


public class HW515 {
   public static void main(String[] args) {
       
       
       for (int counter = 0;counter != 11; counter++){
           for (int dots = 0;dots != counter; dots++){
               System.out.print("*");
           }
           System.out.println();
       }
       
       System.out.println();
       
       for (int counter = 10;counter != 0; counter--){
           for (int dots = counter;dots != 0; dots--){
               System.out.print("*");
           }
           System.out.println();
       }
       
       System.out.println();
       int counter2 = 0;
       
       for (int counter = 10;counter != 0; counter--){
           for (int spaces = 0;spaces != counter2; spaces++){
               System.out.print(" ");
           }
           for (int dots = counter;dots != 0; dots--){
               System.out.print("*");
           }
           System.out.println();
           counter2++;
       }
       
       System.out.println();
       counter2 = 0;
       
       for (int counter = 0;counter != 11; counter++){
           for (int spaces = 10;spaces != counter2; spaces--){
               System.out.print(" ");
           }
           for (int dots = 0;dots != counter; dots++){
               System.out.print("*");
           }
           System.out.println();
           counter2++;
       }
   }
}
