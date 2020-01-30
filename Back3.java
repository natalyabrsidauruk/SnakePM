import greenfoot.*;
public class Back3 extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
            Greenfoot.playSound("klik.mp3");
        }
    }    
}
