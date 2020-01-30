import greenfoot.*;
public class Open extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Tentang2());
            Greenfoot.playSound("klik.mp3");
        }
    }    
}
