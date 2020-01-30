import greenfoot.*;
public class GameAssets extends World
{

    public GameAssets()
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
        Back3 back3 = new Back3();
        addObject(back3,49,50);
        back3.setLocation(59,46);
    }
}
