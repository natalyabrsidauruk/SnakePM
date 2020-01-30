import greenfoot.*;
public class TentangGame extends World
{
    public TentangGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 439, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Back3 back3 = new Back3();
        addObject(back3,80,35);
    }
}
