package Week14HW144;

import java.util.Scanner;



public class HW144 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String s1 = input.nextLine();
        System.out.println("Enter another string");
        String s2 = input.nextLine();

        if (s1.regionMatches(true, 0, s2, 0, 5)) {
            System.out.printf("%n%s is equal to %s%n", s1, s2);
        }
        else{
            System.out.printf("%n%s is not equal to %s%n", s1, s2);
        }
    }
}
