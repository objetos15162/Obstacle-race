import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Esta clase es encarga de la fruta planatano, dentro de ella se tiene su moviento,
 * dentro de le mucndo.
 * Clase realizada como parte de ta obtecion de puntos en el juego.
 * 
 * 
 * @author (Sanjuana, David ) 
 * @version (a version number or a date)
 */
public class Platano extends Fruta
{
    /**
     * Act - do whatever the Platano wants to do. This method is called whenever
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
    public Platano()
    {
    }
}
