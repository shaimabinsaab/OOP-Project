public class car extends Trip{
    public car(String tripNumbr, double distance, double speed, String startTime, String endTime) {
        super(tripNumbr, distance, speed, startTime, endTime);
    }

    @Override
    public int Calculateduration() {
        return 0;
    }

    @Override
    public double Convirtminuttohours(int min) {
        return super.Convirtminuttohours(min);
    }

    @Override
    public String calculatearrivaltime() {
        return super.calculatearrivaltime();
    }
}
