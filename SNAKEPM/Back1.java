import greenfoot.*;
public class Back1 extends Actor
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
