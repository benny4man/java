package Week10HW1019;



public class Building implements CarbonFootprint{
    public final String type;
    public final String color;
    public final double squareFoot;
    public final double annualPowerUsage;
    
    public Building(String type, String color, double squareFoot, double annualPowerUsage){
        this.type = type;
        this.color = color;
        this.squareFoot = squareFoot;
        this.annualPowerUsage = annualPowerUsage;
    }
    
    public String getType(){return type;}
    
    public String getColor(){return color;}
    
    public double getSquareFoot(){return squareFoot;}
    
    public double getAnnualPowerUsage(){return annualPowerUsage;}
    
    @Override
    public String toString(){
        return String.format("Building%nType: %s%nColor: %s%nSquare footage: %.2f%nAnnual power usage: %.2fKWH",getType(),getColor(),getSquareFoot(),getAnnualPowerUsage());
    }
    
    @Override
    public String getCarbonFootprint(){
        double construct = getSquareFoot() * 20;
        double emission = getAnnualPowerUsage() * 0.953;
        
        return String.format("CO2 from construction: %.2flbs%nCO2 from power usage: %.2flbs%n",construct,emission);
    }
}
