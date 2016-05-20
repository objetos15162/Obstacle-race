import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Venado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Venado extends Actor
{
    int X,Y;
    Animacion a=new Animacion();
    /**
     * Act - do whatever the Venado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public Venado(int x,int y)
    {
        X=x;
        Y=y;
         for(int i=1;i<5;i++)
        {
            a.setImagen( new GreenfootImage("venado"+i+".png"));
            
        }
    }
    
    public void act() 
    {
        // Add your action code here.
        setImage(a.dameActual());
        X-=6;
        setLocation(getX(),getY());
        if(getX()<0)
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
