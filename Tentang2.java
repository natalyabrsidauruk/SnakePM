import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tentang2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tentang2 extends World
{

    /**
     * Constructor for objects of class Tentang2.
     * 
     */
    public Tentang2()
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
        Open open = new Open();
        addObject(open,519,63);
        open.setLocation(522,63);
        Open open2 = new Open();
        addObject(open2,389,48);
        open.setLocation(487,73);
        removeObject(open);
        open2.setLocation(567,25);
        removeObject(open2);
        Open2 open22 = new Open2();
        addObject(open22,552,43);
        Back2 back2 = new Back2();
        addObject(back2,40,42);
        back2.setLocation(40,42);
    }
}
