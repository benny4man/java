
package Week9HW908;


public class Trapezoid extends Quadrilateral{
    int h;
    
    public Trapezoid(int x1,int y1, int x2,int y2, int x3,int y3, int x4,int y4, int h){
        super(x1,y1,x2,y2,x3,y3,x4,y4);
        
        this.h = h;
    }
    
    public double getArea(){
        double s1 = Math.hypot(super.getP1().getX()-super.getP2().getX(), super.getP1().getY()-super.getP2().getY());
        double s2 = Math.hypot(super.getP3().getX()-super.getP4().getX(), super.getP3().getY()-super.getP4().getY());
        double s3 = Math.hypot(super.getP1().getX()-super.getP3().getX(), super.getP1().getY()-super.getP3().getY());
        double s4 = Math.hypot(super.getP2().getX()-super.getP4().getX(), super.getP2().getY()-super.getP4().getY());
        
        double area = (s1+s2)/2*h;
        return area;   
    }
}
