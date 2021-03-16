package Week15HW158;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentPoll {

    public static void main(String[] args) {

        ArrayList<Integer> responsesList = new ArrayList<Integer>();
        try (Scanner input = new Scanner(Paths.get("numbers.txt"))) {
            while (input.hasNext()) {
                int response = input.nextInt();
                responsesList.add(response);
            }
        } catch (IOException | NoSuchElementException
                | IllegalStateException e) {
            e.printStackTrace();
        }

        int[] responses = new int[responsesList.size()];
        for (int counter = 0; counter != responsesList.size(); counter++) {
            int num = responsesList.get(counter);
            responses[counter] = num;
        }

        for (int num : responses) {
            System.out.println(num);
        }
        int[] frequency = new int[6];

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // invokes toString method
                System.out.printf("   responses[%d] = %d%n%n",
                        answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        // output each array element's value
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }

        try (Formatter output = new Formatter("output.txt")) {
            output.format("%s%10s%n", "Rating", "Frequency");
            for (int rating = 1; rating < frequency.length; rating++) {
                output.format("%6d%10d%n", rating, frequency[rating]);
            }
        } catch (SecurityException | FileNotFoundException
                | FormatterClosedException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
