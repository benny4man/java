package Week5HW530;


public class AutoPolicyTest {
    public static void main(String[] args) {
        AutoPolicy policy1 = 
        new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = 
        new AutoPolicy(22222222, "Ford Fusion", "ME"); 
        
        policy1.setState("NJ");
        System.out.println(policy1.getState());
        
        policy2.setState("MI");
        System.out.println(policy2.getState());
    }
}   
      
 
