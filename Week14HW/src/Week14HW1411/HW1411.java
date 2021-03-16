package Week14HW1411;



public class HW1411 {
    public static void main(String[] args) {
        String sentence = "This is a sentence with many occurances of the letter e";
        
        boolean loop = true;
        int counter = 0;
        int index = 0;
        
        while (loop){
            if(sentence.indexOf('e',index) != -1){
                index = sentence.indexOf('e',index) + 1;
                counter++;
            }
            else{
                break;
            }
        }
        
        System.out.printf("The sentence has %d occurances of the letter e%n",counter);

    }
}
