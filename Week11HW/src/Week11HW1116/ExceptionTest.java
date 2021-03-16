package Week11HW1116;



public class ExceptionTest {
    public static void main(String[] args){
        
        try{
            throw new ExceptionB();
        }
        catch(ExceptionA e){
            System.err.println("Exception B caught by A");
        }
        
        try{
            throw new ExceptionC("Exception: exception C");
        }
        catch(ExceptionA e){
            e.printStackTrace();
            System.err.println("Exception C caught by A");
        }
    }
}
