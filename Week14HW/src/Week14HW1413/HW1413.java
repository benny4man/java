package Week14HW1413;



public class HW1413 {
    public static void main(String[] args) {
        String sentence = "billy john tom truck pulled blasted confused coded break";
        String[] words = sentence.split(" ");
        
        
        for(int counter = 0; counter != words.length ; counter++){
            if(words[counter].indexOf("b") == 0){
                System.out.println(words[counter]);
            }
        }  
    }
}
