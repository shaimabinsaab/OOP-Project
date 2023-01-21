public abstract class Trip {

    private String TripNumbr;
    private double distance;
    private double speed;
    private String startTime;
    private String endTime;


    public Trip(String tripNumbr, double distance, double speed, String startTime, String endTime) {
        TripNumbr = tripNumbr;
        this.distance = distance;
        this.speed = speed;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public abstract int Calculateduration();
    public double Convirtminuttohours(int min){
      return 0.0;
    }

    public String calculatearrivaltime(){
        return "0.0";
    }


}
