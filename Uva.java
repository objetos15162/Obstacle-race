import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Uva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uva extends Actor
{
    /**
     * Act - do whatever the Uva wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int xn = Greenfoot.getRandomNumber(11) -5;
        int yn = Greenfoot.getRandomNumber(11) -5;
        setLocation(getX()+xn,getY()+yn);
        move(-8);
        if(getX()<=0)
        {
            this.getWorld().removeObject(this);
        }
    }    
}
