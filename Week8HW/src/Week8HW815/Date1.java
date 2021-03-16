
package Week8HW815;


public class Date1 {
    private int month;
    private int day;
    private int year;
    
    public Date1(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public void printDate1(){
        System.out.printf("%02d/%02d/%d%n", month,day,year);
    }
    public void printDate2(){
        String[] monthName = {"January","February","March","April","May","June","July","August"
        ,"September","October","November","December"};
        
        System.out.printf("%s %d, %d%n", monthName[month],day,year);
    }
    public void printDate3(){
        double totalDay = (365.0/12.0) * month + day;
        System.out.printf("%.0f %d%n",totalDay, year);
    }
    
    public static void main(String[] args) {
        Date1 date = new Date1(5,12,1998);
        
        date.printDate1();
        date.printDate2();
        date.printDate3();
    }
}
