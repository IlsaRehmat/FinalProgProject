
/**
 * Represents a piece of equipment used in a powered activity.
 * Each equipment has a name and a type (e.g., Bike, E-Scooter, Rollerblades).
 */
public class Equipment
{
    private String name;
    private String type;

    /**
     * Constructs an Equipment object with a name and type.
     */
    public Equipment(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    
    /**
     * returns the name of the equipment 
     */
    public String getName(){
        return name;
    }
    
    /**
     * Returns the type of the equipment
     */
    public String getType(){
        return type;
    }
    
    /**
     * Returns a string representation of the equipment.
     */
    @Override
    public String toString() {
        return name + " (" + type + ")";
    }

}
