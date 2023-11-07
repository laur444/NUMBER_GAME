import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene extends World
{
    static World currentWorld;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Scene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 550, 1); 
        prepare();
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GameNum.clickCounter = 0;
        int multButtonX = 200;
        int ButtonY = 270;
        int divButtonX = 550;
        GameRunner gameRunner = new GameRunner();
        addObject(gameRunner, -100, -100);
        currentWorld = gameRunner.getWorld();
        
        Button multPlayButton = new Button(multButtonX, ButtonY, "Mult-menu", "playButton.png");
        addObject(multPlayButton, multButtonX, ButtonY);
        
        Button divPlayButton = new Button(divButtonX, ButtonY, "Div-menu", "playButton.png");
        addObject(divPlayButton, divButtonX, ButtonY);
    }
    
}
