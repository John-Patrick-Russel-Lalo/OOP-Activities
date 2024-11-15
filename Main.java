public class Main{
    public static void main(String[] args) {
        Shape circle = new Circle(45.0, "blue", true);
        System.out.println("\n" + "Area of Circle: " + circle.getArea());
        System.out.println("Perimeter of Circle: " +circle.getPerimeter());
        System.out.println(circle.toString() + "\n");

        Shape Rectangle = new Rectangle(33.9, 90.0, "blue", true);
        System.out.println("Area of Rectangle: " + Rectangle.getArea());
        System.out.println("Perimeter of Rectangle: " + Rectangle.getPerimeter());
        System.out.println(Rectangle.toString() + "\n");
        
        Shape Square = new Square(50.0, 55.0, 25.0, "blue", true);
        System.out.println("Area of Square: " + Square.getArea());
        System.out.println("Perimeter of Square: " + Square.getPerimeter());
        System.out.println(Square.toString());
    }
}
