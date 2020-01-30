import greenfoot.*;
public class Back2 extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new GameAssets());
            Greenfoot.playSound("klik.mp3");
        }
    }    
}
