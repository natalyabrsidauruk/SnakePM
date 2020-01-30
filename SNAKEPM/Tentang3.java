import greenfoot.*;
public class Tentang3 extends World
{
    public Tentang3()
    {
        super(950,439, 1);
        getBackground().scale (950,439);
        prepare();
    }

    private void prepare()
    {
        Back1 back1 = new Back1();
        addObject(back1,50,48);
    }
}
