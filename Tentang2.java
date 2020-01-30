import greenfoot.*;
public class Tentang2 extends World
{
    public Tentang2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950,439, 1); 
        getBackground().scale (950,439);
        prepare();
    }

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
        open22.setLocation(905,46);
    }
}
