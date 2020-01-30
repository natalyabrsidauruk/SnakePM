import greenfoot.*;
public class Open2 extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Tentang3());
            Greenfoot.playSound("klik.mp3");
        }
    }    
}
