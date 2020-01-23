import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tentang3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tentang3 extends World
{

    /**
     * Constructor for objects of class Tentang3.
     * 
     */
    public Tentang3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        getBackground().scale (600,400);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back1 back1 = new Back1();
        addObject(back1,50,48);
    }
}
