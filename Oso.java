import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase oso enemigo de jugador, dentro de ella se realiasa la accion de el movieto
 * de el oso
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Oso extends Enemigo
{
    private Animacion oso=new Animacion( new GreenfootImage("oso1.png"));
    private boolean direction;
    /**
     * Act - do whatever the Perro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Oso(int x, int y,boolean direccion)
    {
        super(x,y);
        direction=direccion;
        if(direction==true)
        {
         for(int i=1;i<5;i++)
        {
            oso.setImagen( new GreenfootImage("oso"+i+".png"));
            
        }
      }else{
      for(int i=1;i<5;i++)
        {
            oso.setImagen( new GreenfootImage("osol"+i+".png"));
            
        }
    }
   }
        
    
    /**
     * Verifica la iamgen acuala.
     * te indica la diccion en x a decremetar para el movimiento.
     */
    public void act() 
    { if(direction=true)
       { 
        if(getWorld().getObjects(Oso.class)!=null)
        {
        setImage(oso.dameActual());
        this.oso.cambio();
        super.elimina();
        super.posicion();
       }
    }else{
        if(super.getX()<500)
        {
        setImage(oso.dameActual());
        this.oso.cambio();
        super.elimina();
        super.posicion2();
        }
   }
  }
}

