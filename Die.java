
/**
 * The Die class 
 *
 * @author Katie Huntsman
 * @version 2021-02-02
 */
public class Die
{
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        roll = 0; 
    }

    /**
     * randomly generates a new roll
     *
     *@return    the generated roll value
     */
    public int roll()
    {
        roll = (int)(Math.random() * 6 + 1); //1 through 6
        return roll;
    }
    
    /**
     * returns roll value
     *
     * @return    the current roll value
     */
    public int getRoll()
    {
        return roll; 
    }
}
