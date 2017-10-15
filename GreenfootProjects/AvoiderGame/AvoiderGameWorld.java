import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AvoiderGameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderGameWorld extends World
{
    private GreenfootSound sound;
    private Counter scoreBoard;
    private Counter levelBoard;
    private int enemySpeed = 1;
    private int nextLevel = 10;
    private int level = 1;

    /**
     * Constructor for objects of class AvoiderGameWorld.
     * 
     */
    public AvoiderGameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 615, 1, false); 
        setAvatar();
        setCounter();
        play();

    }

    private void setAvatar()
    {
        Avatar a = new Avatar();
        addObject(a,((getWidth()/2)), (getHeight()/2)+ 200);
    }

    public void play(){
        sound = new GreenfootSound("PokemonBattleMusic.mp3");
        sound.playLoop();

    } 

    public void stop(){
        sound.stop();
    }

    public void act() {
        if(Greenfoot.getRandomNumber(1000) < 10) {
            Enemy e = new Enemy();
            e.setSpeed(enemySpeed);
            addObject(e, Greenfoot.getRandomNumber(getWidth() - 20) + 10, -30);
            scoreBoard.setValue(scoreBoard.getValue() + 1);
        }
         increaseLevel();
    }

    private void setCounter() {
        levelBoard = new Counter("Level: ");
        levelBoard.setValue(level);
        addObject(levelBoard, 70, 20);
        scoreBoard = new Counter("Score: ");
        addObject(scoreBoard, 70, levelBoard.getY() + levelBoard.getImage().getHeight());
    }

    private void increaseLevel() {
        int currentScore = scoreBoard.getValue();
        if(currentScore > nextLevel) {
            enemySpeed += 1;
            nextLevel += 10;
            level ++;
            levelBoard.setValue(levelBoard.getValue() + 1);
        }
    }

    public void endGame() {
        stop();
        AvoiderWorldGameOverScreen go = new AvoiderWorldGameOverScreen();
        Greenfoot.setWorld(go);
    }
}
