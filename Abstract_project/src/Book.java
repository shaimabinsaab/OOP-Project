public class Book extends Product {

    private String auther;

    public Book() {
    }

    public Book(String name, double price, String auther) {
        super(name, price);
        this.auther = auther;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    double getDiscount() {
        return getPrice()*0.5;
    }

}
