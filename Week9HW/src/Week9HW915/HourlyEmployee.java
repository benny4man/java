
package Week9HW915;


public class HourlyEmployee extends Employee {
    private double hours;
    private double wage;
    
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage){
        super(firstName, lastName, socialSecurityNumber);
        
        if (wage < 0.0) {
         throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        if (hours < 0.0 || hours > 168) {
         throw new IllegalArgumentException("Hours must be between 0-168");
        }
        this.hours = hours;
        this.wage = wage;
    }
    
    public void setWage(double wage){
        if (wage < 0.0) {
         throw new IllegalArgumentException("Wage must be >= 0.0");
        }
        this.wage = wage;
    }
    
    public void setHours(double hours){
        if (hours < 0.0 || hours > 168) {
         throw new IllegalArgumentException("Hours must be between 0-168");
        }
        this.hours = hours;
    }
    
    public double getHours(){
        return hours;
    }
    
    public double getWage(){
        return wage;
    }
    
    public double getEarnings(){
        double earnings = 0.0;
        double h = getHours();
        double w = getWage();
        if(h > 40.0){
            double ot = h - 40.0;
            earnings = (40.0*w)+(w*ot*1.5);
        }
        else{
            earnings = h*w;
        }
        
        return earnings;
        
    }
    
    @Override
    public String toString(){
      return String.format("%s %s%n%s: %.2f%n%s: %.2f", "hourly",
        super.toString() ,
        "hours",getHours(),
        "wage", getWage());
    }
}
