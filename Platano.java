import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platano here.
 * 
 * Esta clase es encarga de la fruta planatano, dentro de ella se tiene su moviento,
 * dentro de le mucndo.
 * Clase realizada como parte de ta obtecion de puntos en el juego.
 * 
 * 
 * @author (Sanjuana, David ) 
 * @version (a version number or a date)
 */
public class Platano extends Actor
{
    /**
     * Act - do whatever the Platano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         int xn = Greenfoot.getRandomNumber(11) -5;
        int yn = Greenfoot.getRandomNumber(11) -5;
        setLocation(getX()+xn,getY()+yn);
        move(-1);
    }    
}
