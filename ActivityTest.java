

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ActivityTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ActivityTest
{
    /**
     * Default constructor for test class ActivityTest
     */
    public ActivityTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testActivity()
    {
        java.util.Date date2 = new java.util.Date();
        Activity activity1 = new Activity(5.0, 30.0, date2, ModeOfTransport.BIKING);
        assertEquals(130.0, activity1.getCaloriesBurned(), 0.1);
        activity1.getDistance();
        activity1.getMode();
        activity1.getDate();
    }
}

