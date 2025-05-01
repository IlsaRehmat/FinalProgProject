import java.util.Scanner;

public class Person {

    // Enum inside the same class
    public enum Gender {
        MALE, FEMALE, OTHER;
    }

    // Fields for the Person
    private String name;
    private int age;
    private Gender gender;

    // Constructor
    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender.toString();
    }

    // Main method
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and gender (MALE, FEMALE, OTHER):");

        String name = myObj.nextLine();

        int age;
        try {
            age = myObj.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid age input.");
            return;
        }
        myObj.nextLine(); // consume leftover newline

        String genderInput = myObj.nextLine().toUpperCase();

        Gender gender;
        try {
            gender = Gender.valueOf(genderInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid gender input.");
            return;
        }

        Person person = new Person(name, age, gender);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
    }
}
