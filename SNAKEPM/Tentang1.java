import greenfoot.*;
public class Tentang1 extends World
{

    public Tentang1()
    {    
        super(950,439, 1);
        getBackground().scale (950,439);
        prepare();
    }

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
        open.setLocation(874,47);
        open.setLocation(895,43);
    }
}
