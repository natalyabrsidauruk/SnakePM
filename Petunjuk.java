import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Petunjuk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Petunjuk extends Actor
{
    /**
     * Act - do whatever the Petunjuk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = new GreenfootImage("hint.png");
        image.scale(300,180);
        setImage(image);
    }    
}
