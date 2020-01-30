import greenfoot.*;
public class Snake2 extends Actor
{
    //buatscore
    int score = 0;
    int nyawa = 3;
    //public static int countLandakCollisions;
    
    public void score()
    {
       
       if(isTouching(Pig.class)){
       removeTouching(Pig.class);
       Greenfoot.playSound("snakehiss2.wav");
       score = score + 5;
       }
       if(isTouching(Mouse.class)){
       removeTouching(Mouse.class);
       Greenfoot.playSound("snakehiss2.wav");
       score = score + 5;
       }
          if(score == 20&&getWorld() instanceof Game){
          Greenfoot.setWorld(new Level2());
          }
          if(score == 20&&getWorld() instanceof Level2){
          Greenfoot.setWorld(new Level3());
          }
          if(score == 40&&getWorld() instanceof Level3){
          Greenfoot.setWorld(new Level4());
          }
          if(score == 80&&getWorld() instanceof Level4){
          Greenfoot.setWorld(new Level5());
          }
    }
    
    public void nyawa(){
        if(isTouching(Smiley5.class)){
            setLocation(24, 270);
            nyawa = nyawa - 1;
            Greenfoot.playSound("lagu1.wav");
        }
        if(isTouching(Kotak.class)){
            setLocation(24, 270);
            nyawa = nyawa - 1;
            Greenfoot.playSound("lagu1.wav");
        }
        if(isTouching(House.class)){
            setLocation(24, 270);
            nyawa = nyawa - 1;
            Greenfoot.playSound("lagu1.wav");
        }
        if(nyawa < 1){
            Greenfoot.setWorld(new GameOver());
        }
    }
    //untuk tampilan
    public void Tampil(){
    getWorld().showText("Score anda = "+ score, 787, 50);
    getWorld().showText("Nyawa anda =" + nyawa, 100, 50);
    }
    
    private void tamat(){
        Greenfoot.stop();
    }
    
    //public void LandakCollisions()
    //{
        //Actor getLandak = getOneIntersectingObject(Landak.class);
        //if(getLandak != null )
        //{
            //Greenfoot.delay(2);
            //this.setLocation(100, 500);
            //countLandakCollisions++;
        //}
    public void act()
    {
        nyawa();
        score();
        move(4);
        if(Greenfoot.isKeyDown("left")){
        turn(-5);
        }
        if(Greenfoot.isKeyDown("right")){
        turn(5);
        }
        Tampil();
        
    }
}
