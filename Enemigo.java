import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 *Clase enemigo, padre de las sub clases de enemigo, indica los comportamientos entre 
 *los enemigos en el mundo.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int x;
    private int y;
    
    public void act() 
    {
        elimina();
        //super.getX();
        posicion();
    }   
    
    /**
     * Constructor
     */
     public Enemigo(int X,int Y)
    {
          super();
          x=X;
          y=Y;
    }
    
    /**
     * Elimina el enemigo de el mundo.
     */
     public void elimina()
    {
        
       if(x<=0)
        {
            this.getWorld().removeObject(this);
        } 
    }
   
    /**
     * Indica la posicion en la cual se mueve el enemigo.
     */
     public void posicion()
    {
        //int x;
        if(x>0)
        {
        x=super.getX();
        x-=7;
        setLocation(x,super.getY());
        elimina();
        }
    }
    
     public void posicion2()
    {
        //int x;
        if(x<500)
        {
        x=super.getX();
        x+=7;
        setLocation(x,super.getY());
       elimina();
       }
    }
    }

