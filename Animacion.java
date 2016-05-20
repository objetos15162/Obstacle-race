import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Animacion here.
 * 
 * Clase encargada del llamado a las imagenes de los objetos, para 
 * poder mostrar el movimiento de o el cambio de imagen
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
    LinkedList<GreenfootImage> animacion;
    GreenfootImage actual;
    int contadorDeImagenes;
    Timer timer;
    float tiempoCambio;
    int x;
    
    class tiempo extends TimerTask {
		public void run() {
		   
			tiempoCambio+=1;
			// aqui se puede escribir el codigo de la tarea que necesitamos ejecutar
		                   }// end run()
                                   }
           
   /**
    * Constructor
    */
    public Animacion()
    {
        
        actual=new GreenfootImage("jugadoroficial1.png");
        contadorDeImagenes=0;
        tiempoCambio=0;
        animacion = new LinkedList<GreenfootImage>() ;
        Contar();
        
    }
    
     public void act() 
    {
        
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
    
    /**
     * Parametro de tiempo
     */
    public void Contar()
    {
        this.tiempoCambio=0;
        timer = new Timer();
        timer.schedule(new tiempo(), 0, 100);
    }
    
   
}