import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * Clase que indica el mundo de el nivel 2
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{
    
    Jugador player=new Jugador(100,280);
    Oso oso = new Oso(600,300);
    Venado venado = new Venado(700,280);
    Serpiente serp = new Serpiente(650,330);
    Mariposa marip = new Mariposa(600,230);
    Manzana manzana = new Manzana();
    Platano platano = new Platano();
    Toronja toronja = new Toronja();
    Uva uva = new Uva();
     SimpleTimer timer2 = new SimpleTimer();
    SimpleTimer timer = new SimpleTimer();
    Counter count;
    Nivel1 niv=new Nivel1();
    int valor,mark;
    Vida vida=new Vida();
    Scroll scroll=new Scroll(500,200,new GreenfootImage("MundoBosque.png"));
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2(Vida v)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 400, 1); 
        count= niv.getPuntos();
         count.setValue(valor);
        timer.mark();
        timer2.mark();
         prepare();
         vida=v;
         addObject(vida,200,50);
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
          Nivel3 level3=new Nivel3(vida,count);
          level3.setValor(valor);
         Greenfoot.setWorld(level3);  
        }
      if(player.tocaEnemigo()!=0)
       { vida.cuentaVida(player.tocaEnemigo());
       count.setValue(valor);
        mark=player.getPuntos();
         System.out.println(mark);
      }else{
          
          MyWorld menu=new MyWorld();
          Greenfoot.setWorld(menu);
          
        }
   }
   
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
        addObject(scroll,50,300);
        addObject(player,50,280);
        addObject(oso,600,300);
        addObject(count,500,50);
    }
    
  public void creaObjetos()
  {
     if(timer2.millisElapsed()>1000)
        {
            int objecto = Greenfoot.getRandomNumber(5);
            if(objecto==1)
            {
            addObject(serp,900,330);
          }else if(objecto==2)
            {
            addObject(oso,900,330);
          }else if(objecto==3)
            {
            addObject(marip,900,330);
          }else if(objecto==4)
            {
            addObject(venado,900,330);
          }
            timer2.mark();
        } 
   if(timer.millisElapsed()>800)
        {
            int objecto = Greenfoot.getRandomNumber(5);
            if(objecto==1)
            {

            addObject(toronja,900,330);
          }else if(objecto==2)
            {
            addObject(uva,900,330);
          }else if(objecto==3)
            {
            addObject(platano,900,330);
          }
            timer.mark();
        } 
    }
    
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
    
     public void CreaEnemigos()
    {
        int objeto= Greenfoot.getRandomNumber(5)+1;
        if(timer2.millisElapsed()>2000)
        {
            System.out.println(objeto+"Fuck you");
            if(objeto==1)
            {
            addObject(oso,1300,330);
          }else if(objeto==2)
            {
            addObject(marip,1300,330);
          }else if(objeto==3)
            {
            addObject(venado,1300,330);
          }else if(objeto==4)
            {
            addObject(serp,1300,330);
          }
            timer2.mark();
        } 
    }
    }
    
   
   
   
   
  
     
    

