import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    private String name;
    private int age;
    private Gender gender;
    private List<Activity> activities;
    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String name, int age, Gender gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.activities = new ArrayList<>();
    }
    
    public void performActivity(Activity activity){
        activities.add(activity);
    }
    
    public List<Activity> getActivities(){
        return activities;
    }
    
    public double getTotalDistance(){
        double totalDistance = 0.0;
        for(Activity activity : activities){
            totalDistance += activity.getDistance();
        }
        return totalDistance;
    }
    
    public double getBurnedCalories(){
        double totalCalories = 0.0;
        for(Activity activity : activities){
            totalCalories += activity.getCaloriesBurned();
        }
        return totalCalories;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public Gender getGender(){
        return gender;
    }
    
    @Override
    public String toString() {
        return name + " (" + age + ", " + gender + ")";
    }
}


    // Psudocode for Athlete class
    
    // Variables:
        // name
        // age
        // gender
        // activities (list)

    // Method initialize(name, age, gender):
        // set this.name = name
        // set this.age = age
        // set this.gender = gender
        // set activities to empty list

    // Method performActivity(activity):
        // add activity to activities

    // Method getActivities():
        // Return activities

    // Method getTotalDistance():
        // set totalDistance to 0
        // for each activity in activities:
            // add activity.distance to totalDistance
        // Return totalDistance

    // Method getBurnedCalories():
        // set totalCalories to 0
        // for each activity in activities:
            // add activity.getCaloriesBurned() to totalCalories
        // Return totalCalories

    // Method getName():
        // Return name

    // Method getAge():
        // Return age

    // Method getGender():
        // Return gender


