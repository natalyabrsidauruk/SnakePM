import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class House extends Actor
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
        
    }    
}
