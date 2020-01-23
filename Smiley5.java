import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Smiley5 extends Actor
{
    public void cekOver(){
        if(isTouching(Snake2.class)){
            removeTouching(Snake2.class);  
        }
        if(isTouching(Mouse.class)){
        removeTouching(Mouse.class);
        }
    }

    public void act() 
       {
        setLocation(getX(), getY ()+3);
        if(getY() >= getWorld().getHeight() -1)
            setLocation(getX(), 0);
        }

        //if(isTouching(Mouse.class)){
        //removeTouching(Mouse.class);
        //}
        //cekOver(); 
}
