import java.util.Date;

/**
 * Represents a physical activity performed by an athlete.
 * This abstract data type stores distance, duration, date, and mode of transport.
 * It provides accessors and a basic calorie burn calculation.
 * Other types like RegularActivity and PoweredActivity may extend this class.
 */
public class Activity {
    protected double distance;
    protected double duration;
    protected Date date;
    protected ModeOfTransport mode;

    /**
     * Constructs an Activity with the given distance, duration, date, and mode.
     */
    public Activity(double distance, double duration, Date date, ModeOfTransport mode) {
        this.distance = distance;
        this.duration = duration;
        this.date = date;
        this.mode = mode;
    }
    
    /**
     * Returns a string representation of the activity
     */
    public String toString() {
        return mode + ": " + distance + " km in " + duration + " hrs on " + date;
    }

    /**
     * Calculates the calories burned based on distance 
     * This method can be overridden by subclasses.
     */
    public double getCaloriesBurned() {
        return distance * 50;
    }
    
    /**
     * Returns the distance of the activity.
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Returns the duration of the activity.
     */
    public double getDuration() {
        return duration;
    }

    /**
     * Returns the date of the activity.
     */
    public Date getDate() {
        return date;
    }

    /**
     * Returns the mode of transport used in the activity.
     */
    public ModeOfTransport getMode() {
        return mode;
    }
}