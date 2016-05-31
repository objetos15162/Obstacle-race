import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase encargada de los niveles.
 * Se encarga de las acciones de las frutas que son los puntos.
 * Asi como las diferentes acciones.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel extends World
{
    Jugador player=new Jugador(180,300);
    SimpleTimer timer = new SimpleTimer();
    Vida vida= new Vida();
    Manzana manzana = new Manzana();
    Platano platano = new Platano();
    Toronja toronja = new Toronja();
    Uva uva = new Uva();
    Counter puntos;
    //int mark=0;
    /**
     * Constructor for objects of class Nivel.
     * 
     */
    public Nivel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        timer.mark();
        
        
    }
    
    /**
     * Método act.
     */
    public void act()
    {
       //eliminVida();
        creaObjetos();
    }
    
    /**
   * Método que crea a los enemigos en el mundo
   */
  public void creaObjetos()
  {int objeto= Greenfoot.getRandomNumber(5);
      
   if(timer.millisElapsed()>200)
        {
            
            if(objeto==1)
            {
            addObject(toronja,900,330);
          }else if(objeto==2)
            {
            addObject(uva,900,330);
          }else if(objeto==3)
            {
            addObject(platano,900,330);
          }else if(objeto==4)
            {
            addObject(manzana,900,330);
          }
            timer.mark();
        } 
    }
    
    public void borra()
    {
        removeObject(player);
        removeObject(vida);
        removeObject(puntos);
        removeObject(manzana);
        removeObject(platano);
        removeObject(uva);
        removeObject(toronja);
    }
}
