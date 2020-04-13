import java.util.Random;
/**
 * Write a description of class Rand here.
 *
 * @author Marc Weitze
 * @version 4/13/2020
 */
public class Rand
{
    // instance variables
    private static Random rand;

    /**
     * Constructor for objects of class Randomizer
     */
    public Rand()
    {
        rand = new Random();
    }

    /**
     * gets the next int within ranged of y
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static int nextInt(int y)
    {
        int i = rand.nextInt(y);
        return i;
    }
}
