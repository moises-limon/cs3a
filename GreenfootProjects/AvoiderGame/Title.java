import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Actor
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() {
        checkRemove();
    }

    private void checkRemove() {
        World w = getWorld();
        w.removeObject(this);
        play();
    }
    
    public void play(){
        GreenfootSound sound = new GreenfootSound("PokemonTheme.wav");
        sound.play();
   
}
}