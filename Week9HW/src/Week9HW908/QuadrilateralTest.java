
package Week9HW908;


public class QuadrilateralTest {
   public static void main(String[] args) {
        Square sqr = new Square(0,0,4,0,0,-4,4,-4);
        System.out.println(sqr.getArea());
        
        Rectangle rect = new Rectangle(0,0,6,0,0,-4,6,-4);
        System.out.println(rect.getArea());
        
        Parallelogram para = new Parallelogram(0,0,6,0,-1,-4,5,-4);
        System.out.println(para.getArea());
        
        Trapezoid trap = new Trapezoid(0,0,6,0,-1,-4,7,-4,4);
        System.out.println(trap.getArea());
    }
}
