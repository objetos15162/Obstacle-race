import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scroll here.
 * 
 * Clase scroll es encardad de el movimiento del moviento de la imagen de el
 * nivel.
 * 
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Scroll extends Actor
{
    GreenfootImage im;
    int x,y,i=0;
    boolean juego;
    public Scroll(int X,int Y,GreenfootImage fondo)
    {
     x=X;
     y=Y;
     im=fondo;
     setImage(im);
        
    }
    
    /**
     * Act - do whatever the Scroll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(x,y);
        setImage(im);
    }  
    
   /**
    * Indica el desplacamiento
    * 
    */ 
    public void desplaza()
    {
        x-=2;
        if(x==0)
        {
        x=600;
        i++;
        if(i<6)
        juego=true;
        else
        juego=false;
      }
    }
    
    /**
     * indica la poccion de la figura
     */
    public GreenfootImage imagen()
    {
        return im;
    }
    
    /**
     * regresa el valor en i
     */
     public int i()
    {
        return i;
    }
    
    /**
     *Indica un booleano para el jugador
     */
     public boolean juego()
    {
        return juego;
    }
    
}
