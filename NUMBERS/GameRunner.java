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
    
    //empty default constructor
    public GameRunner(){
        
    }
    
    // Starts the game and sets the neccesary static variables
    public static void gameStart(int win, String operator){
        gameStarted = true;
        winCondition = win;
        gameType = operator;
    }
    
    // Ends game and resets the static variables
    public static void gameStop(){
        gameStarted = false;
        gameProduct = 1;
        gameQuotient = 1;
        GameNum.clickCounter = 0;
        winCondition = 0;
    }
    
    // goes to start screne
    public static void goToStart(){
        GameRunner.gameStop();
        int multButtonX = 200;
        int ButtonY = 270;
        int divButtonX = 550;
      
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        
        Button multPlayButton = new Button("Mult-WorldSelect", "playButton.png");
        Scene.currentWorld.addObject(multPlayButton, multButtonX, ButtonY);
        
        Button divPlayButton = new Button("Div-WorldSelect", "playButton.png");
        Scene.currentWorld.addObject(divPlayButton, divButtonX, ButtonY);
        
        Button instButton = new Button("inst", "instButton.png");
        Scene.currentWorld.addObject(instButton, 675, 575);
    }
    
    // goes to instruction screne
    public static void goToInstructions(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        
        TextBox instBar = new TextBox("inst");
        Scene.currentWorld.addObject(instBar, 375, 300);
        
        Button backButton = new Button("start", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
    }
    
    public static void goToMultWorldSelect(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("start", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        Button worldOneButton = new Button("Mult-World1menu", "numberOne.png");
        Scene.currentWorld.addObject(worldOneButton, 150, 150);
    }
    
    // ends current game and goes to the multiplication menu screne
    public static void goToWorldOneMultMenu(){
        gameStop();
        
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Mult-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        Button levelOneStart = new Button("Mult-World1levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, 175, 150);
        
        Button levelTwoStart = new Button("Mult-World1levelTwo", "numberOne.png");
        Scene.currentWorld.addObject(levelTwoStart, 275, 150);
        
        Button levelThreeStart = new Button("Mult-World1levelThree", "numberOne.png");
        Scene.currentWorld.addObject(levelThreeStart, 375, 150);
        
        Button levelFourStart = new Button("Mult-World1levelFour", "numberOne.png");
        Scene.currentWorld.addObject(levelFourStart, 475, 150);
        
        Button levelFiveStart = new Button("Mult-World1levelFive", "numberOne.png");
        Scene.currentWorld.addObject(levelFiveStart, 575, 150);
    }
    
    // goes to multiplication level one and starts the game
    public static void goToMultWorldOneLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(9, "mult");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void goToMultWorldOneLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(8, "mult");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void goToMultWorldOneLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(7, "mult");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void goToMultWorldOneLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(6, "mult");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void goToMultWorldOneLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(64, "mult");
        createFiveByFive(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9, 10, 11, 12, 13, 14, 15, 16);
    }
    
    public static void goToDivWorldSelect(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("start", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        Button worldOneButton = new Button("Div-World1menu", "numberOne.png");
        Scene.currentWorld.addObject(worldOneButton, 150, 150);
    }
    
    // ends current game and goes to the division menu screne
    public static void goToWorldOneDivMenu(){
        gameStop();
        
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Div-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        Button levelOneStart = new Button ("Div-World1levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, 175, 150);
        
        Button levelTwoStart = new Button ("Div-World1levelTwo", "numberOne.png");
        Scene.currentWorld.addObject(levelTwoStart, 275, 150);
        
        Button levelThreeStart = new Button ("Div-World1levelThree", "numberOne.png");
        Scene.currentWorld.addObject(levelThreeStart, 375, 150);
        
        Button levelFourStart = new Button ("Div-World1levelFour", "numberOne.png");
        Scene.currentWorld.addObject(levelFourStart, 475, 150);
        
        Button levelFiveStart = new Button ("Div-World1levelFive", "numberOne.png");
        Scene.currentWorld.addObject(levelFiveStart, 575, 150);
    }
    
    // goes to division level one and starts the game
    public static void goToDivWorldOneLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(2, "div");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void goToDivWorldOneLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(3, "div");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void goToDivWorldOneLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(4, "div");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void goToDivWorldOneLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(5, "div");
        createThreeByThree(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9);
    }
    
    public static void goToDivWorldOneLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        GameRunner.gameStart(7, "div");
        createFiveByFive(Scene.currentWorld, 1, 2, 3, 4, 5, 6, 7 , 8, 9, 10, 11, 12, 13, 14, 15, 16);
    }
    
    // creates a question bar for the level
    public static void createQuestionBar(){
        if (GameRunner.gameStarted){
            TextBox questBar = new TextBox();
            Scene.currentWorld.addObject(questBar, 375, 125);
        }
    }
    
    // creates a three by three grid with given values
    public static void createThreeByThree(World world, int value1, int value2, int value3, int value4, int value5, int value6, int value7, int value8, int value9){
    
        int leftX = 275;
        int middleX = 375;
        int rightX = 475;
        int topY = 250;
        int middleY = 350;
        int bottomY = 450;
        
        createQuestionBar();
        
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
    
    public static void createFiveByFive(World world, int value1, int value2, int value3, int value4, int value5, int value6, int value7, int value8, int value9, int value10, int value11, int value12, int value13, int value14, int value15, int value16){
    
        int leftLeftX = 225;
        int middleLeftX = 325;
        int middleRightX = 425;
        int rightRightX = 525;
        int topTopY = 250;
        int middleTopY = 350;
        int middleBottomY = 450;
        int bottomBottomY = 550;
        
        createQuestionBar();
        
        GameNum LLXTTY = new GameNum(leftLeftX, topTopY, value1);
        Scene.currentWorld.addObject(LLXTTY, leftLeftX, topTopY);
        
        GameNum MLXTTY = new GameNum(middleLeftX, topTopY, value2);
        Scene.currentWorld.addObject(MLXTTY, middleLeftX, topTopY);
        
        GameNum MRXTTY = new GameNum( middleRightX, topTopY, value3);
        Scene.currentWorld.addObject(MRXTTY, middleRightX, topTopY);
        
        GameNum RRXTTY = new GameNum( rightRightX, topTopY, value4);
        Scene.currentWorld.addObject(RRXTTY, rightRightX, topTopY);
        
        GameNum LLXMTY = new GameNum( leftLeftX, middleTopY, value5);
        Scene.currentWorld.addObject(LLXMTY, leftLeftX, middleTopY);
        
        GameNum MLXMTY = new GameNum( middleLeftX, middleTopY, value6);
        Scene.currentWorld.addObject(MLXMTY, middleLeftX, middleTopY);
        
        GameNum MRXMTY = new GameNum( middleRightX, middleTopY, value7);
        Scene.currentWorld.addObject(MRXMTY, middleRightX, middleTopY);
        
        GameNum RRXMTY = new GameNum( rightRightX, middleTopY, value8);
        Scene.currentWorld.addObject(RRXMTY, rightRightX, middleTopY);
        
        GameNum LLXMBY = new GameNum( leftLeftX, middleBottomY, value9);
        Scene.currentWorld.addObject(LLXMBY, leftLeftX, middleBottomY);
        
        GameNum MLXMBY = new GameNum( middleLeftX, middleBottomY, value10);
        Scene.currentWorld.addObject(MLXMBY, middleLeftX, middleBottomY);
        
        GameNum MRXMBY = new GameNum( middleRightX, middleBottomY, value11);
        Scene.currentWorld.addObject(MRXMBY, middleRightX, middleBottomY);
        
        GameNum RRXMBY = new GameNum( rightRightX, middleBottomY, value12);
        Scene.currentWorld.addObject(RRXMBY, rightRightX, middleBottomY);
        
        GameNum LLXBBY = new GameNum( leftLeftX, bottomBottomY, value13);
        Scene.currentWorld.addObject(LLXBBY, leftLeftX, bottomBottomY);
        
        GameNum MLXBBY = new GameNum( middleLeftX, bottomBottomY, value14);
        Scene.currentWorld.addObject(MLXBBY, middleLeftX, bottomBottomY);
        
        GameNum MRXBBY = new GameNum( middleRightX, bottomBottomY, value15);
        Scene.currentWorld.addObject(MRXBBY, middleRightX, bottomBottomY);
        
        GameNum RRXBBY = new GameNum( rightRightX, bottomBottomY, value16);
        Scene.currentWorld.addObject(RRXBBY, rightRightX, bottomBottomY);
    }
    
    public void act(){
        
    }
    }
    
    /**
     * Act - do whatever the GameRunner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
