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
        removeObject(mouse);
        Muncul();
        Smiley5 smiley5 = new Smiley5();
        addObject(smiley5,125,32);
        Smiley5 smiley52 = new Smiley5();
        addObject(smiley52,319,159);
        Smiley5 smiley53 = new Smiley5();
        addObject(smiley53,521,53);
        Smiley5 smiley54 = new Smiley5();
        addObject(smiley54,695,271);
        Smiley5 smiley55 = new Smiley5();
        addObject(smiley55,137,304);
        Smiley5 smiley56 = new Smiley5();
        addObject(smiley56,879,133);
        removeObject(smiley5);
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
