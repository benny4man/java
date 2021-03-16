package Week10HW1019;



public class Car implements CarbonFootprint{
    private final String make;
    private final String model;
    private final String color;
    private final String fuel;
    private final double tankSize;
    private final double mpg;
    
    public Car(String make, String model, String color, String fuel, double tankSize, double mpg){
        this.make = make;
        this.model = model;
        this.color = color;
        this.fuel = fuel;
        this.tankSize = tankSize;
        this.mpg = mpg;
    }
    
    public String getMake(){return make;}
    
    public String getModel(){return model;}
    
    public String getColor(){return color;}
    
    public String getFuel(){return fuel;}
    
    public double getTankSize(){return tankSize;}
    
    public double getMPG(){return mpg;}
    
    @Override
    public String toString(){
        return String.format("Automobile%nMake: %s%nModel: %s%nColor: %s%nFuel Type: %s%nTank Size: %.1f%nMPG: %.1f", getMake(),getModel(),getColor(),getFuel(),getTankSize(),getMPG());
    }
    
    @Override
    public String getCarbonFootprint(){
        double CO = 0;
        if (getFuel().equals("Gasoline")){
            CO = 8887;
        }
        if(getFuel().equals("Diesel")){
            CO = 10180;
        }
        double emission = CO * getTankSize();
        double manufacture = 8;
        
        return String.format("CO2 from manufacturing: %.0fT%nCO2 emissions per tank: %.2fg%n", manufacture,emission);
    }
}
