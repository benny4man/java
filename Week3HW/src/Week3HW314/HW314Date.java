
package Week3HW314;


public class HW314Date {
    private int day;
    private int month;
    private int year;
    
    public HW314Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    
    public void displayDate(){
        System.out.printf("The date is: %d/%d/%d%n", this.month, this.day, this.year);
    }
}
