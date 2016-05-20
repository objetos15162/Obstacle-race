import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * En esta clase se tiene el conteo de las images de vida,
 * verifica que nivel de visa se tiene en el juego para mostrarlo a el usuario.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    Jugador jugador;
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        
    }  
    
    /**
     * Constructor
     */
    public void vida()
    {
    }
    
    /**
     * Metodo que indica tu nivel de vida
     */
    public void cuentaVida(int i)
    {
           if(i<12)
        {
       setImage("VIDA"+i+".png"); 
       
    }
  }
}
