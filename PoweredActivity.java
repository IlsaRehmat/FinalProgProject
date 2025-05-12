
import java.util.Date;

public class PoweredActivity extends Activity {
    private Equipment equipment;

    public PoweredActivity(double distance, double duration, Date date, ModeOfTransport mode, Equipment equipment) {
        super(distance, duration, date, mode);
        this.equipment = equipment;
    }

    @Override
    public String getSummary() {
        return "Powered Activity: " + mode + " using " + equipment + " for " + distance + " km in " + duration + " hours.";
    }

    @Override
    public double getCaloriesBurned() {
        return distance * 40;
    }

    public Equipment getEquipment() { 
        return equipment; 
    }
}
