import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase barril obtaculo de enemigo, maneja el moviento del barril.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Barril extends Enemigo
{
    
    private Animacion barril=new Animacion( new GreenfootImage("barril1.png"));
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Barril(int x,int y)
    {
       super(x,y);
         for(int i=1;i<9;i++)
        {
            barril.setImagen( new GreenfootImage("barril"+i+".png"));
            
        }
    }
         
    
    /**
     * indica el movimiento de el barril.
     * a si vomo su desplasamiento.
     */
    public void act() 
    {
        setImage(barril.dameActual());
        this.barril.cambio();
        super.elimina();
        //super.getX();
        super.posicion();
    }
     
}
