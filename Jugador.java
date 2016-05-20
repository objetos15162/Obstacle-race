import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jugador here.
 * 
 * Clase jugador relisa todos los metodos o asiennes del jugador nadamas,
 * la clase de jugador se encarga del movimiento del jugador(correr, que es por defaul)
 * el saltar o agacharse, asi como el obtener punto(al tocar a un objeto de la clase 
 * de frutas que te da puntuacion), de igual manera al momento de tocar a un enemigo
 * (se le eliminara vida).
 * Indica los motodos del jugador.
 * 
 * Tienes dentro de ello, el mensaje de informacion a nivel, asi como nosotro mandamos 
 * mensajes a las clases de frutas, enemigos, vidas.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Jugador extends Actor
{   Animacion jump;
    Animacion der;
    Animacion run;
    private int x;
    private int y;
    private int dir;
    private boolean salto;
    private boolean derrape;
    private boolean caida;
    private boolean levantate;
    private boolean tocar;
    private int puntos;
    int vidas=1;
    Nivel1 niv;
    SimpleTimer time = new SimpleTimer();
    /**
     * Act - do whatever the Jugador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jugador(int X,int Y)  
     {
        run=new Animacion();
        jump=new Animacion();
        der=new Animacion();
        puntos=0;
        x=X;
        y=Y;
        time.mark();
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
     * muestra las imagenes dependiendo de que objeto se esta verificando.
     */
    public void act() 
    {
        checTecla();
        atrapaFruta();
        if(salto)
        {
            salta();
            setImage(jump.dameActual());
        }else if (derrape)
        {
            derrape();
           setImage(der.dameActual()); 
        }
        else
        {
            
            setImage(run.dameActual());
        }
         setLocation(x,y);
    }
    
    /**
     * Verifica teclas, indicando la activacion e banderas.
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
     * Metodo que indica el salto de el jugador.
     */
    public void salta()
    {
        if(y<200)
        {
        caida=false;
       }
        if(caida==true)
        {
        y-=5;
       }
        else{
            if(y<310)
            {
             y+=5;
            }
            else{
                salto=false;
            }
       }
        
    }
    
    /**
     * Metodo que indica derrape de el jugador.
     */
    public void derrape()
    {
       if(y>290)
       {
           levantate=false;
        }
        if(levantate==true)
        {
            
          y++;
       }
       else
       {
           if(y>360)
           {
               y--;
            }
            else{
                derrape=false;
            }
        }
    }
    
    /**
     * Metodo que indica cuando toco a el enemigo.
     */
    public int tocaEnemigo()
    {
        if(time.millisElapsed()>500)
        {
      if(isTouching(Perro.class)||isTouching(Mariposa.class)||isTouching(Barril.class)||isTouching(Oso.class)||isTouching(Venado.class)||isTouching(Serpiente.class)||isTouching(Gato.class))
      {
          if(vidas<13)
          {vidas+=1;
            }else{
                vidas=0;
            }
     }
     time.mark();
      return vidas;
    }else
    return vidas;
}
    
    /**
     * Metodo que verifica cuando se toco una fruta
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
     * Metodo que regre los puntos
     */
    public int getPuntos()
    {
        return puntos;
    }
    
    public void setPuntos(int punt)
    {
        puntos=punt;
    }
    
    public int vida()
    {
        return vidas;
    }
}
