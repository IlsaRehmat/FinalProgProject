import java.util.Date;
/**
 * Write a description of class Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Activity
{
    protected double distance;
    protected double duration;
    protected Date date;
    protected ModeOfTransport mode;
        /**
     * Constructor for objects of class Activity
     */
    public Activity(double distance, double duration, Date date, ModeOfTransport mode)
    {
        this.distance = distance;
        this.duration = duration;
        this.date = date;
        this.mode = mode;
    }
    
    public abstract String getSummary();
    
    public abstract double getCaloriesBurned();
    
    public double getDistance(){
        return distance;
    }
    
    public double getDuration(){
        return duration;
    }
    
    public Date getDate(){
        return date;
    }
    
    public ModeOfTransport getMode(){
        return mode;
    }
}