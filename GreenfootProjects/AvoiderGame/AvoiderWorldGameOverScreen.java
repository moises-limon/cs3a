import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderWorldGameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderWorldGameOverScreen extends World
{

    /**
     * Constructor for objects of class AvoiderWorldGameOverScreen.
     * 
     */
    public AvoiderWorldGameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 615, 1); 

    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            AvoiderGameWorld world = new AvoiderGameWorld();
            Greenfoot.setWorld(world);
        }
    }
}
