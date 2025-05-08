import java.util.Date;
/**
 * Write a description of class PoweredActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PoweredActivity extends Activity {
    private Equipment equipment;
    
      public PoweredActivity(double distance, double duration, Date date, ModeOfTransport mode, Equipment equipment) {
        super(distance, duration, date, mode);
        this.equipment = equipment;
    }

    @Override
    public double getCaloriesBurned() {
        switch (mode) {
            case BIKING: return distance * 40;
            case E_BIKING: return distance * 20;
            case ROLLERBLADING: return distance * 60;
            default: return distance * 30;
        }
    }

    @Override
    public String getSummary() {
        return mode + " with " + equipment.getName() + ": " + distance + " km in " + duration + " hrs on " + date;
    }

    
    // pseudocode for Powered activity
    
    // equipment: import equipment class 
    
    //  Constructor PoweredActivity(mode: String, distance: float, duration:
    //  set self.mode = mode
    //  set self.distance = distance
    //  set self.duration = duration
    //  set self.equipment = equipment
    
    
    //Method getSpeed() Returns float
    //  if duration > 0 then
    //      Return distance / duration
    //  else
    //      Print "Invalid duration: cannot compute speed."
    //      Return 0

    //Method displayDetails()
    //  print "Powered Activity: " + mode
    //  print "Equipment Used: " + equipment
    //  print "Distance: " + distance + " km"
    //  print "Duration: " + duration + " hours"
    //  print "Speed: " + getSpeed() + " km/h"


}
