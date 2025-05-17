import java.util.Date;
/**
 * Represents a regular (non-powered) physical activity performed by an athlete,
 * such as walking, running, or swimming.
 * It customizes calorie calculation depending on the mode of transport.
 */
public class RegularActivity extends Activity {
   /**
    * Constructs a RegularActivity with the given distance, duration, date, and mode.
    */
   public RegularActivity(double distance, double duration, Date date, ModeOfTransport mode) {
        super(distance, duration, date, mode);
   } 

   /**
    * Calculates the calories burned for a regular activity.
     * Different modes of transport have different burn rates:
     * - WALKING: 55 kcal/km
     * - RUNNING: 100 kcal/km
     * - SWIMMING: 120 kcal/km
     * Other modes default to 50 kcal/km.
    */
   @Override
    public double getCaloriesBurned() {
       switch (mode) {
           case WALKING: return distance * 55;
           case RUNNING: return distance * 100;
           case SWIMMING: return distance * 120;
       }
       return distance * 50;
   } 

   /**
    * Returns a string representation of the regular activity.
    */
    @Override
    public String toString() {
       return mode + ": " + distance + " km in " + duration + " hrs on " + date;
   }
}
