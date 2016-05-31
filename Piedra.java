import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Piedra es un obtaculo, indica las imagenes asi como el cambio de ellas.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Piedra extends Enemigo
{
    private Animacion tronco=new Animacion(new GreenfootImage ("piedra1.png"));
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Piedra(int x,int y)
    {
       super(x,y);
         for(int i=1;i<19;i++)
        {
            tronco.setImagen( new GreenfootImage("piedra"+i+".png"));
            
        }
    }
         
    
    /**
     * indica el movimiento de el barril.
     * a si vomo su desplasamiento.
     */
    public void act() 
    {
        setImage(tronco.dameActual());
        super.elimina();
        super.posicion();
    }   
}

