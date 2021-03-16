
package Week8HW813;


public class IntegerSet {
    private boolean[] set;
    
    public IntegerSet(){
        this.set = new boolean[101];
    }
    
    public boolean[] getArray(){
        return this.set;
    }
    
    public static void main(String[] args) {
        IntegerSet set = new IntegerSet();
        for(boolean value : set.getArray()){
            System.out.println(value);
        }
    }
}
