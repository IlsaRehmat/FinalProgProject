import java.util.*;
/**
 * Write a description of class DriverApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DriverApp
{
    public static void main(String[] args){
        System.out.println("Welcome to the Athlete Activity Tracker!");
        
         Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Athlete Activity Tracker!");

        // Prompt for user input
        System.out.print("Enter athlete's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter athlete's age: ");
        int age = -1;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age. Exiting.");
            return;
        }

        System.out.print("Enter athlete's gender (MALE, FEMALE, OTHER): ");
        String genderInput = scanner.nextLine().toUpperCase();
        Gender gender;
        try {
            gender = Gender.valueOf(genderInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid gender. Exiting.");
            return;
        }

        // Create the athlete using user input
        Athlete userAthlete = new Athlete(name, age, gender);
        System.out.println("\nCreated athlete: " + userAthlete);

        // You can now add activities or continue with rest of the app...
        // Example: userAthlete.performActivity(...);
    
        //Create equipment
        Equipment bike = new Equipment("Mountain Bike", "Bicycle");
        Equipment eBike = new Equipment("Electric Cruiser", "E-Bike");
        Equipment rollerblades = new Equipment("Inline Skates", "Rollerblades");
        
        //Create athletes
        Athlete saad = new Athlete("Saad", 20, Gender.MALE);
        Athlete ilsa = new Athlete("Ilsa", 17, Gender.FEMALE);
        Athlete nicolas = new Athlete("Nicolas", 19, Gender.MALE);
        
        //Create activities
        Activity walk1 = new RegularActivity(3.5, 1.0, new Date(), ModeOfTransport.WALKING);
        Activity swim1 = new RegularActivity(2.0, 0.75, new Date(), ModeOfTransport.SWIMMING);
        Activity run1 = new RegularActivity(5.0, 0.9, new Date(), ModeOfTransport.RUNNING);
        
        Activity bike1 = new PoweredActivity(15.0, 1.2, new Date(), ModeOfTransport.BIKING, bike);
        Activity eBike1 = new PoweredActivity(25.0, 1.0, new Date(), ModeOfTransport.E_BIKING, eBike);
        Activity skate1= new PoweredActivity(8.0, 0.6, new Date(), ModeOfTransport.ROLLERBLADING, rollerblades);
        
        //Assign activities to athletes
        saad.performActivity(walk1);
        saad.performActivity(bike1);
        
        ilsa.performActivity(swim1);
        ilsa.performActivity(eBike1);
        
        nicolas.performActivity(run1);
        nicolas.performActivity(skate1);
        
        //Store all athletes in a list
        List<Athlete> athletes = new ArrayList<>();
        athletes.add(userAthlete); // add the one from input
        athletes.add(saad);
        athletes.add(ilsa);
        athletes.add(nicolas);
        
        //Print all athletes
        System.out.println("\n--- Athletes ---");
        for(Athlete athlete : athletes){
            System.out.println(athlete);
        }
        
        // Print all activities
        System.out.println("\n--- All Activities ---");
        for (Athlete athlete : athletes) {
            for (Activity activity : athlete.getActivities()) {
                System.out.println(athlete.getName() + ": " + activity.getSummary());
            }
        }

        // Filter and print activities by a specific mode (e.g., BIKING)
        ModeOfTransport filterMode = ModeOfTransport.BIKING;
        System.out.println("\n--- Activities filtered by mode (" + filterMode + ") ---");
        for (Athlete athlete : athletes) {
            for (Activity activity : athlete.getActivities()) {
                if (activity.getMode() == filterMode) {
                    System.out.println(athlete.getName() + ": " + activity.getSummary());
                }
            }
        }

        // Print total distance and calories per athlete
        System.out.println("\n--- Stats per Athlete ---");
        for (Athlete athlete : athletes) {
            double totalDistance = athlete.getTotalDistance();
            double totalCalories = athlete.getBurnedCalories();
            System.out.println(athlete.getName() + ": Total Distance = " + totalDistance + " km, Calories Burned = " + totalCalories + " kcal");
        }
    }
    
    
}
