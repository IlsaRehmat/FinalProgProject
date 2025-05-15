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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Athlete other = (Athlete) obj;
        return this.name.equalsIgnoreCase(other.name);
    }
}

