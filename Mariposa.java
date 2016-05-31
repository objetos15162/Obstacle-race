import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase mariposa enemigo de jugador, indica el movimiento ya nimacion de 
 * el objeto.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Mariposa extends Enemigo
{
    private Animacion mari=new Animacion(new GreenfootImage("mariposaoficial1.png"));
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Mariposa(int x,int y)
    {
        super(x,y);
         for(int i=1;i<5;i++)
        {
           mari.setImagen( new GreenfootImage("mariposaoficial"+i+".png"));
        }
       
    }
        
    /**
     *Metodo act
     */
    public void act() 
    {
        setImage(mari.dameActual());
        this.mari.cambio();
        super.elimina();
        //super.getX();
        super.posicion();
    }
}
