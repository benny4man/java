
package Week3HW316;


public class HW316HeartRate {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    
    
    public HW316HeartRate(String firstName, String lastName, int birthDay, int birthMonth, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }
    
    public int getAge(){
        int age = 2020 - this.birthYear;
        if (this.birthMonth > 9){
            age = age - 1;
        }
        return age;
    }
    
    public int getMaxRate(){
        int rate = 220 - getAge();
        return rate;
    }
    
    public double getMinRateRange(){
        double minRange = getMaxRate() * 0.5;
        return minRange;
    }
    
    public double getMaxRateRange(){
        double maxRange = getMaxRate() * 0.85;
        return maxRange;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName (){
        return firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    
    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;
    }
    public int getBirthDay(){
        return birthDay;
    }
    
    public void setBirthMonth(int birthMonth){
        this.birthMonth = birthMonth;
    }
    public int getBirthMonth(){
        return birthMonth;
    }
    
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    public int getBirthYear(){
        return birthYear;
    }
}
