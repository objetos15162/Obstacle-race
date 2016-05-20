import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gato extends Actor
{
    int X,Y;
    Animacion a=new Animacion();
    /**
     * Act - do whatever the Gato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage(a.dameActual());
        X-=10;
        setLocation(getX(),getY());
        if(getX()<0)
            this.getWorld().removeObject(this);
        
    }
    
    public Gato(int x,int y)
    {
        X=x;
        Y=y;
         for(int i=1;i<3;i++)
        {
            a.setImagen( new GreenfootImage("gatooficial"+i+".png"));
            
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

