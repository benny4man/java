
package Week8HW804;


public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(5);
        
        System.out.printf("Rectangle 1 length: %.1f%n",rec1.getLength());
        System.out.printf("Rectangle 1 width: %.1f%n",rec1.getWidth());
        System.out.printf("Rectangle 2 length: %.1f%n",rec2.getLength());
        System.out.printf("Rectangle 2 width: %.1f%n",rec2.getWidth());
        
        rec2.setLength(25);
        rec2.setWidth(25);
    }
}
