package Week11HW1120;



public class HW1120 {
    public static void main(String[] args){
        try{
            someMethod();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void someMethod2() throws Exception{
        throw new Exception("thrown in someMethod2");
    }
    public static void someMethod() throws Exception{
        try{
            someMethod2();
        }
        catch(Exception e){
            throw new Exception("thrown in someMethod",e);
        }
    }
}
