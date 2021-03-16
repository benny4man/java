package Week10HW1014;



public class Tetrahedron extends ThreeDimensionalShape{
    private final double side;
    
    public Tetrahedron(double side){
        this.side = side;
    }
    
    @Override
    public double getArea(){
        double area = Math.sqrt(3) * Math.pow(side, 2);
        return area;
    }
    
    @Override
    public double getVolume(){
        double volume = (Math.pow(side, 3)) / 6 * Math.sqrt(2);
        return volume;
    }

}
