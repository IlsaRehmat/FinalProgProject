import java.util.List;

/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    // instance variables - replace the example below with your own
    private int x;
    private List<Activity> activities;
    private Gender gender;
    /**
     * Constructor for objects of class Athlete
     */
    public Athlete()
    {
        // initialise instance variables
        x = 0;
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
    }

