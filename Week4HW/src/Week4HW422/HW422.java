
package Week4HW422;


public class HW422 {
    public static void main(String[] args) {
        int counter = 1;
        
        System.out.print("N\t10*N\t100*N\t1000*N\n");
        
        while (counter != 6){
            
            int ten = counter * 10;
            int hun = counter * 100;
            int thou = counter * 1000;
            
            System.out.printf("%n%d\t%d\t%d\t%d", counter , ten, hun , thou);
            counter++;
        }
    }
}
