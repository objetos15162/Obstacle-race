import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * Clase que indica el mundo de el nivel 3
 * 
 * @author (Sanjuana David) 
 * @version (a version number or a date)
 */
public class Nivel3 extends World
{
    Jugador player=new Jugador(100,300);
    Oso oso = new Oso(600,300);
    Mariposa marip = new Mariposa(590,230);
    Venado venado = new Venado(600,300);
    Serpiente serp = new Serpiente(600,300);
    Manzana manzana = new Manzana();
    Platano platano = new Platano();
    Toronja toronja = new Toronja();
    Uva uva = new Uva();
    int valor,mark;
    Counter cont=new Counter();
    Vida vida=new Vida();
    SimpleTimer timer = new SimpleTimer();
     SimpleTimer timer2 = new SimpleTimer();
    Scroll scroll=new Scroll(500,200,new GreenfootImage("MundoSelva.png"));
    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public Nivel3(Vida v,Counter c)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 400, 1); 
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
        addObject(scroll,50,300);
        addObject(player,50,300);
        
    }
    
    /**
     * Indica el momento de el cambio de nivel.
     */
    public void act()
    {
        creaObjetos();
        CreaEnemigos();
        if(scroll.i()<10)
       {
        juego();
      }else{
          Greenfoot.stop(); 
         
             MyWorld menu=new MyWorld();
             Greenfoot.setWorld(menu);
           
            
        }
      if(player.tocaEnemigo()!=0)
       { vida.cuentaVida(player.tocaEnemigo());
       cont.setValue(valor);
        mark=player.getPuntos();
      }else{
          
          MyWorld menu=new MyWorld();
          Greenfoot.setWorld(menu);
          
        }
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
   
   public void juego()
    {
        scroll.desplaza(); 
        setBackground(scroll.imagen());
       
    }
    
    public void setValor(int x)
    {
     valor=x;   
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
