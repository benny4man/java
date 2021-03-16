
package Week3HW316;
import java.util.Scanner;


public class HW316HeartRateTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.println(" ");
        
        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        System.out.println(" ");
        
        System.out.print("Enter day of birth as number: ");
        int birthDay = input.nextInt();
        System.out.println(" ");
        
        System.out.print("Enter month of birth as number: ");
        int birthMonth = input.nextInt();
        System.out.println(" ");
        
        System.out.print("Enter year of birth as number: ");
        int birthYear = input.nextInt();
        System.out.println(" ");
        
        HW316HeartRate person1 = new HW316HeartRate(firstName,lastName,birthDay,birthMonth,birthYear);
        
        System.out.printf("First name: %s%n", person1.getFirstName());
        System.out.printf("Last name: %s%n", person1.getLastName());
        System.out.printf("Born on: %d/%d/%d%n", person1.getBirthMonth(),person1.getBirthDay(),person1.getBirthYear());
        System.out.printf("Age: %d%n", person1.getAge());
        System.out.printf("Max heart rate: %d BPM%n",person1.getMaxRate());
        System.out.printf("Target hear rate range: %.0f - %.0f BPM%n", person1.getMinRateRange(),person1.getMaxRateRange());
    }
}
