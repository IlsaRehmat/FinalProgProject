import java.util.Date;
/**
 * Write a description of class RegularActivity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegularActivity extends Activity {
   public RegularActivity(double distance, double duration, Date date, ModeOfTransport mode) {
        super(distance, duration, date, mode);
   } 

   @Override
    public double getCaloriesBurned() {
       switch (mode) {
           case WALKING: return distance * 55;
           case RUNNING: return distance * 100;
           case SWIMMING: return distance * 120;
       }
       return distance * 50;
   } 

    @Override
    public String getSummary() {
       return mode + ": " + distance + " km in " + duration + " hrs on " + date;
   }
}
