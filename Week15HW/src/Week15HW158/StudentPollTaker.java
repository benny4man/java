package Week15HW158;

import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentPollTaker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Enter poll result.",
                "Enter -1 to end input.");

        try (Formatter output = new Formatter("numbers.txt")) {
            while (input.hasNext()) {
                try {
                    int num = input.nextInt();
                    if(num == -1){
                        break;
                    }
                    else{
                        output.format("%d%n", num);
                    }
                    
                } catch (NoSuchElementException elementException) {
                    System.err.println("Non numeric input please try again");
                    input.nextLine();
                }

                System.out.print("? ");
            }
        } catch (SecurityException | FileNotFoundException
                | FormatterClosedException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
