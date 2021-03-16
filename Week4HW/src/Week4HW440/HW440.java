
package Week4HW440;


public class HW440 {
    public static void main(String[] args) {
        
        double pop = 7811426744L;
        int year = 1;
        double inc = 1.1;
        double increase;
        double newPop = 0;
        
        System.out.println("Year\tPopulation\tIncrease\n");
        
        while (year != 76){
            increase = newPop - pop;
            newPop = pop * (1 + (inc * year / 100));
            
            System.out.printf("%d\t%.0f\t%.0f%n", year, newPop, increase);
            
            year++;
        }
        
    }
}
