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
        super(750, 650, 1); 
        prepare();
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GameRunner.points = 0;
        GameNum.clickCounter = 0;
        GameRunner gameRunner = new GameRunner();
        addObject(gameRunner, -100, -100);
        currentWorld = gameRunner.getWorld();
        
        GameRunner.goToStart();
    }
    
}
