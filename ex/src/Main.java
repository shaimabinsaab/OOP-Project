public class Main {
    public static void main(String[] args) {

        Train t=new Train("dg",40,5,"1","4");

        System.out.println(t.Convirtminuttohours(160));

        System.out.println(t.calculatearrivaltime());

        System.out.println(t.Calculateduration());

    }
}