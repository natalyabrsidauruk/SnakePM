import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back2 extends Actor
{
    /**
     * Act - do whatever the Back2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Tentang1());
            Greenfoot.playSound("klik.mp3");
        }
    }    
}
