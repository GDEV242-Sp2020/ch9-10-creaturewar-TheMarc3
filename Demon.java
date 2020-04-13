/**
 * Write a description of class Demon here.
 *
 * @author Marc Weitze
 * @version 4/13/3020
 */
public abstract class Demon extends Creature
{
    // instance variables
    int hp;
    int str;
    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        
    }
    
    public Demon(int hitPoints, int strength)
    {
        hp = hitPoints;
        str = strength;
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
        return rando;
    }
}
