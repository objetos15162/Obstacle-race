import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase que indica el mundo de el nivel 3
 * Nivel 3.
 * Indica los diferentes animales del nivel3, asi como los diferentes atributos.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Nivel3 extends Nivel
{
    
    private Oso oso = new Oso(600,330,true);
    private Oso oso2= new Oso(0,330,false);
    private Mariposa marip = new Mariposa(590,200);
    private Venado venado = new Venado(600,330);
    private Venado venado2 = new Venado(0,350);
    private Serpiente serp = new Serpiente(600,350);
    private Tronco tronco = new Tronco(650,350);
    private Piedra piedra = new Piedra(700,350);
    private int valor;
    private int suma;
    private int mark;
    private Counter cont=new Counter();
    private SimpleTimer timer2 = new SimpleTimer();
    private Scroll scroll=new Scroll(500,200,new GreenfootImage("MundoSelva.png"));
    private GreenfootImage im= new GreenfootImage("NIVEL4.png");
    
    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public Nivel3(Vida v,Counter c)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        prepare();
        cont=c;
        vida=v;
        timer2.mark();
        addObject(cont, 500,50);
        addObject(vida,200,50);
    }
    
     /**
    * Muestra los diferentes objetos en el nivel 3
    */
    public void prepare()
    {
        addObject(scroll,50,200);
        addObject(player,180,320);
        
    }
    
    /**
     * Indica el momento de el cambio de nivel.
     */
    public void act()
    {
        creaObjetos();
        CreaEnemigos();
        eliminVida();
        if(scroll.i()<6)
       {
          juego();
      }else{
           removeObject(scroll);
          removeObject(cont);
          super.borra();
          borrar();
          setBackground(im);
          Greenfoot.delay(100);
             MyWorld menu=new MyWorld();
             Greenfoot.setWorld(menu);
            
        }
   }
   
  
   /**
    * Metodo de el scroll de el juego.
    */
   public void juego()
    {
        scroll.desplaza(); 
        setBackground(scroll.imagen());
       
    }
    
    /**
     * Metodo que tegresa el valor de x;
     */
    public void setValor(int x)
    {
     valor=x;   
   }
   
  /**
   * Metodo que crea a los enemigos de el nivel.
   */ 
     public void CreaEnemigos()
    {
        int objeto= Greenfoot.getRandomNumber(8)+1;
        if(timer2.millisElapsed()>1000)
        {
            
            if(objeto==1)
            {
            addObject(oso,1300,340);
          }else if(objeto==2)
            {
            addObject(marip,1300,250);
          }else if(objeto==3)
            {
            addObject(venado,1300,340);
          }else if(objeto==4)
            {
            addObject(serp,1300,380);
          }else if(objeto==5)
          {
            addObject(venado2,10,340);
            }else if(objeto==6)
            {
            addObject(oso2,100,350);
          }else if(objeto==7)
            {
            addObject(tronco,1300,360);
          }else if(objeto==8)
            {
            addObject(piedra,1300,360);
          }
            
            timer2.mark();
        } 
    }
    
    /**
     * Metodo que modifica la barra de vida.
     */
    public void eliminVida()
   {
        if(player.tocaEnemigo()!=0)
       { vida.cuentaVida(player.tocaEnemigo());
        cont.setValue(valor+mark+suma);
        mark=player.getPuntos();
      }else{
         
          MyWorld menu=new MyWorld();
          Greenfoot.setWorld(menu);
          
        }
    }
    
    /**
     * Metodo encargado de eliminar los objetos.
     */ 
    public void borrar()
   {
    removeObject(oso);
    removeObject(venado);
    removeObject(marip);
    removeObject(serp);
    removeObject(tronco);
    removeObject(piedra);
    removeObject(oso2);
    }
}
