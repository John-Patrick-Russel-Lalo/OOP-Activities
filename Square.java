class Square extends Rectangle {
    protected double side;

    public Square(double side, double length, double width, String color, boolean filled){
        super(width, width, color, filled);
    }
    public void setSide(double side){
        this.side = side;
    }
    public double getSide(){
        return this.side;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "Length: " + length + ", Width: " + width + ", color: " + color + ", isFilled: " + filled;
    }
}