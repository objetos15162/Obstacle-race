import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase frutas indica el movimiento, asi como la eliminicion de las
 * frutas.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fruta extends Actor
{
    /**
     * Act - do whatever the Fruta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        elimina();
        move();
    }   
    
    public void elimina()
    {
        if(getX()<=0)
        {
        this.getWorld().removeObject(this);
       }
    }
    
     public void move()
    {
        int xn = Greenfoot.getRandomNumber(11) -5;
        int yn = Greenfoot.getRandomNumber(11) -5;
        setLocation(getX()+xn,getY()+yn);
        move(-6); 
    }
}
