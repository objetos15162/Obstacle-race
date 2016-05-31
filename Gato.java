import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase gato enemigo de jugador, indica el movimiento ya nimacion de 
 * el objeto.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Gato extends Enemigo
{
    private Animacion gato=new Animacion(new GreenfootImage("gatooficial1.png"));
    /**
     * Act - do whatever the Gato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gato.dameActual());
        this.gato.cambio();
        super.elimina();
       // super.getX();
        super.posicion();
    }
    
    /**
     * Contructor
     */
    public Gato(int x,int y)
    {
        super(x,y);
         for(int i=1;i<5;i++)
        {
            gato.setImagen( new GreenfootImage("gatooficial"+i+".png"));
            
        }
        setImage( new GreenfootImage("gatooficial1.png"));
        gato.Update();
    }
    }    

