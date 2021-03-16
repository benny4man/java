package Week14HW1412;



public class HW1412 {
    public static void main(String[] args) {
        String sentence = "This is a sentence with many occurances of the letter e";
        
        int[] letterOccurances = new int[26];
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m",
            "n","o","p","q","r","s","t","u","v","w","x","y","z"};
        sentence = sentence.toLowerCase();
        boolean loop = true;
        
        
        for(int letterCounter = 0; letterCounter != 26; letterCounter++){
            int index = 0;
            while (loop){
                if(sentence.indexOf(letters[letterCounter],index) != -1){
                    index = sentence.indexOf(letters[letterCounter],index) + 1;
                    letterOccurances[letterCounter]++;
                }
                else{
                    break;
                }
            }
        }
        System.out.printf("Letter\tOccurances%n");
        for(int counter = 0; counter != 26; counter++){
            System.out.printf("%s\t%d%n", letters[counter], letterOccurances[counter]);
        }

    }
}
