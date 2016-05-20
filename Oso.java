import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perro here.
 * 
 * Clase oso enemigo de jugador, dentro de ella se realiasa la accion de el movieto
 * de el oso
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Oso extends Actor
{
    int X,Y;
    Animacion a=new Animacion();
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Oso(int x,int y)
    {
        X=x;
        Y=y;
         for(int i=1;i<5;i++)
        {
            a.setImagen( new GreenfootImage("oso"+i+".png"));
            
        }
    }
        
    
    /**
     * Verifica la iamgen acuala.
     * te indica la diccion en x a decremetar para el movimiento.
     */
    public void act() 
    {
        setImage(a.dameActual());
        X-=7;
        setLocation(X,Y);
        if(X<=0)
        this.getWorld().removeObject(this);
    }
    
    /**
     *  Posicion en x de el oso
     */
    public int getX()
    {
        return X;
    }
}
