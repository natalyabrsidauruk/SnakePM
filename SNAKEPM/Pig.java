import greenfoot.*;
public class Pig extends Actor
{
    int timePig = 250;
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
