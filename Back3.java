import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back3 extends Actor
{
    /**
     * Act - do whatever the Back3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Menu());
            Greenfoot.playSound("klik.mp3");
        }
    }    
}
