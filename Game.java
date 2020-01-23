import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class Game.
     * 
     */
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900,400, 1); 
        prepare();
    }
    private void Muncul(){
        addObject(new Pig(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }

    private void prepare()// untuk memunculkan animasi 
    {
        Pig pig = new Pig();
        addObject(pig,316,424);
        Snake2 snake2 = new Snake2();
        addObject(snake2,24,270);
        Smiley5 smiley5 = new Smiley5();
        addObject(smiley5,231,24);
        Smiley5 smiley52 = new Smiley5();
        addObject(smiley52,477,23);
        Smiley5 smiley53 = new Smiley5();
        addObject(smiley53,727,29);
        Smiley5 smiley54 = new Smiley5();
        addObject(smiley54,916,25);
        smiley5.setLocation(229,275);
        smiley52.setLocation(467,143);
        smiley53.setLocation(707,226);
        smiley5.setLocation(223,157);
        smiley52.setLocation(459,16);
        smiley54.setLocation(919,130);
        smiley54.setLocation(937,118);
        removeObject(pig);

        Pig pig2 = new Pig();
        addObject(pig2,122,169);
        Pig pig3 = new Pig();
        addObject(pig3,486,371);
        Pig pig4 = new Pig();
        addObject(pig4,564,126);
        Pig pig5 = new Pig();
        addObject(pig5,168,441);
        Pig pig6 = new Pig();
        addObject(pig6,242,52);
        removeObject(smiley5);
        removeObject(smiley52);
        removeObject(smiley53);
        removeObject(smiley54);
        removeObject(pig3);
        removeObject(pig4);
        removeObject(pig6);
        removeObject(pig5);
        pig2.setLocation(634,198);
        pig2.setLocation(589,161);
        pig2.setLocation(590,208);
        pig2.setLocation(515,214);
        snake2.setLocation(30,248);
        snake2.setLocation(35,222);
        Muncul();
        removeObject(pig2);
    }
    
    public boolean cekPig(){
        return getObjects(Pig.class).size() == 0 ;
    }
    
    public void act (){
        if(cekPig()){
            Muncul();
        }
    }    
}
