class Rectangle extends Shape{
    protected double length;
    protected double width;
    
    public Rectangle(Double length, Double width, String color, Boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setwidth(double width){
        this.width = width;
    }
    public double getwidth(){
        return width;
    }
    @Override
    public double getArea() {
        return width * length;
    }
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }
    @Override
    public String toString() {
        return "Length: " + length + ", Width: " + width + ", color: " + color + ", isFilled: " + filled;
    }
}