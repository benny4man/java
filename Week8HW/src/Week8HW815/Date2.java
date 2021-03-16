
package Week8HW815;


public class Date2 {
    private String sMonth;
    private int month;
    private int day;
    private int year;
    
    public Date2(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public Date2(String month, int day, int year){
        this.sMonth = month;
        this.day = day;
        this.year = year;
    }
    
    public Date2(int day, int year){
        this.day = day;
        this.year = year;
    }
    
    @Override
    public String toString(){
        String string = "";
        if(month != 0){
            string = String.format("%02d/%02d/%d%n", month,day,year);
        }
        if(month == 0){
            string = String.format("%d %d",day,year);
        }
        if(sMonth != null){
            string = String.format("%s %d, %d",sMonth,day,year);
        }
        return string;
    }
    
    public static void main(String[] args) {
        Date2 date1 = new Date2(5,12,1998);
        Date2 date2 = new Date2("May",12,1998);
        Date2 date3 = new Date2(122,1998);
        
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date1);
    }
}
