
package Week2HW234;


public class HW234 {
    public static void main(String[] args){
        double num = 7.8;
        double inc = 1.1;
        double y1 = num * (1 + (inc * 1 / 100));
        double y2 = num * (1 + (inc * 2 / 100));
        double y3 = num * (1 + (inc * 3 / 100));
        double y4 = num * (1 + (inc * 4 / 100));
        double y5 = num * (1 + (inc * 5 / 100));
        System.out.println("The number of people in 1 year is " + y1 + " billion");
        System.out.println("The number of people in 2 years is " + y2 + " billion");
        System.out.println("The number of people in 3 years is " + y3 + " billion");
        System.out.println("The number of people in 4 years is " + y4 + " billion");
        System.out.println("The number of people in 5 years is " + y5 + " billion");
    }
}
