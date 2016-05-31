import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase que muestra la ayuda.
 * Indica el como saltar, agacharte y tomar objetos en el juego.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Help extends World
{
     private Ayuda ayuda=new Ayuda();
     private GreenfootImage im;
    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
        super(600, 400, 1); 
        
    }
    
    /**
     * Verifica si se solicita ayuda o se desea salir de ayuda.
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
        * Metido que regresa a el menú inicial.
        */
    public void erase()
     {
            removeObject(ayuda);
        }
}
