import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Open here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Open extends Actor
{
    /**
     * Act - do whatever the Open wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Tentang2());
            Greenfoot.playSound("klik.mp3");
        }
    }    
}
