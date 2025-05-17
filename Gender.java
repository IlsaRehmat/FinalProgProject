/**
 * Enum representing gender identities for athletes.
 * Each enum value has a display name.
 */
public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String displayName;

    /**
     * Constructor for gender enum
     */
    Gender(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Returns a readable string representation of the gender.
     */
    @Override
    public String toString() {
        return displayName;
    }
}
    