
package Week5HW514;


public class HW514 {
   public static void main(String[] args) {
      double principal = 1000.0; // initial amount before interest
      double rate = 0.05; // interest rate

      // display headers
      System.out.printf("%s\t%s\t%s%n", "Year", "Rate", "Amount on deposit");
      for (;rate <= 0.10; rate += 0.01){
          
        for (int year = 1; year <= 10; ++year) {                  
            // calculate new amount on deposit for specified year  
            double amount = principal * Math.pow(1.0 + rate, year);
                                                                
            // display the year and the amount                     
            System.out.printf("%d\t%.0f%%\t%.2f%n", year,(rate*100), amount);       
        }
      }
      // calculate amount on deposit for each of ten years
                                                               
   } 
}
