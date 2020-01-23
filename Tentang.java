import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tentang extends Actor
{
    /**
     * Act - do whatever the Cara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Tentang()
    {
        //setImage(new GreenfootImage("Cara", 60, Color.WHITE, Color.BLACK));
        //setImage(new GreenfootImage("Cara Main", 30, Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Tentang1());
        }
        
    }
}    

