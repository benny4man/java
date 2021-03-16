
package Week10HW1014;


public class Circle extends TwoDimensionalShape{
    private final double r;
    
    public Circle(double radius){
        r = radius;
    }
    
    @Override
    public double getArea(){
        double area = Math.PI * (Math.pow(r, 2));
        return area;
    }
}
