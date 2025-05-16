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
    
    private static void createEquipment(){
        System.out.println("Enter equipment name: ");
        String name = scanner.nextLine();
        System.out.println("Enter equipment type: ");
        String type = scanner.nextLine();
        equipmentList.add(new Equipment(name, type));
        System.out.println("Equipment created.");
    }
    
    private static void createAthlete() {
        System.out.println("Enter athlete name: ");
        String name = scanner.nextLine();
        int age = getIntInput("Enter age: ");
        System.out.print("Enter gender (MALE/FEMALE/OTHER): ");
        Gender gender = Gender.valueOf(scanner.nextLine().toUpperCase());
        athletes.add(new Athlete(name, age, gender));
        System.out.println("Athlete created.");
    }
    
    private static void listAllAthletes() {
        System.out.println("--- All Athletes ---");
        for (Athlete a : athletes) System.out.println(a);
    }

    private static void listAllActivities() {
        for (Athlete a : athletes)
            for (Activity act : a.getActivities())
                System.out.println(" " + act);
    }

    private static void listActivitiesByAthlete() {
        System.out.println("Enter athlete name: ");
        Athlete athlete = findAthlete(scanner.nextLine());
        if (athlete != null)
            for (Activity act : athlete.getActivities())
                System.out.println(act);
    }

    private static void calculateCaloriesBurnedByAthlete() {
        for (Athlete a : athletes)
            System.out.println(a.getName() + ": " + a.getBurnedCalories() + " kcal");
    }

    private static Athlete findAthlete(String name) {
        for (Athlete a : athletes){
            if (a.getName().equalsIgnoreCase(name)){
                return a;
            }
            System.out.println("Athlete not found.");
        }
        return null;
    }
    
    private static Equipment findEquipment(String name){
        for(Equipment e : equipmentList){
            if(e.getName().equalsIgnoreCase(name)){
                return e;
            }
            System.out.println("Equipment not found.");
        }
        return null;
    }
}