import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderGameWorldIntro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderGameWorldIntro extends World
{
    private GreenfootSound sound;
    private boolean playedIntroYet;
    
    /**
     * Constructor for objects of class AvoiderGameWorldIntro.
     * 
     */
    public AvoiderGameWorldIntro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 615, 1); 
        sound = new GreenfootSound("PokemonIntro.mp3");
        sound.setVolume(50);
        playedIntroYet = false;
    }

    public void act()
    {
       if (!playedIntroYet){
           play();
           playedIntroYet = true;
        }
        
       if(Greenfoot.mouseClicked(this)){
            stop();
            AvoiderGameWorld world = new AvoiderGameWorld();
            Greenfoot.setWorld(world);
        }
    }

    public void play(){
         sound.play();
        } 

    public void stop(){
        sound.stop();
    }

}
