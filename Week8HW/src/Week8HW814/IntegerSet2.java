package Week8HW814;


public class IntegerSet2 {
    private boolean[] set;
    
    public IntegerSet2(){
        this.set = new boolean[101];
    }
    
    public boolean[] getArray(){
        return this.set;
    }
    
    public void insertElement(int element){
        set[element] = true;
    }
    
    public void deleteElement(int element){
        this.set[element] = false;
    }
    
    public static void union(IntegerSet2 intSet1, IntegerSet2 intSet2){
        IntegerSet2 union = new IntegerSet2();
        boolean[] set1 = intSet1.getArray();
        boolean[] set2 = intSet2.getArray();
        
        for(int counter = 0; counter != 101; counter++){
            if(set1[counter] == true || set2[counter] == true){
                union.insertElement(counter);
            }
            else{
                union.deleteElement(counter);
            }
        }
        
        System.out.println(union);
    }
    
    public static void intersection(IntegerSet2 intSet1, IntegerSet2 intSet2){
        IntegerSet2 intersection = new IntegerSet2();
        boolean[] set1 = intSet1.getArray();
        boolean[] set2 = intSet2.getArray();
        
        for(int counter = 0; counter != 101; counter++){
            if(set1[counter] == false || set2[counter] == false){
                intersection.deleteElement(counter);
            }
            else{
                intersection.insertElement(counter);
            }
        }
        System.out.println(intersection);
    }
    
    public static boolean isEqualTo(IntegerSet2 intSet1, IntegerSet2 intSet2){
        boolean[] set1 = intSet1.getArray();
        boolean[] set2 = intSet2.getArray();
        boolean isEqual = false;
        
        for(int counter = 0; counter != 101; counter++){
            if(set1[counter] == set2[counter]){
                isEqual = true;
            }
            else{
                isEqual = false;
            }
        }
        
        return isEqual;
                
    }
    
    @Override
    public String toString(){
        String string = " ";
        int fCounter = 0;
        for (int counter = 0; counter != 101; counter++){
            if (this.set[counter] == true){
                string += String.format("%d ", counter);
            }
            else{
                fCounter++;
            }
        }
        if (fCounter == 101){
            string = "---";
        }
        return string;
    }
}