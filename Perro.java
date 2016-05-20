import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Perro here.
 * 
 * Clase perro enemigo del jugador, lo que hace esta clase es el maneno del moviento,
 *y la posicion la que se encuentra.
 * 
 * @author (Sanjuana,Oscar) 
 * @version (a version number or a date)
 */
public class Perro extends Actor
{
    int X,Y;
    Animacion a=new Animacion();
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Perro(int x,int y)
    {
        X=x;
        Y=y;
         for(int i=1;i<5;i++)
        {
            a.setImagen( new GreenfootImage("p"+i+".png"));
            
        }
    }
        
    /**
     * Indica la poccion del perro, indica la animacion
     * y la pocion en x que se decremeta en sentido a el movimiento.
     */
    public void act() 
    {
        setImage(a.dameActual()); 
        X-=7;
        setLocation(X,Y);
        if(X<=0)
        {
            this.getWorld().removeObject(this);
        }
    }
    
    /**
     * Regresa el valor de pacicion en x de el perro
     */
    public int getX()
    {
        return X;
    }
}
