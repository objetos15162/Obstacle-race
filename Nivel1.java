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
    Gato gato = new Gato(600,330);
    Barril barril=new Barril(590,330);
    Mariposa marip=new Mariposa(590,230);
    SimpleTimer timer = new SimpleTimer();
    SimpleTimer timer2 = new SimpleTimer();
    Vida vida= new Vida();
    Manzana manzana = new Manzana();
    Platano platano = new Platano();
    Toronja toronja = new Toronja();
    Uva uva = new Uva();
    private Counter puntos;
    Scroll scroll=new Scroll(500,200,new GreenfootImage("MundoCuid.png"));
    Nivel2 niv2;
    int mark=0;
    private GreenfootImage im;
    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 400, 1); 
        timer.mark();
        timer2.mark();
        puntos = new Counter("Puntos: "); 
        im =new GreenfootImage("NIVEL2.png");
       
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
        creaObjetos();
        CreaEnemigos();
        if(scroll.i()<4) 
       {
        juego();
        
      }else{
        //setBackground(im);
        //Greenfoot.delay(100);
          mark=player.getPuntos();
          setBackground(im);
          Nivel2 level2=new Nivel2(vida);
          level2.setValor(mark);
         Greenfoot.setWorld(level2); 
        }
        if(player.tocaEnemigo()!=0)
       { vida.cuentaVida(player.tocaEnemigo());
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
        
        addObject(scroll,50,300);
        addObject(player,50,300);
        
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
   * Metodo que crea a los enemigos en el mundo
   */
  public void creaObjetos()
  {int objeto= Greenfoot.getRandomNumber(5);
      
   if(timer.millisElapsed()>800)
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
          }
            timer.mark();
        } 
    }
    
   public int val()
    {
        return mark;
    }
    
    public void CreaEnemigos()
    {
        int objeto= Greenfoot.getRandomNumber(5)+1;
        if(timer2.millisElapsed()>2000)
        {
            System.out.println(objeto+"Fuck you");
            if(objeto==1)
            {
            addObject(gato,1300,330);
          }else if(objeto==2)
            {
            addObject(marip,1300,330);
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
}
 