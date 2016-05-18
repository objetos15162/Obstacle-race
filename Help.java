import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * Clase que muestra la ayuda
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Help extends World
{
    Ayuda ayuda=new Ayuda();
    GreenfootImage im;
    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
    }
    
    /**
     * Veridica si se solicita ayuda o se decean salir de ayuda.
     */
    public void act()
    {
       im= new GreenfootImage("Salirb.png");
         ayuda.setImage(im);
         addObject(ayuda,500,350);
         if(Greenfoot.mouseClicked(ayuda))
         {
             MyWorld menu=new MyWorld();
             Greenfoot.setWorld(menu);
           
            }
        
        }
        
       /**
        * mEtodo que regresa a el menu inicial.
        */
    public void erase()
     {
            removeObject(ayuda);
        }
}
