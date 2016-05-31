import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 *Clase jugador realiza todos los métodos o acciones del jugador,
 * la clase de jugador se encarga del movimiento del jugador (correr, que es por default)
 * el saltar o agacharse, así como el obtener punto (al tocar a un objeto de la clase 
 * de frutas que te da puntuación), de igual manera al momento de tocar a un enemigo
 * (se le eliminara vida).
 * 
 * Tienes dentro de ello, el mensaje de información a nivel, así como nosotros mandamos 
 * mensajes a las clases de frutas, enemigos, vidas.
 *
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{   private Animacion jump;
    private Animacion der;
    private Animacion run;
    private int dir;
    private boolean salto;
    private boolean derrape;
    private boolean caida;
    private boolean levantate;
    private boolean tocar;
    private int puntos;
    private int vidas;
    private Nivel1 niv;
    private SimpleTimer time = new SimpleTimer();
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jugador(int X,int Y)  
     {
        run=new Animacion(new GreenfootImage("jugadoroficial1.png"));
        jump=new Animacion(new GreenfootImage("salto1.png"));
        der=new Animacion(new GreenfootImage("derape2.png"));
        puntos=0;
        time.mark();
        vidas=1;
        for(int i=1;i<6;i++)
        {
            run.setImagen( new GreenfootImage("jugadoroficial"+i+".png"));
        }
          for(int i=1;i<5;i++)
        {
            jump.setImagen( new GreenfootImage("salto"+i+".png"));
        }
         for(int i=2;i<5;i++)
        {
            der.setImagen( new GreenfootImage("derape"+i+".png"));
        }
        salto=false;
        derrape=false;
        caida=false;
        levantate=false;
    }
    
    /**
     * Muuestra las imágenes dependiendo de que objeto se está verificando.
     * realiza la acción de los métodos checTecla y atrapaFruta.
     */
    public void act() 
    {
        checTecla();
        atrapaFruta();
        if(salto)
        {
            salta();
            setImage(jump.dameActual());
            jump.cambio();
        }else if (derrape)
        {
            derrape();
           setImage(der.dameActual()); 
           der.cambio();
        }
        else
        {
            
            setImage(run.dameActual());
            run.cambio();
        }
         setLocation(getX(),getY());
    }
    
    /**
     *Verifica teclas, indicando la activación de la acción del jugador.
     */
    public void checTecla()
    {
       if(Greenfoot.isKeyDown("up")&& salto==false)
        {
            salto = true;
            if(caida==false)
            {
            caida = true;
        }
        }
        
       if(Greenfoot.isKeyDown("down"))
       {
           derrape= true;
           if(levantate==false)
           {
               levantate=true;
            }
           
        }
      }
    
    /**
     * Método que indica el salto del jugador.
     */
    public void salta()
    {
        if(getY()<200)
        {
        caida=false;
       }
        if(caida==true)
        {
        setLocation(getX(),getY()-5);
       }
        else{
            if(getY()<310)
            {
             setLocation(getX(),getY()+5);
            }
            else{
                salto=false;
            }
       }
        
    }
    
    /**
     * Método que indica derrape del jugador.
     */
    public void derrape()
    {
       if(getY()>290)
       {
           levantate=false;
        }
        if(levantate==true)
        {
            setLocation(getX(),getY()+1);
        }
       else
       {
           if(getY()>360)
           {
               setLocation(getX(),getY()-1);
            }
            else{
                derrape=false;
            }
        }
    }
    
    /**
     * indica cuando toco a el enemigo.
     */
    public int tocaEnemigo()
     {
        if(time.millisElapsed()>200)
        {
      if(isTouching(Perro.class)||isTouching(Mariposa.class)||
      isTouching(Barril.class)||isTouching(Oso.class)||
      isTouching(Venado.class)||isTouching(Serpiente.class)||
      isTouching(Gato.class)||
     isTouching(Tronco.class)||
      isTouching(Pasto.class))
      {
          if(vidas<13)
          {vidas+=1;
            }else{
                vidas=0;
            }
      time.mark();
        }
      
      return vidas;
     }else
     return vidas;
    }
    
    /**
     * Método que verifica cuando se tocó una fruta
     */
    public void atrapaFruta()
    {
        if(isTouching(Manzana.class) &&Greenfoot.isKeyDown("a") )
        {
            removeTouching(Manzana.class);
            puntos++;
        }
         if(isTouching(Platano.class) &&Greenfoot.isKeyDown("a") )
        {
            removeTouching(Platano.class);
            puntos+=5;
        }
        if(isTouching(Toronja.class) &&Greenfoot.isKeyDown("a") )
        {
            removeTouching(Toronja.class);
            puntos+=10;
        }
        if(isTouching(Uva.class) &&Greenfoot.isKeyDown("a") )
        {
            removeTouching(Uva.class);
            puntos+=25;
        }
    }
    
    /**
     *Método que regresa los puntos
     */
    public int getPuntos()
    {
        return puntos;
    }
   
    /**
     * Método que regresa una llamada de asceso.
     */
    public void setPuntos(int punt)
    {
        puntos=punt;
    }
    
    /**
     * Método que regresa lo vida.
     */
    public int vida()
    {
        return vidas;
    }
    
}

