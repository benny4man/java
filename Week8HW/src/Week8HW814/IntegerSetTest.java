
package Week8HW814;


public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet2 set1 = new IntegerSet2();
        IntegerSet2 set2 = new IntegerSet2();
        IntegerSet2 set3 = new IntegerSet2();
        
        set1.insertElement(10);
        set1.insertElement(19);
        set1.insertElement(25);
        set1.insertElement(50);
        set1.insertElement(100);
        
        set2.insertElement(9);
        set2.insertElement(15);
        set2.insertElement(25);
        set2.insertElement(50);
        set2.insertElement(99);
        
        for(boolean value : set1.getArray()){
            System.out.println(value);
        }
        
        System.out.println(set1);
        System.out.println(set3);
        
        IntegerSet2.union(set1, set2);
        IntegerSet2.intersection(set1, set2);
        
        set1.deleteElement(10);
        set1.deleteElement(19);
        set1.deleteElement(100);
        
        set1.deleteElement(9);
        set1.deleteElement(15);
        set1.deleteElement(99);
        
        System.out.println(IntegerSet2.isEqualTo(set1, set2));
    }
}
