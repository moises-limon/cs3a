import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderWorldGameOverScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderWorldGameOverScreen extends World
{
    GreenfootSound sound;
    
    /**
     * Constructor for objects of class AvoiderWorldGameOverScreen.
     * 
     */
    public AvoiderWorldGameOverScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 615, 1); 
        play();
    }

    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            AvoiderGameWorld world = new AvoiderGameWorld();
            Greenfoot.setWorld(world);
                    }
    }
     public void play(){
        sound = new GreenfootSound("GameOver.mp3");
        sound.play();

    } 
    public void stop(){
        sound.stop();
    }

}
