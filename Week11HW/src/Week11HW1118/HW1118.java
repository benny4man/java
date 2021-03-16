package Week11HW1118;



public class HW1118 {
    public static void main(String[] args){
        
        try{
            throw new NullPointerException();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}
