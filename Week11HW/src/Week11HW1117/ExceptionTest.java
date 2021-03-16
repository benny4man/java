package Week11HW1117;
import java.io.IOException;


public class ExceptionTest {
    public static void main(String[] args){
        try{
            throw new ExceptionA();
        }
        catch(Exception e){
            System.err.println("ExceptionA caught with Exception");
        }
        
        try{
            throw new ExceptionB();
        }
        catch(Exception e){
            System.err.println("ExceptionB caught with Exception");
        }
        
        try{
            throw new NullPointerException();
        }
        catch(Exception e){
            System.err.println("NullPointerException caught with Exception");
        }
        
        try{
            throw new IOException();
        }
        catch(Exception e){
            System.err.println("IOException caught with Exception");
        }
    }
}
