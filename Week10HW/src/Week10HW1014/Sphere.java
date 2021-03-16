
package Week10HW1014;


public class Sphere extends ThreeDimensionalShape{
    private final double r;
    
    public Sphere(double radius){
        r = radius;
    }
    @Override
    public double getArea(){
        double area = 4.0 * Math.PI * Math.pow(r, 2);
        return area;
    }
    
    @Override
    public double getVolume(){
        double volume = (4/3) * Math.PI * Math.pow(r, 3);
        return volume;
    }
    
}
