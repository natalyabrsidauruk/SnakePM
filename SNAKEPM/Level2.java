import greenfoot.*;
public class Level2 extends World
{
    //ada benda yang jatuh
    public Level2()
    {
        super(950,439, 1);
        prepare();
    }
    private void Muncul(){
        addObject(new Mouse(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }

    private void prepare()
    {
        Snake2 snake2 = new Snake2();
        addObject(snake2,19,199);
        Mouse mouse = new Mouse();
        addObject(mouse,450,164);
        Mouse mouse2 = new Mouse();
        addObject(mouse2,587,301);
        Mouse mouse3 = new Mouse();
        addObject(mouse3,870,151);
        removeObject(mouse2);
        removeObject(mouse);
        Muncul();
        removeObject(mouse3);
        Smiley5 smiley5 = new Smiley5();
        addObject(smiley5,125,32);
        Smiley5 smiley52 = new Smiley5();
        addObject(smiley52,261,130);
        Smiley5 smiley53 = new Smiley5();
        addObject(smiley53,395,31);
        Smiley5 smiley54 = new Smiley5();
        addObject(smiley54,529,95);
        smiley52.setLocation(253,169);
        smiley54.setLocation(513,98);
        Smiley5 smiley55 = new Smiley5();
        addObject(smiley55,656,31);
        smiley5.setLocation(120,308);
        smiley52.setLocation(255,195);
        smiley53.setLocation(173,89);
        smiley54.setLocation(377,70);
        smiley54.setLocation(377,37);
        smiley55.setLocation(436,141);
        smiley55.setLocation(434,219);
        Smiley5 smiley56 = new Smiley5();
        addObject(smiley56,571,121);
        Smiley5 smiley57 = new Smiley5();
        addObject(smiley57,665,54);
        removeObject(smiley52);
        removeObject(smiley53);
        smiley5.setLocation(200,229);
        smiley54.setLocation(309,46);
        smiley54.setLocation(247,34);
        smiley5.setLocation(165,138);
        smiley55.setLocation(345,157);
        smiley56.setLocation(468,68);
        smiley57.setLocation(624,125);
        smiley57.setLocation(617,195);
        removeObject(smiley55);
        removeObject(smiley56);
        smiley54.setLocation(390,75);
        smiley54.setLocation(406,74);
        smiley5.setLocation(154,230);
        smiley5.setLocation(165,266);
        smiley54.setLocation(371,60);
        smiley57.setLocation(593,173);
        Smiley5 smiley58 = new Smiley5();
        addObject(smiley58,783,276);
    }
    
    public boolean cekMouse(){
        return getObjects(Mouse.class).size() == 0 ;
    }
    
    public void act (){
        if(cekMouse()){
            Muncul();
        }
    }
}
