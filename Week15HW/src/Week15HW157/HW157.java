package Week15HW157;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class HW157 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try (Formatter output = new Formatter("words.txt")) {
            String[] l1 = {"A", "B", "C"};
            String[] l2 = {"D", "E", "F"};
            String[] l3 = {"G", "H", "I"};
            String[] l4 = {"J", "K", "L"};
            String[] l5 = {"M", "N", "O"};
            String[] l6 = {"P", "R", "S"};
            String[] l7 = {"T", "U", "V"};
            String[] l8 = {"W", "X", "Y"};

            String[][] letters = {null, null, l1, l2, l3, l4, l5, l6, l7, l8};

            System.out.print("Please enter a phone number: ");
            int phoneNumber = input.nextInt();
            int[] phoneNumArray = new int[7];
            for (int counter = 6; counter != -1; counter--) {
                int num = phoneNumber % 10;
                phoneNumber /= 10;
                phoneNumArray[counter] = num;
            }

            for (int d1 = 0; d1 != 3; d1++) {
                String w1 = letters[phoneNumArray[0]][d1];
                ///
                for (int d2 = 0; d2 != 3; d2++) {
                    String w2 = letters[phoneNumArray[1]][d2];
                    ///
                    for (int d3 = 0; d3 != 3; d3++) {
                        String w3 = letters[phoneNumArray[2]][d3];
                        ///
                        for (int d4 = 0; d4 != 3; d4++) {
                            String w4 = letters[phoneNumArray[3]][d4];
                            ///
                            for (int d5 = 0; d5 != 3; d5++) {
                                String w5 = letters[phoneNumArray[4]][d5];
                                ///
                                for (int d6 = 0; d6 != 3; d6++) {
                                    String w6 = letters[phoneNumArray[5]][d6];
                                    ///
                                    for (int d7 = 0; d7 != 3; d7++) {
                                        String w7 = letters[phoneNumArray[6]][d7];

                                        String word = String.format("%s%s%s%s%s%s%s", w1, w2, w3, w4, w5, w6, w7);
                                        System.out.println(word);
                                        output.format("%s%s%s%s%s%s%s%n", w1, w2, w3, w4, w5, w6, w7);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            e.printStackTrace();
        }

    }
}
