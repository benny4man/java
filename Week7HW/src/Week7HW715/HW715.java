package Week7HW715;


public class HW715 {
    public static void main(String[] args) {
        
        int[] array = new int[10];
        
        if (args.length == 1){
            int length = Integer.parseInt(args[0]);
            array = new int[length];
        }

        System.out.printf("%s%8s%n", "Index", "Value"); // column headings

        // output each array element's value                      
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }                                                         
    } 
} 