
package Week3HW313;


public class HW313Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    public HW313Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        
        if (monthlySalary > 0.0){
            this.monthlySalary = monthlySalary;
        }
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary > 0){
            this.monthlySalary = monthlySalary;
        }
    }
    
    public double getMonthlySalary(){
        return monthlySalary;
    }
    
    public double getYearlySalary(){
        double yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }
    
    public void raise(double raiseAmount){
        if(raiseAmount <= 0){
            System.out.println("Amount entered not above zero");
        }
        if(raiseAmount > 0){
            this.monthlySalary = monthlySalary * (1+(raiseAmount/100));
        }
    }
}
