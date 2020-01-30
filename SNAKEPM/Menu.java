import greenfoot.*; 
public class Menu extends World
{
    private GreenfootSound music = new GreenfootSound("suara.mp3");
     public void started()
    {
        music.setVolume(100);
        music.play();
    }
    
    public void stopped()
    {
        music.stop();
        music.pause();
    }
    public Menu()
    {
        super(950,439, 1); 
        prepare();
        
    }

    private void prepare()
    {        
        Mulai mulai = new Mulai();
        addObject(mulai,475,300);
        Tulisan snakepm = new Tulisan();
        addObject(snakepm,(int) getWidth()/2, 85);
        Petunjuk petunjuk = new Petunjuk();
        addObject(petunjuk,750,270);
        Tentang tentang = new Tentang();
        addObject(tentang,200,270);
    }
}
