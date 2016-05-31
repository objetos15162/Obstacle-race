import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase pasto, es un obtaculo.
 * Muestra las imagenes de pasto.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pasto extends Enemigo
{
    private Animacion pasto=new Animacion(new GreenfootImage("pas1.png"));
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Pasto(int x,int y)
    {
       super(x,y);
         for(int i=1;i<3;i++)
        {
            pasto.setImagen( new GreenfootImage("pas"+i+".png"));
            
        }
    }
         
    
    /**
     * indica el movimiento de el barril.
     * a si vomo su desplasamiento.
     */
    public void act() 
    {
        setImage(pasto.dameActual());
        this.pasto.cambio();
        super.elimina();
        //super.getX();
        super.posicion();
    } 
}
