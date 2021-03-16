
package Week7HW716;


public class HW716 {
    public static void main(String[] args) {
        double total = 0;
        
        for (String x : args){
            double num = Double.parseDouble(x);
            total += num;
        }
        
        System.out.println(total);
    }
}
