package Week5HW513;


public class HW513 {
    public static void main(String[] args) {
     
        int counter = 20;
        int origNum = 0;
        long total = 1L;
        origNum = counter;
        
        System.out.print("n\tn!\n");
        
        
        while (counter > 0){
            
            int facCounter = counter;
            total = 1;
            
            while (facCounter > 1){
                total*=facCounter;
                facCounter--;
            }
            
            System.out.printf("%d\t%d%n",counter,total);
            counter--;
        }
        
        
        
    }
}
