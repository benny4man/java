
package Week7HW711;


public class HW711 {
    public static void main(String[] args) {
        int[] counts = {1,9,11,5,6,88,16,5,8,7};
        int[] bonus = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] bestScores = {5,9,8,45,12};
        
        
        for (int counter = 0; counter != 10; counter++){
            counts[counter] = 0;
            System.out.println(counts[counter]);
        }
        System.out.print("\n\n");
        for(int counter = 0; counter != 15; counter++){
            bonus[counter] += 1;
            System.out.println(bonus[counter]);
        }
        System.out.print("\n\n");
        for(int counter = 1;counter != 6; counter ++){
            System.out.printf("%d\t%d%n", counter, bestScores[(counter-1)]);
        }
    }
}
