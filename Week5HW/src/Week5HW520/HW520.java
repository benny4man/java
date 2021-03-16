
package Week5HW520;

public class HW520 {
    public static void main(String[] args) {
        double pi = 4L;
        double divisor = 3;
        
        System.out.print("Terms\tValue\n");
        
        for (int counter = 1; counter != 200001; counter ++){
            
            pi -= (4/divisor);
            divisor += 2;
            System.out.printf("%d\t%f\n", counter, pi);
            
            counter++;
            
            pi += (4/divisor);
            divisor += 2;
            System.out.printf("%d\t%f\n", counter, pi);
        }
    }
}
