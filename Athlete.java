import java.util.List;
import java.util.ArrayList;
/**
 * Represents an athlete who performs various physical activities.
 * Stores the athlete's personal information and a list of completed activities.
 * Provides methods to track performance and stats
 *
 * @author (Ilsa, Saad, Nicolas)
 * @version (17 may 2025)
 */
public class Athlete
{
    private String name;
    private int age;
    private Gender gender;
    private List<Activity> activities;
    /**
     * Constructs an Athlete with the specified name,age and gender.
     */
    public Athlete(String name, int age, Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.activities = new ArrayList<>();
    }
    
    /**
     * Adds an activity to the athlete's list of performed acitivities.
     */
    public void performActivity(Activity activity){
        activities.add(activity);
    }
    
    /**
     * Returns the list of activities performed by the athlete.
     */
    public List<Activity> getActivities(){
        return activities;
    }
    
    /**
     * Calculates the total distance of all activities performed.
     */
    public double getTotalDistance(){
        double totalDistance = 0.0;
        for(Activity activity : activities){
            totalDistance += activity.getDistance();
        }
        return totalDistance;
    }
    
    /**
     * Calculates the total number of calories burned from all activities.
     */
    public double getBurnedCalories(){
        double totalCalories = 0.0;
        for(Activity activity : activities){
            totalCalories += activity.getCaloriesBurned();
        }
        return totalCalories;
    }
    
    /**
     * Returns the athlete's name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the athlete's age.
     */
    public int getAge(){
        return age;
    }
    
    /**
     * Returns the athlete's gender.
     */
    public Gender getGender(){
        return gender;
    }
    
    /**
     * Returns a string representation of the athlete.
     */
    @Override
    public String toString() {
        return name + " (" + age + ", " + gender + ")";
    }
    
    /**
     * Checks if another object is equal to this athlete.
     * Equality is based on name (case-insensitive).
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Athlete other = (Athlete) obj;
        return this.name.equalsIgnoreCase(other.name);
    }
}

