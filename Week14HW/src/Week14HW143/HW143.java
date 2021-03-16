package Week14HW143;

import java.util.Scanner;

public class HW143 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String s1 = input.nextLine();
        System.out.println("Enter another string");
        String s2 = input.nextLine();

        if (s1.compareTo(s2) == 0) {
            System.out.printf("%n%s is equal to %s%n", s1, s2);
        }
        if (s1.compareTo(s2) > 0) {
            System.out.printf("%n%s is greater than %s%n", s1, s2);
        }
        if(s1.compareTo(s2) < 0){
            System.out.printf("%n%s is less than %s%n", s1, s2);
        }
    }
}
