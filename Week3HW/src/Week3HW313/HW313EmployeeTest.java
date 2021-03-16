
package Week3HW313;
import java.util.Scanner;

public class HW313EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        HW313Employee employee1 = new HW313Employee("John","Doe",5000);
        HW313Employee employee2 = new HW313Employee("Jane","Deer",7000);
        
        System.out.printf("%s %s yearly salary is: $%.2f%n%n",employee1.getFirstName(), employee1.getLastName() ,employee1.getYearlySalary());
        
        System.out.printf("%s %s yearly salary is: $%.2f%n%n",employee2.getFirstName(), employee2.getLastName() ,employee2.getYearlySalary());
        
        System.out.printf("Enter raise amount for employee 1 as percentage :");
        double raiseAmount = input.nextDouble();
        employee1.raise(raiseAmount);
        
        System.out.printf("%nEnter raise amount for employee 2 as percentage :");
        raiseAmount = input.nextDouble();
        employee2.raise(raiseAmount);
        
        System.out.printf("%n%s %s yearly salary is: $%.2f%n%n",employee1.getFirstName(), employee1.getLastName() ,employee1.getYearlySalary());
        
        System.out.printf("%s %s yearly salary is: $%.2f%n%n",employee2.getFirstName(), employee2.getLastName() ,employee2.getYearlySalary());
    }
}
