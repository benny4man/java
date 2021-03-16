package Week14HW145;

import java.security.SecureRandom;

public class HW145 {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "jumped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        for (int counter = 0; counter != 20; counter++ ) {
            int rng = random.nextInt(5);
            StringBuilder sentence = new StringBuilder(50);
            
            sentence.append(article[rng]);
            sentence.append(" ");
            rng = random.nextInt(5);
            sentence.append(noun[rng]);
            sentence.append(" ");
            rng = random.nextInt(5);
            sentence.append(verb[rng]);
            sentence.append(" ");
            rng = random.nextInt(5);
            sentence.append(preposition[rng]);
            sentence.append(" ");
            rng = random.nextInt(5);
            sentence.append(article[rng]);
            sentence.append(" ");
            rng = random.nextInt(5);
            sentence.append(noun[rng]);
            sentence.append(".");
            
            
            String l1 = sentence.substring(0,1);
            l1 = l1.toUpperCase();
            sentence.deleteCharAt(0);
            sentence.insert(0,l1);
            System.out.println(sentence);
        }
    }

}
