import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 400, 1); 
        prepare();
        
    }

    private void prepare()
    {
        Mulai mulai = new Mulai();
        addObject(mulai,268,263);
        mulai.setLocation(299,200);
        Tentang cara = new Tentang();
        addObject(cara,306,309);
        mulai.setLocation(302,70);
        cara.setLocation(299,291);
        cara.setLocation(289,189);
        House house = new House();
        addObject(house,559,360);
        House house2 = new House();
        addObject(house2,491,360);
        cara.setLocation(329,194);
        cara.setLocation(307,185);
        mulai.setLocation(270,62);
        mulai.setLocation(88,102);
        cara.setLocation(397,102);
        removeObject(house2);
        removeObject(house);
        cara.setLocation(793,285);
        mulai.setLocation(498,271);
        mulai.setLocation(95,147);
        cara.setLocation(306,236);
        Tulisan tulisan = new Tulisan();
        addObject(tulisan,410,66);
        tulisan.setLocation(322,34);
        removeObject(mulai);
        Mulai mulai2 = new Mulai();
        addObject(mulai2,115,145);
        tulisan.setLocation(504,204);
        tulisan.setLocation(434,266);
        tulisan.setLocation(504,204);
        mulai.setLocation(120,103);
        cara.setLocation(306,236);
        cara.setLocation(130,287);
    }
}
