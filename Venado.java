import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase venado enemigo de jugador, indica el movimiento ya nimacion de 
 * el objeto.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Venado extends Enemigo
{
   
    private Animacion venado=new Animacion(new GreenfootImage("venado1.png"));
    private int direction;
    /**
     * Act - do whatever the Venado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public Venado(int x,int y,int direccion)
    {
        super(x,y);
        direction=direccion;
        if(direction==1)
        {
         for(int i=1;i<5;i++)
        {
            venado.setImagen( new GreenfootImage("venado"+i+".png"));
            
        }
       }else{
      for(int i=1;i<5;i++)
        {
            venado.setImagen( new GreenfootImage("osol"+i+".png"));
            
        }
    }
    }
    
    /**
     * Metodo act
     */
    public void act() 
    { if(direction==1)
       { 
        if(getWorld().getObjects(Venado.class)!=null)
        {
        setImage(venado.dameActual());
        this.venado.cambio();
        super.elimina();
        super.posicion();
       }
    }else{if(direction==0)
        {
        if(super.getX()<500)
        {
        setImage(venado.dameActual());
        this.venado.cambio();
        super.elimina();
        super.posicion2();
         
        if(super.getX()>=480)
        {
         getWorld().removeObject(this);
         }
        }
   }
  
   }
  }
}
