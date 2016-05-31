import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase serpiente enemigo de jugador, indica el movimiento ya nimacion de 
 * el objeto.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Serpiente extends Enemigo
{
    private Animacion ser=new Animacion(new GreenfootImage("serpienteoficial1.png"));
    /**
     * Act - do whatever the Serpiente wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public Serpiente(int x,int y)
    {
        super(x,y);
         for(int i=1;i<5;i++)
        {
            ser.setImagen( new GreenfootImage("serpienteoficial"+i+".png"));
            
        }
        
       
    }
    
    /**
     * Metodo act
     */
    public void act() 
    {
        // Add your action code here.
        setImage(ser.dameActual());
        this.ser.cambio();
        super.elimina();
        //super.getX();
        super.posicion();
    }  
}
