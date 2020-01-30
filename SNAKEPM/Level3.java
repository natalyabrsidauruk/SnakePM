import greenfoot.*;
public class Level3 extends World
{
    //Benda jatuh dan mencari makan semaksimal mungkin
    public Level3()
    {
        super(950, 439, 1); 
        prepare();
    }
    private void Muncul(){
        addObject(new Mouse(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }

    private void prepare()
    {
        Snake2 snake2 = new Snake2();
        addObject(snake2,31,195);
        Mouse mouse = new Mouse();
        addObject(mouse,508,280);
        Pig pig = new Pig();
        addObject(pig,381,140);
        House house = new House();
        addObject(house,119,269);
        House house2 = new House();
        addObject(house2,486,103);
        House house3 = new House();
        addObject(house3,248,50);
        house3.setLocation(43,51);
        house2.setLocation(290,125);
        house.setLocation(48,334);
        House house4 = new House();
        addObject(house4,646,58);
        pig.setLocation(399,140);
        removeObject(pig);
        House house5 = new House();
        addObject(house5,659,307);
        House house6 = new House();
        addObject(house6,341,344);
        House house7 = new House();
        addObject(house7,840,181);
        Smiley5 smiley5 = new Smiley5();
        addObject(smiley5,180,25);
        Smiley5 smiley52 = new Smiley5();
        addObject(smiley52,485,27);
        Smiley5 smiley53 = new Smiley5();
        addObject(smiley53,761,28);
        house2.setLocation(351,108);
        house7.setLocation(856,81);
        house5.setLocation(636,343);
        house3.setLocation(64,56);
        house3.setLocation(835,320);
        removeObject(house);
        house2.setLocation(313,111);
        house4.setLocation(661,123);
        house7.setLocation(888,111);
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
