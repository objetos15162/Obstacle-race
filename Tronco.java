import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase Tronco es un obtaculo, indica las imagenes asi como el cambio de ellas.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tronco extends Enemigo
{
    private Animacion tronco=new Animacion(new GreenfootImage("tronco1.png"));
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Tronco(int x,int y)
    {
       super(x,y);
         for(int i=1;i<6;i++)
        {
            tronco.setImagen( new GreenfootImage("tronco"+i+".png"));
            
        }
    }
         
    
    /**
     * indica el movimiento de el barril.
     * a si vomo su desplasamiento.
     */
    public void act() 
    {
        setImage(tronco.dameActual());
        this.tronco.cambio();
        super.elimina();
        //super.getX();
        super.posicion();
    }   
}
