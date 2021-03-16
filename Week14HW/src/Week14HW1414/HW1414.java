package Week14HW1414;

public class HW1414 {

    public static void main(String[] args) {
        String sentence = "billy john tom truck PULLED blasted confused CODED break";
        String[] words = sentence.split(" ");

        for (int counter = 0; counter != words.length; counter++) {
            if (words[counter].lastIndexOf("ED") == words[counter].length() - 2) {
                System.out.println(words[counter]);
            }
        }
    }
}
