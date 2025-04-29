
/**
 * Write a description of class PoweredActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PoweredActivity extends Activity
{
    // instance variables - replace the example below with your own
    private int x;
    private Equipment equipment;
    /**
     * Constructor for objects of class PoweredActivity
     */
    public PoweredActivity()
    {
        // initialise instance variables
        x = 0;
    }
    
    // pseudocode for Powered activity
    
    // equipment: String 
    
    //  CONSTRUCTOR PoweredActivity(mode: String, distance: float, duration:
    //  SET self.mode = mode
    //  SET self.distance = distance
    //    SET self.duration = duration
     //   SET self.equipment = equipment
    //END CONSTRUCTOR
    
    //METHOD getSpeed() RETURNS float
    //    IF duration > 0 THEN
    //        RETURN distance / duration
    
    //ELSE
    //        PRINT "Invalid duration: cannot compute speed."
    //        RETURN 0
    //    END IF
    //END METHOD

    //METHOD displayDetails()
    //    PRINT "Powered Activity: " + mode
    //   PRINT "Equipment Used: " + equipment
    //    PRINT "Distance: " + distance + " km"
    //    PRINT "Duration: " + duration + " hours"
    //    PRINT "Speed: " + getSpeed() + " km/h"
    // END METHOD


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
