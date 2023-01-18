public class Main {
    public static void main(String[] args) {

        Book b=new Book("life",20.8,"shaima");
        System.out.println(b.getDiscount());

        Movie M=new Movie("jomanje",40.9,"josh");
        System.out.println(M.getDiscount());

        MovablePoint mo=new MovablePoint(3,4,5,6);
        mo.MoveUp();
        mo.MoveDowen();
        mo.MoveLeft();
        mo.MoveRight();

    }
}