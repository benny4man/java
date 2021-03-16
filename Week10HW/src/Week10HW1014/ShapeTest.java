package Week10HW1014;



public class ShapeTest {
    public static void main(String[] args){
        Circle circle = new Circle(5.2);
        Sphere sphere = new Sphere(6.5);
        Square square = new Square(7.0);
        Cube cube = new Cube(8.2);
        Triangle triangle = new Triangle(5, 9.0);
        Tetrahedron tetra = new Tetrahedron(9.6);
        
        Shape[] shapes = {circle,sphere,square,cube,triangle,tetra};
        
        for(Shape currentShape : shapes){
            System.out.println();
            System.out.println(currentShape.getClass().getName());
            
            if(currentShape instanceof TwoDimensionalShape){
                TwoDimensionalShape shape = (TwoDimensionalShape) currentShape;
                System.out.printf("Area: %f%n", shape.getArea());
            }
            else if(currentShape instanceof ThreeDimensionalShape){
                ThreeDimensionalShape shape = (ThreeDimensionalShape) currentShape;
                System.out.printf("Area: %f%nVolume: %f%n", shape.getArea(),shape.getVolume());
            }
        }
    }
}
