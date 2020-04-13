/**
 * Write a description of class Balrog here.
 *
 * @author Marc Weitze
 * @version 4/13/2020
 */
public class Balrog extends Demon
{
    // instance variables
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;
    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super(
            Rand.nextInt(MAX_BALROG_HP - MIN_BALROG_HP) + MIN_BALROG_HP,
            Rand.nextInt(MAX_BALROG_STR - MIN_BALROG_STR) + MIN_BALROG_STR
        );
    }
    
    @Override
    public int damage()
    {
        int rando = 1;
        rando += Rand.nextInt(5);
        if(Rand.nextInt(100) + 1 <= 5)
        {
            rando += 50;
        }
        rando += Rand.nextInt(5);
        if(Rand.nextInt(100) + 1 <= 5)
        {
            rando += 50;
        }
        return rando;
    }
}
