import greenfoot.*; 


public class Mouse extends Actor
{
    int timeMouse = 250;
    public void act() 
    {
      timeMouse--;
      if (timeMouse == 0){
      getWorld().removeObject(this);
      }
    }    
}
