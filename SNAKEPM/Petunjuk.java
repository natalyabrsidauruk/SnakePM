import greenfoot.*; 


public class Petunjuk extends Actor
{
    public void act() 
    {
        GreenfootImage image = new GreenfootImage("petunjuk.png");
        image.scale(300,180);
        setImage(image);
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new GameAssets());
        }
    }    
}
