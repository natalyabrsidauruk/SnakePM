import greenfoot.*;
public class Game extends World
{
    public Game()
    {    
        super(950,439, 1); 
        prepare();
    }
    
    private void Muncul(){
        addObject(new Pig(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }

    private void prepare()// untuk memunculkan animasi 
    {

        Snake2 snake2 = new Snake2();
        addObject(snake2,24,270);
        Muncul();
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
