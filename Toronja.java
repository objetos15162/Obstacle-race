import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Toronja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toronja extends Actor
{
    /**
     * Act - do whatever the Toronja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int xn = Greenfoot.getRandomNumber(11) -5;
        int yn = Greenfoot.getRandomNumber(11) -5;
        setLocation(getX()+xn,getY()+yn);
        move(-5);
        if(getX()<=0)
        {
            this.getWorld().removeObject(this);
        }
    }    
}
