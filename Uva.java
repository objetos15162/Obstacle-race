import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Esta clase es encarga de la fruta uva, dentro de ella se tiene su moviente,
 * dentro de le mundo.

 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Uva extends Fruta
{
    /**
     * Act - do whatever the Uva wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       super.move();
       super.elimina();
    }   
   
    /**
     * Constructor
     */
   public Uva()
   {
    }
}
