package Week11HW1119;



public class SomeClassTest {
    public static void main(String[] args){
        
        try{
            SomeClass obj = new SomeClass();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
