import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{

    /**
     * Constructor for objects of class Level5.
     * 
     */
    //Game bonus mencari makan sampai selesai
    public Level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Snake2 snake2 = new Snake2();
        addObject(snake2,54,214);
        snake2.setLocation(45,259);
        Mouse mouse = new Mouse();
        addObject(mouse,724,84);
        Mouse mouse2 = new Mouse();
        addObject(mouse2,882,377);
        Mouse mouse3 = new Mouse();
        addObject(mouse3,272,211);
        Pig pig = new Pig();
        addObject(pig,558,349);
        removeObject(mouse3);
        mouse2.setLocation(531,280);
        mouse.setLocation(609,114);
        removeObject(mouse);
        removeObject(mouse2);
        removeObject(pig);
        Mouse mouse4 = new Mouse();
        addObject(mouse4,164,41);
        Mouse mouse5 = new Mouse();
        addObject(mouse5,162,108);
        Mouse mouse6 = new Mouse();
        addObject(mouse6,260,41);
        Mouse mouse7 = new Mouse();
        addObject(mouse7,258,105);
        Mouse mouse8 = new Mouse();
        addObject(mouse8,152,201);
        Mouse mouse9 = new Mouse();
        addObject(mouse9,153,268);
        Mouse mouse10 = new Mouse();
        addObject(mouse10,252,201);
        Mouse mouse11 = new Mouse();
        addObject(mouse11,249,269);
        Mouse mouse12 = new Mouse();
        addObject(mouse12,147,357);
        Mouse mouse13 = new Mouse();
        addObject(mouse13,149,433);
        mouse12.setLocation(139,376);
        mouse13.setLocation(140,422);
        Mouse mouse14 = new Mouse();
        addObject(mouse14,247,366);
        Mouse mouse15 = new Mouse();
        addObject(mouse15,243,433);
        Mouse mouse16 = new Mouse();
        addObject(mouse16,370,370);
        Mouse mouse17 = new Mouse();
        addObject(mouse17,467,370);
        Mouse mouse18 = new Mouse();
        addObject(mouse18,559,363);
        Mouse mouse19 = new Mouse();
        addObject(mouse19,375,435);
        Mouse mouse20 = new Mouse();
        addObject(mouse20,472,430);
        Mouse mouse21 = new Mouse();
        addObject(mouse21,554,428);
        Mouse mouse22 = new Mouse();
        addObject(mouse22,368,271);
        Mouse mouse23 = new Mouse();
        addObject(mouse23,467,272);
        Mouse mouse24 = new Mouse();
        addObject(mouse24,573,272);
        Mouse mouse25 = new Mouse();
        addObject(mouse25,567,208);
        Mouse mouse26 = new Mouse();
        addObject(mouse26,465,207);
        Mouse mouse27 = new Mouse();
        addObject(mouse27,379,206);
        Mouse mouse28 = new Mouse();
        addObject(mouse28,366,109);
        Mouse mouse29 = new Mouse();
        addObject(mouse29,463,109);
        Mouse mouse30 = new Mouse();
        addObject(mouse30,571,113);
        Mouse mouse31 = new Mouse();
        addObject(mouse31,570,51);
        Mouse mouse32 = new Mouse();
        addObject(mouse32,465,39);
        mouse31.setLocation(558,35);
        Mouse mouse33 = new Mouse();
        addObject(mouse33,371,41);
        Mouse mouse34 = new Mouse();
        addObject(mouse34,668,44);
        Mouse mouse35 = new Mouse();
        addObject(mouse35,667,109);
        Mouse mouse36 = new Mouse();
        addObject(mouse36,665,206);
        Mouse mouse37 = new Mouse();
        addObject(mouse37,669,271);
        Mouse mouse38 = new Mouse();
        addObject(mouse38,663,359);
        Mouse mouse39 = new Mouse();
        addObject(mouse39,667,420);
        Mouse mouse40 = new Mouse();
        addObject(mouse40,53,46);
        Mouse mouse41 = new Mouse();
        addObject(mouse41,47,115);
        Mouse mouse42 = new Mouse();
        addObject(mouse42,57,373);
        Mouse mouse43 = new Mouse();
        addObject(mouse43,54,434);
        mouse43.setLocation(63,438);
        mouse42.setLocation(43,373);
        mouse43.setLocation(45,419);
        Mouse mouse44 = new Mouse();
        addObject(mouse44,759,48);
        Mouse mouse45 = new Mouse();
        addObject(mouse45,758,112);
        Mouse mouse46 = new Mouse();
        addObject(mouse46,761,202);
        Mouse mouse47 = new Mouse();
        addObject(mouse47,767,266);
        Mouse mouse48 = new Mouse();
        addObject(mouse48,772,341);
        Mouse mouse49 = new Mouse();
        addObject(mouse49,770,383);
        Mouse mouse50 = new Mouse();
        addObject(mouse50,859,377);
        Mouse mouse51 = new Mouse();
        addObject(mouse51,861,325);
        Mouse mouse52 = new Mouse();
        addObject(mouse52,862,257);
        Mouse mouse53 = new Mouse();
        addObject(mouse53,862,197);
        Mouse mouse54 = new Mouse();
        addObject(mouse54,858,112);
        Mouse mouse55 = new Mouse();
        addObject(mouse55,858,58);
        mouse42.setLocation(38,316);
        mouse43.setLocation(33,365);
        mouse12.setLocation(117,328);
        mouse13.setLocation(117,378);
        mouse13.setLocation(115,370);
        mouse14.setLocation(216,338);
        mouse15.setLocation(230,369);
        mouse16.setLocation(351,333);
        mouse19.setLocation(346,372);
        mouse17.setLocation(464,322);
        mouse20.setLocation(459,366);
        mouse18.setLocation(561,333);
        mouse21.setLocation(566,361);
        mouse18.setLocation(576,333);
        mouse38.setLocation(655,320);
        mouse39.setLocation(661,355);
        mouse48.setLocation(738,322);
    }
}
