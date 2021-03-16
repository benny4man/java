
package Week8HW804;


public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        if(length > 20 || length < 1){
            throw new IllegalArgumentException("length must be within 1-20");
        }
        if(width > 20 || width < 1){
            throw new IllegalArgumentException("length must be within 1-20");
        }
        this.length = length;
        this.width = width;
    }
    public Rectangle(double length){
        this(length, 1);
    }
    public Rectangle(){
        this(1, 1);
    }
    
    public void setWidth(double width){
        if(width > 20 || width < 1){
            throw new IllegalArgumentException("length must be within 1-20");
        }
        this.width = width;
    }
    
    public void setLength(double length){
        if(length > 20 || length < 1){
            throw new IllegalArgumentException("length must be within 1-20");
        }
        this.length = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getArea(){
        double area = length * width;
        return area;
    }
    
    public double getPerimeter(){
        double perm = (2 * length) + (2 * width);
        return perm;
    }
}
