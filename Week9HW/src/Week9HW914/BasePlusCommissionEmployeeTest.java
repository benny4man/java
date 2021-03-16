package Week9HW914;

public class BasePlusCommissionEmployeeTest {
   public static void main(String[] args) {
      BasePlusCommissionEmployee employee =             
         new BasePlusCommissionEmployee(                
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);

      employee.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
          employee.toString());
      System.out.println();
      System.out.println();
      
      CommissionEmployee emp1 = new CommissionEmployee("John","Doe","123-45-6789",1234,.05);
      System.out.println(emp1.toString());
   } 
} 

