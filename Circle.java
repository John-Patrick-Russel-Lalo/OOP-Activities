class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, Boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 3.14159 * radius * radius;
    }
    public double getPerimeter() {
        return 2 * 3.14159 * radius;
    }
    @Override
    public String toString() {
        return "Circle: radius =" + radius + ", color = " + color + ", isfilled = " + filled ;
    }
}