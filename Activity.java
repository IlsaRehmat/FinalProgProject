import java.util.Date;

public class Activity {
    protected double distance;
    protected double duration;
    protected Date date;
    protected ModeOfTransport mode;

    public Activity(double distance, double duration, Date date, ModeOfTransport mode) {
        this.distance = distance;
        this.duration = duration;
        this.date = date;
        this.mode = mode;
    }

    public String toString() {
        return mode + ": " + distance + " km in " + duration + " hrs on " + date;
    }

    public double getCaloriesBurned() {
        return distance * 50;
    }

    public double getDistance() {
        return distance;
    }

    public double getDuration() {
        return duration;
    }

    public Date getDate() {
        return date;
    }

    public ModeOfTransport getMode() {
        return mode;
    }
}