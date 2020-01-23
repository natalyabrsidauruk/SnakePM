import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pig here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pig extends Actor
{
    int timePig = 250;
    /**
     * Act - do whatever the Pig wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    //mencari sumber makan sampai yang di maksimalkan
    public void act() 
    {
      //if(getOneObjectAtOffset(0,0, Snake2.class) != null) {
       //   setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()), Greenfoot.getRandomNumber(getWorld().getWidth()));
      //} 
      timePig--;
      if (timePig == 0){
      getWorld().removeObject(this);
      }     
}

//public void dimakan() {
  //  (Game) getWorld();
    //getWorld().addObject(new MakananUlar(), Greenfoot.getRandomNumber (getWorld().getWidth()), Greenfoot.getRandomNumber (getWorld().getWidth()));
    //getWorld().removeObject(this);
//}
}
