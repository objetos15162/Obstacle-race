import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Esenario del primer nivel que se muestra en el juego, es utilsado por los direfentes onjetos
 * utilisa todas las clases dentro del juego para el manejo del nivel.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Nivel1 extends Nivel

{
    private Perro perro=new Perro(590,330);
    private Gato gato = new Gato(600,330);
    private Barril barril=new Barril(590,330);
    private Mariposa marip=new Mariposa(590,200);
    private SimpleTimer timer2 = new SimpleTimer();
    private Counter puntos;
    private Scroll scroll=new Scroll(500,200,new GreenfootImage("MundoCuid.png"));
    private Nivel2 niv2;
    private int mark=0;
    private GreenfootImage im=new GreenfootImage("NIVEL2.png");
  /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        
        timer2.mark();
        puntos = new Counter("Puntos: "); 
        prepare();
    }
    
  /**
     * Regresa el valor del contador 
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
        super.creaObjetos();
        CreaEnemigos();
        eliminVida();
        if(scroll.i()<4) 
       {
        juego();
        
      }else{
        //setBackground(im);
        //Greenfoot.delay(100);
          mark=player.getPuntos();
          removeObject(scroll);
          removeObject(puntos);
          super.borra();
          borra();
          setBackground(im);
          Greenfoot.delay(100);
          Nivel2 level2=new Nivel2(vida,puntos);
          level2.setValor(mark);
         Greenfoot.setWorld(level2); 
        }
       
   }
   
  public void eliminVida()
   {
        if(player.tocaEnemigo()!=0)
       { 
        vida.cuentaVida(player.tocaEnemigo());
        puntos.setValue(player.getPuntos());
        mark=player.getPuntos();
      }else{
          
          MyWorld menu=new MyWorld();
          Greenfoot.setWorld(menu);
          
        }
    }
    
   
  /**
    * Muestra los diferentes objetos en el nivel 1
    */
    public void prepare()
    {
        
        addObject(scroll,50,200);
        addObject(player,180,300);
        addObject(vida,200,50);
        Manzana manzana = new Manzana();
        addObject(manzana,300,300);
        addObject(puntos, 500,50);
        
    }
    
    
    /**
     * La animacion de los diferentes enemigos asi como obtaculos.
     * La eliminacion de los objetos al desaparecer de la pantalla.
     */
    public void juego()
    {
        scroll.desplaza(); 
        setBackground(scroll.imagen());
       
        
  }
  
  /**
     * Metodo que crea a los enemigos.
  */
  public void CreaEnemigos()
    {
        int objeto= Greenfoot.getRandomNumber(5)+1;
        if(timer2.millisElapsed()>3000)
        {
           
            if(objeto==1)
            {
            addObject(gato,1300,330);
          }else if(objeto==2)
            {
            addObject(marip,1300,250);
          }else if(objeto==3)
            {
            addObject(barril,1300,330);
          }else if(objeto==4)
            {
            addObject(perro,1300,330);
          }
            timer2.mark();
        } 
    }
  
  public int val()
    {
        return mark;
    }
    
    public void borra()
    {
        removeObject(perro);
        removeObject(gato);
        removeObject(barril);
        removeObject(marip);
    }
}
 
