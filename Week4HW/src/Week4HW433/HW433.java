
package Week4HW433;


public class HW433 {
   public static void main(String[] args) {
       
       int size = 8;
       int counter = 0;
       int counter2 = 0;
       
       while (counter != (size/2)){
           
           while (counter2 != size){
               System.out.print("* ");
               counter2++;
           }
           
           System.out.println();
           counter2 = 0;
           System.out.print(" ");
           
           while (counter2 != size){
               System.out.print("* ");
               counter2++;
           }
           counter2 = 0;
           counter++;
           System.out.println();
       }
   }
}
