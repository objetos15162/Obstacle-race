import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * Clase que indica el mundo de el nivel 2
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{
    Jugador player=new Jugador(100,300);
    Scroll scroll=new Scroll(500,200,new GreenfootImage("MundoBosque.png"));
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 400, 1); 
        
    }
    
    /**
     * Indica el momento de el cambio de nivel.
     */
    public void act()
    {
        if(scroll.i()<10)
       {
        //juego();
      }else{
          Greenfoot.stop();
          Nivel2 level2=new Nivel2();
         Greenfoot.setWorld(level2);
         if(player.tocaEnemigo()==1)
         {
             //removeObject(vida);
             
            }
            
        }
    
   }
   
    public void juego()
    {
        scroll.desplaza(); 
        setBackground(scroll.imagen());
        /*if(perro.getX()<=0)
        {
            removeObject(perro);
            addObject(barril,590,330);
            if(barril.getX()==0||barril.getX()<0)
            {removeObject(barril);
        }else{if(barril.getX()<400)
            {
             addObject(marip,590,290);
        }
        }
        }
       if(marip.getX()==0)
       {
           removeObject(marip);
        }*/
    }
    
   }
   
  
     
    

