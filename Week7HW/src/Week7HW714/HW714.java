
package Week7HW714;


public class HW714 {
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 4;
        int n3 = 10;
        int n4 = 2;
        
        System.out.printf("Product of %d and %d is %d%n",n1,n2,product(n1,n2));
        System.out.printf("Product of %d, %d and %d is %d%n",n1,n2,n3,product(n1,n2,n3));
        System.out.printf("Product of %d, %d, %d and %d is %d%n",n1,n2,n3,n4, product(n1,n2,n3,n4));
        
    }
    
    public static int product(int... numbers){
        int total = 1;
        
        for(int num : numbers){
            total *= num;
        }
        return total;
    }
}
