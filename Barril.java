import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barril here.
 * 
 * Clase barril obtaculo de enemigo, maneja el moviento del barril.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Barril extends Actor
{
    int X,Y;
    Animacion a=new Animacion();
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Barril(int x,int y)
    {
        X=x;
        Y=y;
         for(int i=1;i<9;i++)
        {
            a.setImagen( new GreenfootImage("barril"+i+".png"));
            
        }
    }
         
    
    /**
     * indica el movimiento de el barril.
     * a si vomo su desplasamiento.
     */
    public void act() 
    {
        setImage(a.dameActual());
        X-=7;
        setLocation(X,Y);
        if(getX()<0)
            this.getWorld().removeObject(this);
        
    }
    
    /**
     * Pocicion en x de el barril
     */
    public int getX()
    {
        return X;
    }   
}
