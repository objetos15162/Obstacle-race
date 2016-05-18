import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perro here.
 * 
 * Clase mariposa enemigo de jugador, indica el movimiento ya nimacion de 
 * el objeto.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Mariposa extends Actor
{
    int X,Y;
    Animacion a=new Animacion();
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Mariposa(int x,int y)
    {
        X=x;
        Y=y;
         for(int i=1;i<3;i++)
        {
            a.setImagen( new GreenfootImage("mariposaoficial"+i+".png"));
            
        }
    }
        
    /**
     * Imagen actual
     * Indica la pacion
     */
    public void act() 
    {
        setImage(a.dameActual());
        X-=2;
        setLocation(X,Y);
    }
    
    /**
     * Manda la dirreccion en x
     */
    public int getX()
    {
        return X;
    }
}
