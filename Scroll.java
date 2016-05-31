import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase scroll es encardad del movimiento de la imagen de los niveles.
 * 
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Scroll extends Actor
{
    private GreenfootImage im;
    private int i=0;
    private boolean juego;
    public Scroll(int X,int Y,GreenfootImage fondo)
    {
     im=fondo;
     setImage(im);  
    }
    
    /**
     * Act - do whatever the Scroll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-2,getY());
        setImage(im);
    }  
    
   /**
    * Indica el desplacamiento
    * 
    */ 
    public void desplaza()
    {
        int x;
        x=getX();
        //x-=2;
        if(x==0)
        {
        x=560;
        setLocation(x,getY());
        i++;
        if(i<6)
        juego=true;
        else
        juego=false;
      }
    }
    
    /**
     * Indica la poccion de la figura
     */
    public GreenfootImage imagen()
    {
        return im;
    }
    
    /**
     * Regresa el valor en i
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
