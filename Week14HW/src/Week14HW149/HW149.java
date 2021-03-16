package Week14HW149;



public class HW149 {
    public static void main(String[] args) {
        String sentence = "This is a sentence that will be split and reversed";
        String[] tokens = sentence.split(" ");
        for(int counter = tokens.length - 1 ; counter >= 0 ; counter--){
            System.out.println(tokens[counter]);
        }
    }
}
