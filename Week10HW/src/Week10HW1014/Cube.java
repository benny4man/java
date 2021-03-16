
package Week10HW1014;


public class Cube extends ThreeDimensionalShape{
    private final double side;
    
    public Cube(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        double area = Math.pow(side, 2) * 6;
        return area;
    }
    
    @Override
    public double getVolume(){
        double volume  = Math.pow(side, 3);
        return volume;
    }
}
