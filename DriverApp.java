import java.util.*;

/**
 * The DriverApp class provides the main interface for the Athlete Tracker application.
 * It allows users to create athletes, equipment, and activities, and to display
 * statistics for all or individual athletes.
 *
 * This is a console-based menu-driven program.
 * 
 * Features include:
 * - Creating equipment and athletes
 * - Logging powered and regular activities
 * - Listing all athletes and activities
 * - Viewing athlete statistics
 */
public class DriverApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Athlete> athletes = new ArrayList<>();
    private static final List<Equipment> equipmentList = new ArrayList<>();
    
    
    /**
     * Main method to run the application
     * 
     */
    public static void main(String[] args) {
        System.out.println("+--------------------------------------+");
        System.out.println("        Welcome to Athlete Tracker      ");
        System.out.println("   Keep moving, keep growing, keep up!  ");
        System.out.println("+--------------------------------------+\n");
        
        int choice;
        do {
            printMenu();
            choice = getIntInput("Enter your choice: ");

            switch (choice) {
                case 1 -> createEquipment();
                case 2 -> createAthlete();
                case 3 -> createActivity();
                case 4 -> listAllAthletes();
                case 5 -> listAllActivities();
                case 6 -> listActivitiesByAthlete();
                case 7 -> displayAthleteStatsForOne();
                case 8 -> displayAthleteStatsForAll();
                case 0 -> System.out.println(" Thank you for using the Athlete Tracker. Goodbye!! ");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }
    
    /**
     * Prints the main menu to the console.
     */
    private static void printMenu() {
        System.out.println("\n--- Athlete Activity Tracker ---");
        System.out.println("1. Create an equipment");
        System.out.println("2. Create an athlete");
        System.out.println("3. Create an activity");
        System.out.println("4. List all athletes");
        System.out.println("5. List all activities");
        System.out.println("6. List activities by athlete");
        System.out.println("7. List one athlete's stats");
        System.out.println("8. List all athlete's stats");
        System.out.println("0. Exit");
    }
    
    /**
     * Prompts the user to create a new equipment item.
     */
    private static void createEquipment(){
        System.out.println("Enter equipment name: ");
        String name = scanner.nextLine();
        System.out.println("Enter equipment type: ");
        String type = scanner.nextLine();
        equipmentList.add(new Equipment(name, type));
        System.out.println("Equipment created.");
    }
    
    /**
     * Prompts the user to create a new athlete.
     */
    private static void createAthlete() {
        System.out.println("Enter athlete name: ");
        String name = scanner.nextLine();
        int age = getIntInput("Enter age: ");
        System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        athletes.add(new Athlete(name, age, gender));
        System.out.println("Athlete created.");
    }
    
    /**
     *  Prompts the user to log a new activity for an existing athlete.
     */
    private static void createActivity() {
        System.out.println("Enter athlete name: ");
        String name = scanner.nextLine();
        Athlete athlete = findAthlete(name);
        if (athlete == null) {
            return;
        }

        System.out.println("Is activity powered? (yes/no): ");
        boolean isPowered = scanner.nextLine().equalsIgnoreCase("yes");

        System.out.println("Enter mode (WALKING, RUNNING, SWIMMING, BIKING, E_BIKING, ROLLERBLADING): ");
        ModeOfTransport mode = ModeOfTransport.valueOf(scanner.nextLine().toUpperCase());

        double distance = getDoubleInput("Enter distance(km): ");
        double duration = getDoubleInput("Enter duration(hours): ");

        Activity activity;
        if (isPowered) {
            System.out.println("Enter equipment name: ");
            String eqName = scanner.nextLine();
            Equipment eq = findEquipment(eqName);
            if (eq == null) {
                return;
            }
            activity = new PoweredActivity(distance, duration, new Date(), mode, eq);
        } else {
            activity = new RegularActivity(distance, duration, new Date(), mode);
        }

        athlete.performActivity(activity);
        System.out.println("Activity added.");
    }
    
    /**
     * Lists all registered athletes.
     */
    private static void listAllAthletes() {
        System.out.println("--- All Athletes ---");
        for (Athlete a : athletes){
            System.out.println(a);
        }
    }

    /**
     * Lists all activities across all athletes.
     */
    private static void listAllActivities() {
        for (Athlete a : athletes){
            for (Activity act : a.getActivities()){
                System.out.println(" " + act);
            }
        }
    }

    /**
     * Lists activities performed by a specific athlete.
     */
    private static void listActivitiesByAthlete() {
        System.out.println("Enter athlete name: ");
        Athlete athlete = findAthlete(scanner.nextLine());
        if (athlete != null){
            for (Activity act : athlete.getActivities()){
                System.out.println(act);
            }
        }
    }

    /**
     * Displays statistics (distance, duration, calories) for a single athlete.
     */
    private static void displayAthleteStatsForOne() {
        System.out.println("Enter athlete name: ");
        String name = scanner.nextLine();
        Athlete athlete = findAthlete(name);
    
        if (athlete == null) {
            System.out.println("Athlete not found.");
            return;
        }
    
        double totalDistance = 0;
        double totalDuration = 0;
        double totalCalories = athlete.getBurnedCalories();
    
        for (Activity activity : athlete.getActivities()) {
            totalDistance += activity.getDistance();
            totalDuration += activity.getDuration();
        }
    
        System.out.println("\n--- Statistics for " + athlete.getName() + " ---");
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Duration: " + totalDuration + " hours");
        System.out.println("Calories Burned: " + totalCalories + " kcal");
    }

    /**
     * Displays statistics for all athletes collectively.
     */
    private static void displayAthleteStatsForAll() {
        double totalDistanceAll = 0;
        double totalDurationAll = 0;
        double totalCaloriesAll = 0;
    
        System.out.println("\n--- All Athlete Statistics ---");
    
        for (Athlete athlete : athletes) {
            double totalDistance = 0;
            double totalDuration = 0;
            double totalCalories = athlete.getBurnedCalories();
    
            for (Activity activity : athlete.getActivities()) {
                totalDistance += activity.getDistance();
                totalDuration += activity.getDuration();
            }
    
            totalDistanceAll += totalDistance;
            totalDurationAll += totalDuration;
            totalCaloriesAll += totalCalories;
    
            System.out.println("\nAthlete: " + athlete.getName());
            System.out.println(" - Total Distance: " + totalDistance + " km");
            System.out.println(" - Total Duration: " + totalDuration + " hours");
            System.out.println(" - Calories Burned: " + totalCalories + " kcal");
        }
    
        System.out.println("\n--- Totals Across All Athletes ---");
        System.out.println("Total Distance: " + totalDistanceAll + " km");
        System.out.println("Total Duration: " + totalDurationAll + " hours");
        System.out.println("Total Calories Burned: " + totalCaloriesAll + " kcal");
    }

    /**
     * Finds an Athlete by name.
     */
    private static Athlete findAthlete(String name) {
        for (Athlete a : athletes){
            if (a.getName().equalsIgnoreCase(name)){
                return a;
            }
        }
        System.out.println("Athlete not found.");
        return null;
    }
    
    /**
     * Reads an integer input from the user with validation.
     */
     private static int getIntInput(String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number. " + prompt);
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine(); 
        return num;
    }
    
    /**
     * Reads a double input from the user with validation.
     */
    private static double getDoubleInput(String prompt) {
        System.out.println(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Please enter a valid number. " + prompt);
            scanner.next();
        }
        double num = scanner.nextDouble();
        scanner.nextLine(); 
        return num;
    }
    
    /**
     * Finds equipment by name.
     */
    private static Equipment findEquipment(String name){
        for(Equipment e : equipmentList){
            if(e.getName().equalsIgnoreCase(name)){
                return e;
            }
        }
        System.out.println("Equipment not found.");
        return null;
    }
}