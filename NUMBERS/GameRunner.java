import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameRunner extends Actor
{
    static boolean gameStarted = false;
    static int gameProduct = 1;
    static int gameQuotient = 1;
    static int winCondition;
    static String gameType = "";
    
    public GameRunner(){
        
    }
    
    // add operator parameter
    public static void gameStart(int win, String operator){
        gameStarted = true;
        winCondition = win;
        gameType = operator;
    }
    
    public static void gameStop(){
        gameStarted = false;
        gameProduct = 1;
        gameQuotient = 1;
        GameNum.clickCounter = 0;
    }
    
    public static void goToStart(){
        GameRunner.gameStop();
        int multButtonX = 200;
        int ButtonY = 270;
        int divButtonX = 550;
      
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        
        Button multPlayButton = new Button(multButtonX, ButtonY, "Mult-menu", "playButton.png");
        Scene.currentWorld.addObject(multPlayButton, multButtonX, ButtonY);
        
        Button divPlayButton = new Button(divButtonX, ButtonY, "Div-menu", "playButton.png");
        Scene.currentWorld.addObject(divPlayButton, divButtonX, ButtonY);
    }
    
    public static void goToMultMenu(){
        gameStop();
        
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button(50, 50, "start", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        Button levelOneStart = new Button (150, 150, "Mult-levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, 150, 150);
    }
    
    public static void goToDivMenu(){
        gameStop();
        
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button(50, 50, "start", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        Button levelOneStart = new Button (150, 150, "Div-levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, 150, 150);
    }
    
    public static void goToMultLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button(50, 50, "Mult-menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(9, "mult");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void goToDivLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button(50, 50, "Div-menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(3, "div");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void createThreeByThree(World world, int value1, int value2, int value3, int value4, int value5, int value6, int value7, int value8, int value9){
    
        int leftX = 275;
        int middleX = 375;
        int rightX = 475;
        int topY = 250;
        int middleY = 350;
        int bottomY = 450;
        
        GameNum topLeft = new GameNum(leftX, topY, value1);
        Scene.currentWorld.addObject(topLeft, leftX, topY);
        
        GameNum topMiddle = new GameNum(middleX, topY, value2);
        Scene.currentWorld.addObject(topMiddle, middleX, topY);
        
        GameNum topRight = new GameNum(rightX, topY, value3);
        Scene.currentWorld.addObject(topRight, rightX, topY);
        
        GameNum middleLeft = new GameNum(leftX, middleY, value4);
        Scene.currentWorld.addObject(middleLeft, leftX, middleY);
        
        GameNum middleMiddle = new GameNum(middleX, middleY, value5);
        Scene.currentWorld.addObject(middleMiddle, middleX, middleY);
        
        GameNum middleRight = new GameNum(rightX, middleY, value6);
        Scene.currentWorld.addObject(middleRight, rightX, middleY);
        
        GameNum bottomLeft = new GameNum(leftX, bottomY, value7);
        Scene.currentWorld.addObject(bottomLeft, leftX, bottomY);
        
        GameNum bottomMiddle = new GameNum(middleX, bottomY, value8);
        Scene.currentWorld.addObject(bottomMiddle, middleX, bottomY);
        
        GameNum bottomRight = new GameNum(rightX, bottomY, value9);
        Scene.currentWorld.addObject(bottomRight, rightX, bottomY);
    }
    
    public void act(){
        
    }
    }
    
    /**
     * Act - do whatever the GameRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
