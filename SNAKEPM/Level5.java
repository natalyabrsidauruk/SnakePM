import greenfoot.*;
public class Level5 extends World
{
    //ada rumah dan makin banyak rintangan dan makin cepat kecepatan 
    public Level5()
    {
        super(950,439, 1); 
        prepare();
    }
    private void Muncul(){
        addObject(new Pig(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }
    
    private void prepare()
    {
        Mouse mouse = new Mouse();
        addObject(mouse,359,178);
        Mouse mouse2 = new Mouse();
        addObject(mouse2,381,110);
        Mouse mouse3 = new Mouse();
        addObject(mouse3,311,265);
        Snake2 snake2 = new Snake2();
        addObject(snake2,36,196);
        mouse3.setLocation(399,236);
        mouse.setLocation(355,241);
        mouse2.setLocation(414,182);
        mouse2.setLocation(421,147);
        removeObject(mouse2);
        removeObject(mouse3);
        removeObject(mouse);
        Kotak kotak = new Kotak();
        addObject(kotak,294,155);
        Kotak kotak2 = new Kotak();
        addObject(kotak2,372,155);
        Kotak kotak3 = new Kotak();
        addObject(kotak3,557,540);
        Kotak kotak4 = new Kotak();
        addObject(kotak4,633,540);
        Kotak kotak5 = new Kotak();
        addObject(kotak5,38,542);
        Kotak kotak6 = new Kotak();
        addObject(kotak6,39,463);
        kotak6.setLocation(34,474);
        Kotak kotak7 = new Kotak();
        addObject(kotak7,295,231);
        Kotak kotak8 = new Kotak();
        addObject(kotak8,558,463);
        Kotak kotak9 = new Kotak();
        addObject(kotak9,861,38);
        kotak9.setLocation(874,51);
        Kotak kotak10 = new Kotak();
        addObject(kotak10,785,39);
        kotak10.setLocation(784,36);
        Kotak kotak11 = new Kotak();
        addObject(kotak11,372,80);
        kotak9.setLocation(835,25);
        kotak10.setLocation(818,26);
        kotak6.setLocation(50,475);
        kotak5.setLocation(43,496);
        kotak6.setLocation(50,469);
        kotak3.setLocation(556,503);
        kotak8.setLocation(550,453);
        kotak3.setLocation(548,484);
        kotak4.setLocation(633,387);
        kotak8.setLocation(563,453);
        kotak3.setLocation(556,503);
        kotak7.setLocation(309,320);
        kotak.setLocation(310,272);
        kotak2.setLocation(375,273);
        kotak11.setLocation(366,170);
        kotak5.setLocation(47,426);
        kotak5.setLocation(49,482);
        kotak5.setLocation(42,509);
        kotak6.setLocation(36,449);
        kotak5.setLocation(35,524);
        kotak.setLocation(297,251);
        kotak7.setLocation(284,308);
        kotak7.setLocation(283,314);
        kotak7.setLocation(297,325);
        kotak2.setLocation(361,243);
        kotak2.setLocation(371,252);
        kotak11.setLocation(373,201);
        kotak11.setLocation(374,194);
        kotak11.setLocation(370,177);
        kotak8.setLocation(556,424);
        kotak3.setLocation(556,348);
        kotak10.setLocation(779,17);
        kotak10.setLocation(749,17);
        kotak9.setLocation(864,35);
        kotak10.setLocation(788,34);
        snake2.setLocation(-7,268);
        snake2.setLocation(29,255);
        Pig pig = new Pig();
        addObject(pig,734,185);
        kotak5.setLocation(24,375);
        kotak6.setLocation(23,325);
        kotak.setLocation(308,164);
        kotak11.setLocation(312,165);
        kotak.setLocation(361,165);
        kotak2.setLocation(312,214);
        kotak7.setLocation(361,116);
        kotak9.setLocation(876,24);
        kotak10.setLocation(826,23);
        kotak8.setLocation(555,378);
        kotak3.setLocation(555,329);
        kotak4.setLocation(605,378);
        pig.setLocation(618,145);
        Smiley5 smiley53 = new Smiley5();
        addObject(smiley53,234,294);
        Smiley5 smiley54 = new Smiley5();
        addObject(smiley54,294,265);
        Smiley5 smiley55 = new Smiley5();
        addObject(smiley55,375,222);
        Smiley5 smiley56 = new Smiley5();
        addObject(smiley56,426,189);
        Smiley5 smiley57 = new Smiley5();
        addObject(smiley57,478,157);
        Smiley5 smiley58 = new Smiley5();
        addObject(smiley58,532,134);
        smiley58.setLocation(539,134);
        Smiley5 smiley510 = new Smiley5();
        addObject(smiley510,635,71);
        Smiley5 smiley511 = new Smiley5();
        addObject(smiley511,686,48);
        Smiley5 smiley512 = new Smiley5();
        addObject(smiley512,733,76);
        Smiley5 smiley513 = new Smiley5();
        addObject(smiley513,777,114);
        Smiley5 smiley514 = new Smiley5();
        addObject(smiley514,823,149);
        Smiley5 smiley515 = new Smiley5();
        addObject(smiley515,866,186);

        smiley53.setLocation(228,246);
        smiley54.setLocation(299,39);
        smiley55.setLocation(368,328);
        smiley56.setLocation(422,278);
        smiley57.setLocation(474,25);
        smiley58.setLocation(514,146);
        smiley510.setLocation(637,213);
        smiley511.setLocation(690,36);
        smiley512.setLocation(719,135);
        smiley512.setLocation(760,298);
        smiley515.setLocation(854,290);
        smiley514.setLocation(800,154);
        removeObject(smiley514);
        snake2.setLocation(26,260);

    }
    
    public boolean cekPig(){
        return getObjects(Pig.class).size() == 0 ;
    }
    
    public void act (){
        if(cekPig()){
            Muncul();
        }
    }
}
