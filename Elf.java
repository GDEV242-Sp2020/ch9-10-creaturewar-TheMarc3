/**
 * Write a description of class Elf here.
 *
 * @author Marc Weitze
 * @version 4/13/2020
 */
public class Elf extends Creature
{
    // instance variables
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;
    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
            Rand.nextInt(MAX_ELF_HP - MIN_ELF_HP) + MIN_ELF_HP,
            Rand.nextInt(MAX_ELF_STR - MIN_ELF_STR) + MIN_ELF_STR
        );
    }
    
    @Override
    public int damage()
    {
        int rando = 1;
        rando += Rand.nextInt(5);
        if(Rand.nextInt(100) + 1 <= 10)
        {
            rando += rando;
        }
        return rando;
    }
}
