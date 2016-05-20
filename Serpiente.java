import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Serpiente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Serpiente extends Actor
{
     int X,Y;
     Animacion a=new Animacion();
    /**
     * Act - do whatever the Serpiente wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public Serpiente(int x,int y)
    {
        X=x;
        Y=y;
         for(int i=1;i<3;i++)
        {
            a.setImagen( new GreenfootImage("serpienteoficial"+i+".png"));
            
        }
        
       
    }
    
    public void act() 
    {
        // Add your action code here.
        setImage(a.dameActual());
        X-=6;
        setLocation(getX(),getY());
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
