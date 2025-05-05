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
    
    public ModeOfTransport getMode(){
        return mode;
    }
        
}
    
    
    // public string getSummary(){
        //initializes summary as an empty string
        // Pseudocode
        // summary = ""
        //
        //summary = summary + "Date: " + format(date)
        //summary = summary + ",Mode of transport: " + mode.toString()
        //summary = summary + ",Distance covered: " + distance + "km"
        //summary = summary + ",duration: " + duration + "hours"        
        // return summary

    //public double getCaloriesBurned(){
        //initializes calories as 0
        
        //set calories = distance * 50
        
        //Return calories

