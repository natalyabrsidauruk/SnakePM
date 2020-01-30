import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Landak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Landak extends Actor
{
    /**
     * Act - do whatever the Landak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
   {
        //atWorldEdge();
        //move(1);
        //turn(-(Greenfoot.getRandomNumber(4)));
        //move(1);
        //turn(Greenfoot.getRandomNumber(4));
        
    move(4);
    if(Greenfoot.getRandomNumber(900)>10)
        turn(Greenfoot.getRandomNumber(15)-30);
        eatSnake2();
   }
   
   public void eatSnake2()
   {
   if(isTouching(Snake2.class)) 
        removeTouching(Snake2.class);
    //public void atWorldEdge()
    //{ 
        //if(isAtEdge())
        //{
            //setLocation(getX(),getY());
            
        //}
        //if(getY() <=100 || getY() >= getWorld().getHeight() - 10)
        //{
           // setLocation(getWorld().getWidth(), Greenfoot.getRandomNumber(600));;
        //}
       //if(getX()>= 800)setLocation (10,getY());
  
    //}
  }  
}
