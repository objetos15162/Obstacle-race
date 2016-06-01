import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * Clase que indica el mundo de el nivel 2.
 * Nivel 2 
 * Muestra los enemigos de el nivel 2 asi como sus diferentes atributos,
 * asi como sus cualidades, en el nivel.
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Nivel2 extends Nivel
{
    
    private Oso oso = new Oso(600,330,1);
    private Venado venado = new Venado(700,320,1);
    private Serpiente serp = new Serpiente(650,350);
    private Mariposa marip = new Mariposa(600,200);
    private Pasto pasto = new Pasto(750,340);
    //private Counter puntos;
    private SimpleTimer timer2 = new SimpleTimer();
    private Counter count;
    private Nivel1 niv=new Nivel1();
    private int valor;
    private int mark;
    private int suma;
    private GreenfootImage im=new GreenfootImage("NIVEL3.png");
    private Scroll scroll=new Scroll(500,200,new GreenfootImage("MundoBosque.png"));
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2(Vida v,Counter c)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
         count=c;
        timer2.mark();
         prepare();
         vida=v;
         addObject(vida,200,50);
         addObject(count,500,50);
         
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
          removeObject(count);
          super.borra();
          borrar();
          setBackground(im);
          Greenfoot.delay(100);
          Nivel3 level3=new Nivel3(vida,count);
          level3.setValor(mark+valor+niv.val());
         Greenfoot.setWorld(level3);  
        }
      
   }
   
   
  /**
   * Metodo que indica el scroll en el juego.
   */ 
  public void juego()
    {
        scroll.desplaza(); 
        setBackground(scroll.imagen());
    }
    
  /**
    * Muestra los diferentes objetos en el nivel 2
    */
    public void prepare()
    {
        addObject(scroll,50,200);
        addObject(player,180,300);
        addObject(oso,600,300);
        addObject(count,500,50);
    }
    
  /**
   * Metodo que regresa e valor en x.
   */  
  public void setValor(int x)
    {
     valor=x; 
   }
   
  /**
     * Regresa el valor del contador 
     */
    public Counter getPuntos()
    {
        return count;
    }
    
  /**
     * Metodo que crea los enemigos de el nivel.
     */
     public void CreaEnemigos()
    {
        int objeto= Greenfoot.getRandomNumber(6)+1;
        if(timer2.millisElapsed()>2000)
        {
            
            if(objeto==1)
            {
            addObject(oso,1300,330);
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
            addObject(pasto,1300,350);
          }
            timer2.mark();
        } 
    }
    
  /**
     * Metodo que modifica la barra de vida
     */
     public void eliminVida()
   {
        if(player.tocaEnemigo()!=0)
       { 
       vida.cuentaVida(player.tocaEnemigo());
       count.setValue(valor+niv.val()+mark);
        mark=player.getPuntos();
        
      }else{
          
          MyWorld menu=new MyWorld();
          Greenfoot.setWorld(menu);
          
        }
         suma=mark;
    }
    
  /**
   * Regresa el valor de  la puntuacion obtenida.
   */
    public int val()
    {
        return mark;
    }
    
   public void borrar()
   {
    removeObject(oso);
    removeObject(venado);
    removeObject(marip);
    removeObject(serp);
    }
    }
    
    
    
   
   
   
   
  
     
    

