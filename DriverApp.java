import java.util.*;

public class DriverApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Athlete Activity Tracker!");

        // Create equipment
        Equipment bike = new Equipment("Mountain Bike", "Bicycle");
        Equipment eBike = new Equipment("Electric Cruiser", "E-Bike");
        Equipment rollerblades = new Equipment("Inline Skates", "Rollerblades");

        // Create athletes
        Athlete saad = new Athlete("Saad", 20, Gender.MALE);
        Athlete ilsa = new Athlete("Ilsa", 17, Gender.FEMALE);
        Athlete nicolas = new Athlete("Nicolas", 19, Gender.MALE);

        // Create activities
        Activity walk1 = new RegularActivity(3.5, 1.0, new Date(), ModeOfTransport.WALKING);
        Activity swim1 = new RegularActivity(2.0, 0.75, new Date(), ModeOfTransport.SWIMMING);
        Activity run1 = new RegularActivity(5.0, 0.9, new Date(), ModeOfTransport.RUNNING);

        Activity bike1 = new PoweredActivity(15.0, 1.2, new Date(), ModeOfTransport.BIKING, bike);
        Activity eBike1 = new PoweredActivity(25.0, 1.0, new Date(), ModeOfTransport.E_BIKING, eBike);
        Activity skate1 = new PoweredActivity(8.0, 0.6, new Date(), ModeOfTransport.ROLLERBLADING, rollerblades);

        // Assign activities
        saad.performActivity(walk1);
        saad.performActivity(bike1);
        ilsa.performActivity(swim1);
        ilsa.performActivity(eBike1);
        nicolas.performActivity(run1);
        nicolas.performActivity(skate1);

        List<Athlete> athletes = Arrays.asList(saad, ilsa, nicolas);

        // Menu
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 1) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Quit");
            System.out.println("2. List all athletes");
            System.out.println("3. List all activities");
            System.out.println("4. Filter activities by mode");
            System.out.println("5. Show stats per athlete");
            System.out.println("6. List all activities per athlete");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("Goodbye!");
                    break;
                case 2:
                    System.out.println("\n--- Athletes ---");
                    for (Athlete athlete : athletes) {
                        System.out.println(athlete);
                    }
                    break;
                case 3:
                    System.out.println("\n--- All Activity Types ---");
                    for (Athlete athlete : athletes) {
                        for (Activity activity : athlete.getActivities()) {
                            System.out.println(activity.getMode());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Enter mode (WALKING, RUNNING, BIKING, E_BIKING, ROLLERBLADING, SWIMMING): ");
                    String inputMode = scanner.nextLine().toUpperCase();

                    boolean isValidMode = false;
                    for (ModeOfTransport mode : ModeOfTransport.values()) {
                        if (mode.name().equals(inputMode)) {
                            isValidMode = true;
                            System.out.println("\n--- Activities for mode: " + mode + " ---");
                            for (Athlete athlete : athletes) {
                                for (Activity activity : athlete.getActivities()) {
                                    if (activity.getMode() == mode) {
                                        System.out.println(athlete.getName() + ": " + activity.getSummary());
                                    }
                                }
                            }
                            break;
                        }
                    }

                    if (!isValidMode) {
                        System.out.println("Invalid mode. Try again.");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Stats per Athlete ---");
                    for (Athlete athlete : athletes) {
                        System.out.println(athlete.getName() + ": Distance = " +
                                athlete.getTotalDistance() + " km, Calories = " +
                                athlete.getBurnedCalories() + " kcal");
                    }
                    break;
                case 6:
                    System.out.println("\n--- Activities Per Athlete ---");
                    for (Athlete athlete : athletes) {
                        System.out.println(athlete.getName() + ":");
                        for (Activity activity : athlete.getActivities()) {
                            System.out.println(" - " + activity.getSummary());
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}