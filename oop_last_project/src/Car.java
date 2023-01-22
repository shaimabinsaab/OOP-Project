import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car extends Trip{

    public Car(String tripNumber, double distance, double speed, String statTime) {
        super(tripNumber, distance, speed, statTime);
    }

    @Override
    public long CalculateDuration() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        Date date1 = format.parse(super.getStatTime());
        Date date2 = format.parse(CalculateArrivalTime());
        long difference =  (date2.getTime() - date1.getTime());
        return difference;
    }

    @Override
    public double ConvertMinToHour(int min) {
        return min/60;
    }

    @Override
    public String CalculateArrivalTime() {
        double arrivaltime= getDistance()/getSpeed();


        String arriv= String.valueOf(arrivaltime);

        return arriv;

    }
}
