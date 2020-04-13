/**
 * Write a description of class Human here.
 *
 * @author Marc Weitze
 * @version 4/13/2020
 */
public class Human extends Creature
{
    // instance variables
    private static final int MAX_HUMAN_HP = 25;
    private static final int MIN_HUMAN_HP = 5;
    private static final int MAX_HUMAN_STR = 20;
    private static final int MIN_HUMAN_STR = 5;
    /**
     * Constructor for objects of class Human
     */
    public Human()
    {
        super(
            Rand.nextInt(MAX_HUMAN_HP - MIN_HUMAN_HP) + MIN_HUMAN_HP,
            Rand.nextInt(MAX_HUMAN_STR - MIN_HUMAN_STR) + MIN_HUMAN_STR
        );
    }

}
