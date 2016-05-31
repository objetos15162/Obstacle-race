import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * En esta clase se tiene lo que el menú su funcionamiento es mostrar, el menú 
 * principal, utiliza mediante mensajes a las clases de botones del menú que indica 
 * a qué lugar deseas entra, me tiene un mensaje que te envía a la clase que uno dese

 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   private Jugar juego=new Jugar();
   private Ayuda ayuda=new Ayuda();
   private GreenfootImage im;
   private SimpleTimer timer = new SimpleTimer();
    private GreenfootImage imgen=new GreenfootImage("NIVEL1.png");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(juego,500,100);
        addObject(ayuda,500,170);
    }
    
    /**
     * Método que verifica que acción se dé desea o se realiza.
     */
    public void act()
    {   
        if(Greenfoot.mouseClicked(juego))
        {
            removeObject(juego);
            removeObject(ayuda);
            setBackground(imgen);
          Greenfoot.delay(100);
           Nivel1 level=new Nivel1();
           Greenfoot.setWorld(level);
         
        }
        if(Greenfoot.mouseClicked(ayuda))
        {
         erase();
         Help ayu=new Help();
         Greenfoot.setWorld(ayu);
        
        }
    }
    
    /**
     * Indica la pocion de los objetos en menu.
     */
    public void erase()
    {
        removeObject(juego);
         removeObject(ayuda);
          
    }
    
    }
