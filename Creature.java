/**
 * Write a description of class Creature here.
 * 
 * @author Marc Weitze 
 * @version 4/13/2020
 */
public class Creature
{
    // instance variables
    private int hp = 10;
    private int str = 10;
    


    public Creature()
    {
        
    }
    
    public Creature(int hitPoints, int strength)
    {
        hp = hitPoints;
        str = strength;
    }
    
    public int damage()
    {
        int rando = 1;
        rando += Rand.nextInt(str);
        return rando;
    }
   
    public boolean isAlive()
    {
       if(hp > 0)
       {
           return true;
       }
       return false;
    }
}
