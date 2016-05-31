import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Esta clase es encarga de la fruta manzana, dentro de ella se tiene su moviento,
 * dentro de le mucndo.
 * Clase realizada como parte de ta obtecion de puntos en el juego.
 * te da un numero de puntos dentro al tomar el objeto.
 * 
 * 
 * @author (sanjuana david) 
 * @version (a version number or a date)
 */
public class Manzana extends Fruta
{
  
    /**
     * Act - do whatever the Manzana wants to do. This method is called whenever
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
    public Manzana()
    {
    }
}


