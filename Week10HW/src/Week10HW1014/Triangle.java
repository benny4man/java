
package Week10HW1014;


public class Triangle extends TwoDimensionalShape{
    private final double base;
    private final double height;
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double getArea(){
        double area = .5 * base * height;
        return area;
    }
    
}
