public class Circle extends Shape{
    private double radius=1.0;

    public Circle() {
        this.radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){

        return (22*radius*radius)/7;

    }
    public double getPerimeter(){
        return 2*(radius*Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "which is subclass of"+super.toString()+'}';
    }

}
