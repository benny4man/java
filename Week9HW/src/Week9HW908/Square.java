
package Week9HW908;


public class Square extends Quadrilateral {
    
    public Square(int x1,int y1, int x2,int y2, int x3,int y3, int x4,int y4){
        super(x1,y1,x2,y2,x3,y3,x4,y4);
    }
    
    public double getArea(){
        double l = Math.hypot(super.getP1().getX()-super.getP2().getX(), super.getP1().getY()-super.getP2().getY());
        double area = l * l;
        return area;
    }
}
