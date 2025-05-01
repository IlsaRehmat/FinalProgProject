
/**
 * Write a description of class Equipment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Equipment
{
    private String name;
    private String type;

    /**
     * Constructor for objects of class Equipment
     */
    public Equipment(String name, String type)
    {
        this.name = name;
        this.type = type;
    }
    
    public String getName(){
        return name;
    }
    
    public String getType(){
        return type;
    }

    // name: for example,mountain bike or tours de france
    // type: bike
    
    // Variables:
        // name
        // type

    // Method initialize(name, type):
        // set this.name = name
        // set this.type = type

    // Method getName():
        // Return name

    // Method getType():
        // Return type
}
