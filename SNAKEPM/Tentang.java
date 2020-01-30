import greenfoot.*;
public class Tentang extends Actor
{
    public Tentang()
    {
        //setImage(new GreenfootImage("Cara", 60, Color.WHITE, Color.BLACK));
        //setImage(new GreenfootImage("Cara Main", 30, Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
        GreenfootImage image = new GreenfootImage("tentang.png");
        image.scale(300,180);
        setImage(image);
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new TentangGame());
        }
        
    }
}    

