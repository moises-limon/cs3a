import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderGameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderGameWorld extends World
{

    /**
     * Constructor for objects of class AvoiderGameWorld.
     * 
     */
    public AvoiderGameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 615, 1, false); 
        setAvatar();
        setTitle();
    }

    private void setTitle()
    {
        Title t = new Title();
        addObject(t,((getWidth()/2)), (getHeight()/2)- 200);
    }

    private void setAvatar()
    {
        Avatar a = new Avatar();
        addObject(a,((getWidth()/2)), (getHeight()/2)+ 100);
    }

    public void act() {
        if(Greenfoot.getRandomNumber(500) < 10) {
            Enemy e = new Enemy();
            addObject(e, Greenfoot.getRandomNumber(getWidth() - 20) + 10, -30);
        }
    }
    
    public void endGame() {
        AvoiderWorldGameOverScreen go = new AvoiderWorldGameOverScreen();
        Greenfoot.setWorld(go);
    }
}
