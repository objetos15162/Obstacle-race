import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * Esenario del primer, o mundo que se muestra en el juego, es utilsado por los direfentes onjetos
 * utilisa todas las clases dentro del juego para el manejo del nivel.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{
    Jugador player=new Jugador(100,300);//VALOR INICIAL
    Perro perro=new Perro(590,330);
    Barril barril=new Barril(590,330);
    Mariposa marip=new Mariposa(590,290);
    SimpleTimer timer = new SimpleTimer();
    Vida vida= new Vida();
    Manzana manzana = new Manzana();
    Platano platano = new Platano();
    private Counter puntos;
    Scroll scroll=new Scroll(500,200,new GreenfootImage("MundoCuid.png"));
    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 400, 1); 
        timer.mark();
        puntos = new Counter("Puntos: ");
        addObject(puntos, 300,100);
        prepare();
    }
    
    /**
     * Regresa elvalor del contador 
     */
    public Counter getPuntos()
    {
        return puntos;
    }
    
    /**
     * Indica el momento de el cambio de nivel.
     */
    public void act()
    {
        
        if(timer.millisElapsed()>5000)
        {
            this.addObject(new Manzana(),450,300);
            this.addObject(new Platano(),590,330);
            timer.mark();
            
        }
        
        if(scroll.i()<10)
       {
        juego();
      }else{
          Greenfoot.stop();
          Nivel2 level2=new Nivel2();
         Greenfoot.setWorld(level2);
        
            
        }
       puntos.setValue(player.getPuntos());
   }
   
   /**
    * Muestra los diferentes objetos en el nivel 1
    */
    public void prepare()
    {
        addObject(scroll,50,300);
        addObject(player,50,300);
        addObject(perro,590,300);
        addObject(vida,200,50);
        Manzana manzana = new Manzana();
        addObject(manzana,300,300);
        Counter puntos = new Counter("Puntos:" );
        //Counter counter = new Counter();
        addObject(puntos,450,50);
        
    }
    
    /**
     * La animacion de los diferentes enemigos asi como obtaculos.
     * La eliminacion de los objetos al desaparecer de la pantalla.
     */
    public void juego()
    {
        scroll.desplaza(); 
        setBackground(scroll.imagen());
        if(perro.getX()<=0)
        {
            removeObject(perro);
            addObject(barril,590,330);
            if(barril.getX()==0||barril.getX()<0)
            {removeObject(barril);
        }else{if(barril.getX()<400)
            {
             addObject(marip,590,290);
        }
        }
        }
       if(marip.getX()==0)
       {
           removeObject(marip);
        }
       
    
  }
}