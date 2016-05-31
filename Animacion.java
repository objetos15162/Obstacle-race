import greenfoot.*;
import java.util.*;
/**
 * 
 * Clase encargada del llamado a las imagenes de los objetos, para 
 * poder mostrar el movimiento de o el cambio de imagen.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Animacion extends Actor
{
    /**
     * Act - do whatever the Animacion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private LinkedList<GreenfootImage> animacion;
    private GreenfootImage actual;
    private int contadorDeImagenes;
    private SimpleTimer timer;
    private float tiempoCambio;
    
          
   /**
    * Constructor
    */
    public Animacion(GreenfootImage inicio)
    {
        
        //actual=new GreenfootImage("jugadoroficial1.png");
        contadorDeImagenes=0;
        tiempoCambio=0;
        animacion = new LinkedList<GreenfootImage>() ;
        timer=new SimpleTimer();
        timer.mark();
        
    }
    
    
   /**
    * Crea la nueva imagen
    */ 
    public void setImagen(GreenfootImage nuevaImagen)
    {
       animacion.add(nuevaImagen); 
    }
    
   /**
    * Manda la imagen actual
    */
    public GreenfootImage dameActual()
    {
        Update();
        return actual;
    }
    
    /**
     * Conteo de imagenes
     */
    public void Update()
    {
        if(contadorDeImagenes == animacion.size()-1)
        {
            contadorDeImagenes=0;
        }
        else
        {
            if(tiempoCambio>2)
            {
             contadorDeImagenes++;
             actual=animacion.get(contadorDeImagenes);
             tiempoCambio = 0;
            
            }
        }
    }
    
    public void cambio()
    {
          if(timer.millisElapsed()>100)
          {
          tiempoCambio+=1;
          timer.mark();
        }
    } 
}
  