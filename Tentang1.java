import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cara1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tentang1 extends World
{

    /**
     * Constructor for objects of class Cara1.
     * 
     */
    public Tentang1()
    {    
        super(600, 339, 1);
        getBackground().scale (600,339);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Tentang cara = new Tentang();
        cara.setLocation(52,46);

        Tentang tentang = new Tentang();
        addObject(tentang,316,31);
        tentang.setLocation(347,55);
        removeObject(tentang);
        Open open = new Open();
        addObject(open,518,61);
        open.setLocation(518,61);
        open.setLocation(545,45);
        Back3 back3 = new Back3();
        addObject(back3,49,50);
        back3.setLocation(59,46);
    }
}
