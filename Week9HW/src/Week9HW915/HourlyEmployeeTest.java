
package Week9HW915;


public class HourlyEmployeeTest {
   public static void main(String[] args) {
      
      HourlyEmployee emp2 = new HourlyEmployee("Jane","Greene","556-48-4824",48,8.95);
      System.out.println(emp2);
      System.out.printf("Earnings: %.2f%n", emp2.getEarnings());
    }
}
