package Week10HW1019;



public class Bicycle implements CarbonFootprint{
    private final String brand;
    private final String color;
    private final double wheelSize;
    
    public Bicycle(String brand, String color, double wheelSize){
        this.brand = brand;
        this.color = color;
        this.wheelSize = wheelSize;
    }
    
    public String getBrand(){return brand;}
    
    public String getColor(){return color;}
    
    public double getWheelSize(){return wheelSize;}
    
    @Override
    public String toString(){
        return String.format("Bicycle%nBrand: %s%nColor: %s%nWheel Size: %.1f", getBrand(),getColor(),getWheelSize());
    }
    
    @Override
    public String getCarbonFootprint(){
        return String.format("CO2 from manufacture: 0.26T%n");
    }
}
