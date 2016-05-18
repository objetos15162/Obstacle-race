import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * En esta clase se tien lo ques el menu su funcionamiento es mostrar, el menu 
 * principal, utilisa mediante mensajes a las clases de botones del menu que indica 
 * a que lugar deceas entra, me tiene un mensaje que te envia a la clase que uno dece
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   Jugar juego=new Jugar();
   Ayuda ayuda=new Ayuda();
   Records records=new Records();
   Salir salir=new Salir();
   GreenfootImage im;
   
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
        addObject(records,500,240);
        addObject(salir,500,310);
        
    }
    
    /**
     * Metodo que verifica que accion se de desea o se realiza.
     */
    public void act()
    {   
        if(Greenfoot.mouseClicked(juego))
        {
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
          removeObject(records);
           removeObject(salir);
    }
    
    }
