public class Square extends Rectangle{
    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide(){
        return getArea();
    }

    public void setSide(double width){

    }

    @Override
    public String toString() {
        return "Square with side="+getSide()+"which is subclass of:"+super.toString();
    }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public double getPerimeter() {
        return 4*getSide();
    }
}
