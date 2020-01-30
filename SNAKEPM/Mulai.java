import greenfoot.*;
public class Mulai extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Game());
            
            Greenfoot.playSound("klik.mp3");
        }
    }    
}
