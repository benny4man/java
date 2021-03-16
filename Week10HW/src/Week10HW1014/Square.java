
package Week10HW1014;


public class Square extends TwoDimensionalShape{
    private final double side;
    
    public Square(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        double area = Math.pow(side,2);
        return area;
    }
}
