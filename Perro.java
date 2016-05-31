import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase perro enemigo del jugador, lo que hace esta clase es el maneno del moviento,
 *y la posicion la que se encuentra.
 * 
 * @author (Sanjuana,Oscar) 
 * @version (a version number or a date)
 */
public class Perro extends Enemigo
{
    
    private Animacion perro=new Animacion( new GreenfootImage("p1.png"));
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Perro(int x, int y){
       
         super(x,y);
         for(int i=1;i<5;i++)
        {
            perro.setImagen( new GreenfootImage("p"+i+".png"));    
        }
       
    }
        
    /**
     * Indica la poccion del perro, indica la animacion
     * y la pocion en x que se decremeta en sentido a el movimiento.
     */
    public void act() 
    {
        
        setImage(perro.dameActual());
        this.perro.cambio();
        super.elimina();
      // super.getX();
        super.posicion();
    }
    
   
}
