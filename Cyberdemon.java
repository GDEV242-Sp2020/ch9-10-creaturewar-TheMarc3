/**
 * Write a description of class Cyberdemon here.
 *
 * @author Marc Weitze
 * @version 4/13/2020
 */
public class Cyberdemon extends Demon
{
    // instance variables
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;
    /**
     * Constructor for objects of class Cyberdemon
     */
    public Cyberdemon()
    {
        super(
            Rand.nextInt(MAX_CYBERDEMON_HP - MIN_CYBERDEMON_HP)
            + MIN_CYBERDEMON_HP, Rand.nextInt(MAX_CYBERDEMON_STR 
            - MIN_CYBERDEMON_STR) + MIN_CYBERDEMON_STR
        );
    }
}
