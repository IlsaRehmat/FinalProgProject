
import java.util.Date;

/**
 * Represents a powered activity performed by an athlete using specific equipment.
 */
public class PoweredActivity extends Activity {
    private Equipment equipment;
    
    /**
     * Constructs a PoweredActivity with specified details and associated equipment.
     */
    public PoweredActivity(double distance, double duration, Date date, ModeOfTransport mode, Equipment equipment) {
        super(distance, duration, date, mode);
        this.equipment = equipment;
    }

    /**
     * Returns a description of the powered activity.
     */
    @Override
    public String toString() {
        return "Powered Activity: " + mode + " using " + equipment + " for " + distance + " km in " + duration + " hours.";
    }

    /**
     * Calculates the calories burned for a powered activity.
     * This is typically lower than regular activities.
     */
    @Override
    public double getCaloriesBurned() {
        return distance * 40;
    }

    /**
     * returns the equipment used in the activity.
     */
    public Equipment getEquipment() { 
        return equipment; 
    }
}
