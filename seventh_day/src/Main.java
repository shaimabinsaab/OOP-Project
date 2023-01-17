public class Main {
    public static void main(String[] args) {

        //shape test
        Shape sh=new Shape();

        System.out.println(sh.toString());

        Shape new_shape=new Shape("Red",false);
        System.out.println(new_shape.toString());


        //circle test
        Circle C=new Circle();
        System.out.println(C.toString());

        System.out.println(C.getArea());
        System.out.println(C.getPerimeter());


        Circle c2=new Circle(5.6);
        System.out.println(c2.toString());
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());

        Circle c3=new Circle("blue",false,3.2);
        System.out.println(c3.toString());
        System.out.println(c3.getPerimeter());
        System.out.println(c3.getArea());


        //rectangle test

        Rectangle r=new Rectangle();
        System.out.println(r.toString());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());

        Rectangle r2=new Rectangle(3.3,23.5);
        System.out.println(r2.toString());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

        Rectangle r3=new Rectangle("gray",false,213.5,24.6);
        System.out.println(r3.toString());
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimeter());


        //square test

        Square s=new Square();
        System.out.println(s.toString());
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());

        Square s2=new Square(23.24,13333.3);
        System.out.println(s2.toString());
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());

        Square s3=new Square("yellow",false,23.4,556.6);
        System.out.println(s3.toString());
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());







    }
}