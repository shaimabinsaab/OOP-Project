public class Train extends Trip{
    public Train(String tripNumbr, double distance, double speed, String startTime, String endTime) {
        super(tripNumbr, distance, speed, startTime, endTime);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int Calculateduration() {

        int end=Integer.valueOf(getStartTime());
        int value=Integer.valueOf(calculatearrivaltime());
        return end-value ;
    }

    private int getStartTime() {
        return 0;
    }

    @Override
    public double Convirtminuttohours(int min) {
        return min/60;
    }

    @Override
    public String calculatearrivaltime() {

       double arrivaltime= getDistance()/getSpeed();


       String txt= String.valueOf(arrivaltime);
        return txt;
    }

    private double getSpeed() {
        return 0;
    }

    private double getDistance() {
    }
}
