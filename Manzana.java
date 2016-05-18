import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Manzana here.
 * 
 * Esta clase es encarga de la fruta manzana, dentro de ella se tiene su moviento,
 * dentro de le mucndo.
 * Clase realizada como parte de ta obtecion de puntos en el juego.
 * te da un numero de puntos dentro al tomar el objeto.
 * 
 * 
 * @author (sanjuana david) 
 * @version (a version number or a date)
 */
public class Manzana extends Actor
{
  
    /**
     * Act - do whatever the Manzana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int xn = Greenfoot.getRandomNumber(11) -5;
        int yn = Greenfoot.getRandomNumber(11) -5;
        setLocation(getX()+xn,getY()+yn);
        move(-1);
       /* if(Greenfoot.getRandomNumber(2)==0)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }*/
    }    
}


