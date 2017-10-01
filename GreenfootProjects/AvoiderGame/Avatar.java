import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Avatar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Avatar extends Actor
{
    public void act() 
    {
        followMouse();
        checkForCollisions();
    }    

    private void followMouse() {
        MouseInfo mi = Greenfoot.getMouseInfo();
        if (mi != null) {
            setLocation(mi.getX(),mi.getY());
        }
    }

    private void checkForCollisions(){
        Actor Enemy= getOneIntersectingObject(Enemy.class);
        if(Enemy != null){
           AvoiderGameWorld world =(AvoiderGameWorld) getWorld();
           world.endGame();
        }
    }
}