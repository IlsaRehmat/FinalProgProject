import java.util.*;

public class DriverApp {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Athlete> athletes = new ArrayList<>();
    private static final List<Equipment> equipmentList = new ArrayList<>();
    
    public static void main(String[] args) {
        int choice = 0;
        
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
                case 7 -> calculateCaloriesBurnedByAthlete();
                case 0 -> System.out.println(" Thank you for using the Athlete Tracker. Stay strong! ");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
        
        
    }
    
    private static void printMenu() {
        System.out.println("\n--- Athlete Activity Tracker ---");
        System.out.println("1. Create an equipment");
        System.out.println("2. Create an athlete");
        System.out.println("3. Create an activity");
        System.out.println("4. List all athletes");
        System.out.println("5. List all activities");
        System.out.println("6. List activities by athlete");
        System.out.println("7. Calculate burned calories by athlete");
        System.out.println("0. Exit");
    }
    
    
    
}