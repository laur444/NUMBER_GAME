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
    static int tryCounter = 2;
    static int[] currentArray;
    static String currentTheme;

    //empty default constructor
    public GameRunner(){

    }

    // Starts the game and sets the neccesary static variables
    public static void gameStart(int win, String operator){
        gameStarted = true;
        winCondition = win;
        gameType = operator;
        tryCounter = 2;
    }

    // Ends game and resets the static variables
    public static void gameStop(){
        gameStarted = false;
        gameProduct = 1;
        gameQuotient = 1;
        GameNum.clickCounter = 0;
        winCondition = 0;
        currentArray = null;
    }

    public static void displayTries(){
        int x1 = 550;
        int x2 = 625;
        int x3 = 700;
        int y = 50;
        Tries ex1 = new Tries();
        Tries ex2 = new Tries();
        Tries ex3 = new Tries();

        if (tryCounter == 2){
            Scene.currentWorld.addObject(ex1, x1, y);
            Scene.currentWorld.addObject(ex2, x2, y);
            Scene.currentWorld.addObject(ex3, x3, y);            
        } else if (tryCounter == 1){
            Scene.currentWorld.addObject(ex1, x1, y);
            Scene.currentWorld.addObject(ex2, x2, y);

        } else if (tryCounter == 0){
            Scene.currentWorld.addObject(ex1, x1, y);
        }
    }

    // goes to start screne
    public static void goToStart(){
        GameRunner.gameStop();
        int multButtonX = 200;
        int ButtonY = 300;
        int divButtonX = 550;

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button multPlayButton = new Button("Mult-WorldSelect", "MultStart.png");
        Scene.currentWorld.addObject(multPlayButton, multButtonX, ButtonY);

        Button divPlayButton = new Button("Div-WorldSelect", "DivStart.png");
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

        Button worldOneButton = new Button("Mult-World1menu", "World1.png");
        Scene.currentWorld.addObject(worldOneButton, 115, 300);
        
        Button worldTwoButton = new Button("Mult-World2menu", "World1.png");
        Scene.currentWorld.addObject(worldTwoButton, 290, 300);
        
        Button worldThreeButton = new Button("Mult-World3menu", "World1.png");
        Scene.currentWorld.addObject(worldThreeButton, 465, 300);
        
        Button challengeButton = new Button("Mult-challenge", "World1.png");
        Scene.currentWorld.addObject(challengeButton, 640, 300);
    }

    // ends current game and goes to the multiplication menu screne
    public static void goToWorldOneMultMenu(){
        int LeftLeftX = 225;
        int LeftMiddleX = 325;
        int RightMiddleX = 425;
        int RightRightX = 525;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme1";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Mult-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        Button levelOneStart = new Button("Mult-World1levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Mult-World1levelTwo", "numberOne.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Mult-World1levelThree", "numberOne.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Mult-World1levelFour", "numberOne.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Mult-World1levelFive", "numberOne.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Mult-World1levelSix", "numberOne.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Mult-World1levelSeven", "numberOne.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Mult-World1levelEight", "numberOne.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Mult-World1levelNine", "numberOne.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Mult-World1levelTen", "numberOne.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Mult-World1levelEleven", "numberOne.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Mult-World1levelTwelve", "numberOne.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }

    public static void goToWorldTwoMultMenu(){
        int LeftLeftX = 225;
        int LeftMiddleX = 325;
        int RightMiddleX = 425;
        int RightRightX = 525;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme2";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Mult-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        Button levelOneStart = new Button("Mult-World2levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Mult-World2levelTwo", "numberOne.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Mult-World2levelThree", "numberOne.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Mult-World2levelFour", "numberOne.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Mult-World2levelFive", "numberOne.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Mult-World2levelSix", "numberOne.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Mult-World2levelSeven", "numberOne.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Mult-World2levelEight", "numberOne.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Mult-World2levelNine", "numberOne.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Mult-World2levelTen", "numberOne.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Mult-World2levelEleven", "numberOne.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Mult-World2levelTwelve", "numberOne.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    public static void goToWorldThreeMultMenu(){
        int LeftLeftX = 225;
        int LeftMiddleX = 325;
        int RightMiddleX = 425;
        int RightRightX = 525;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme3";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Mult-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        Button levelOneStart = new Button("Mult-World3levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Mult-World3levelTwo", "numberOne.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Mult-World3levelThree", "numberOne.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Mult-World3levelFour", "numberOne.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Mult-World3levelFive", "numberOne.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Mult-World3levelSix", "numberOne.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Mult-World3levelSeven", "numberOne.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Mult-World3levelEight", "numberOne.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Mult-World3levelNine", "numberOne.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Mult-World3levelTen", "numberOne.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Mult-World3levelEleven", "numberOne.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Mult-World3levelTwelve", "numberOne.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    public static void goToMultChallenge(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");
        
        Button backButton = new Button("Mult-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);
        
        
    }
    
    // goes to multiplication level one and starts the game
    public static void goToMultWorldOneLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        GameRunner.gameStart(6, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 2, 3);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelTwo(){

    }

    public static void goToMultWorldOneLevelThree(){

    }

    public static void goToMultWorldOneLevelFour(){

    }

    public static void goToMultWorldOneLevelFive(){
        
    }

    public static void goToMultWorldOneLevelSix(){

    }

    public static void goToMultWorldOneLevelSeven(){

    }

    public static void goToMultWorldOneLevelEight(){

    }

    public static void goToMultWorldOneLevelNine(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        GameRunner.gameStart(32, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 75, 16, 2);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelTen(){

    }

    public static void goToMultWorldOneLevelEleven(){

    }

    public static void goToMultWorldOneLevelTwelve(){

    }

    public static void goToMultWorldTwoLevelOne(){

    }

    public static void goToMultWorldTwoLevelTwo(){

    }

    public static void goToMultWorldTwoLevelThree(){

    }

    public static void goToMultWorldTwoLevelFour(){

    }

    public static void goToMultWorldTwoLevelFive(){

    }

    public static void goToMultWorldTwoLevelSix(){

    }

    public static void goToMultWorldTwoLevelSeven(){

    }

    public static void goToMultWorldTwoLevelEight(){

    }

    public static void goToMultWorldTwoLevelNine(){

    }

    public static void goToMultWorldTwoLevelTen(){

    }

    public static void goToMultWorldTwoLevelEleven(){

    }

    public static void goToMultWorldTwoLevelTwelve(){

    }

    public static void goToMultWorldThreeLevelOne(){

    }

    public static void goToMultWorldThreeLevelTwo(){

    }

    public static void goToMultWorldThreeLevelThree(){

    }

    public static void goToMultWorldThreeLevelFour(){

    }

    public static void goToMultWorldThreeLevelFive(){

    }

    public static void goToMultWorldThreeLevelSix(){

    }

    public static void goToMultWorldThreeLevelSeven(){

    }

    public static void goToMultWorldThreeLevelEight(){

    }

    public static void goToMultWorldThreeLevelNine(){

    }

    public static void goToMultWorldThreeLevelTen(){

    }

    public static void goToMultWorldThreeLevelEleven(){

    }

    public static void goToMultWorldThreeLevelTwelve(){

    }

    
    public static void goToDivWorldSelect(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("start", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        Button worldOneButton = new Button("Div-World1menu", "World1.png");
        Scene.currentWorld.addObject(worldOneButton, 115, 300);
        
        Button worldTwoButton = new Button("Div-World2menu", "World1.png");
        Scene.currentWorld.addObject(worldTwoButton, 290, 300);
        
        Button worldThreeButton = new Button("Div-World3menu", "World1.png");
        Scene.currentWorld.addObject(worldThreeButton, 465, 300);
        
        Button challengeButton = new Button("Div-challenge", "World1.png");
        Scene.currentWorld.addObject(challengeButton, 640, 300);
    }

    // ends current game and goes to the division menu screne
    public static void goToWorldOneDivMenu(){
        int LeftLeftX = 225;
        int LeftMiddleX = 325;
        int RightMiddleX = 425;
        int RightRightX = 525;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme1";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Div-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        Button levelOneStart = new Button("Div-World1levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Div-World1levelTwo", "numberOne.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Div-World1levelThree", "numberOne.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Div-World1levelFour", "numberOne.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Div-World1levelFive", "numberOne.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Div-World1levelSix", "numberOne.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Div-World1levelSeven", "numberOne.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Div-World1levelEight", "numberOne.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Div-World1levelNine", "numberOne.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Div-World1levelTen", "numberOne.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Div-World1levelEleven", "numberOne.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Div-World1levelTwelve", "numberOne.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }

    public static void goToWorldTwoDivMenu(){
        int LeftLeftX = 225;
        int LeftMiddleX = 325;
        int RightMiddleX = 425;
        int RightRightX = 525;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme2";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Div-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        Button levelOneStart = new Button("Div-World2levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Div-World2levelTwo", "numberOne.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Div-World2levelThree", "numberOne.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Div-World2levelFour", "numberOne.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Div-World2levelFive", "numberOne.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Div-World2levelSix", "numberOne.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Div-World2levelSeven", "numberOne.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Div-World2levelEight", "numberOne.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Div-World2levelNine", "numberOne.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Div-World2levelTen", "numberOne.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Div-World2levelEleven", "numberOne.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Div-World2levelTwelve", "numberOne.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    public static void goToWorldThreeDivMenu(){
        int LeftLeftX = 225;
        int LeftMiddleX = 325;
        int RightMiddleX = 425;
        int RightRightX = 525;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme3";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Div-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        Button levelOneStart = new Button("Div-World3levelOne", "numberOne.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Div-World3levelTwo", "numberOne.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Div-World3levelThree", "numberOne.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Div-World3levelFour", "numberOne.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Div-World3levelFive", "numberOne.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Div-World3levelSix", "numberOne.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Div-World3levelSeven", "numberOne.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Div-World3levelEight", "numberOne.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Div-World3levelNine", "numberOne.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Div-World3levelTen", "numberOne.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Div-World3levelEleven", "numberOne.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Div-World3levelTwelve", "numberOne.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    public static void goToDivChallenge(){
        
    }
    
    // goes to division level one and starts the game
    public static void goToDivWorldOneLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        Scene.currentWorld.setBackground("brick.jpg");

        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 50, 50);

        GameRunner.gameStart(3, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 16, 6, 2);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelTwo(){

    }

    public static void goToDivWorldOneLevelThree(){

    }

    public static void goToDivWorldOneLevelFour(){

    }

    public static void goToDivWorldOneLevelFive(){

    }

    public static void goToDivWorldOneLevelSix(){

    }

    public static void goToDivWorldOneLevelSeven(){

    }

    public static void goToDivWorldOneLevelEight(){

    }

    public static void goToDivWorldOneLevelNine(){
        
    }

    public static void goToDivWorldOneLevelTen(){

    }

    public static void goToDivWorldOneLevelEleven(){

    }

    public static void goToDivWorldOneLevelTwelve(){

    }

    public static void goToDivWorldTwoLevelOne(){

    }

    public static void goToDivWorldTwoLevelTwo(){

    }

    public static void goToDivWorldTwoLevelThree(){

    }

    public static void goToDivWorldTwoLevelFour(){

    }

    public static void goToDivWorldTwoLevelFive(){

    }

    public static void goToDivWorldTwoLevelSix(){

    }

    public static void goToDivWorldTwoLevelSeven(){

    }

    public static void goToDivWorldTwoLevelEight(){

    }

    public static void goToDivWorldTwoLevelNine(){

    }

    public static void goToDivWorldTwoLevelTen(){

    }

    public static void goToDivWorldTwoLevelEleven(){

    }

    public static void goToDivWorldTwoLevelTwelve(){

    }

    public static void goToDivWorldThreeLevelOne(){

    }

    public static void goToDivWorldThreeLevelTwo(){

    }

    public static void goToDivWorldThreeLevelThree(){

    }

    public static void goToDivWorldThreeLevelFour(){

    }

    public static void goToDivWorldThreeLevelFive(){

    }

    public static void goToDivWorldThreeLevelSix(){

    }

    public static void goToDivWorldThreeLevelSeven(){

    }

    public static void goToDivWorldThreeLevelEight(){

    }

    public static void goToDivWorldThreeLevelNine(){

    }

    public static void goToDivWorldThreeLevelTen(){

    }

    public static void goToDivWorldThreeLevelEleven(){

    }

    public static void goToDivWorldThreeLevelTwelve(){

    }
    
    // creates a question bar for the level
    public static void createQuestionBar(){
        if (GameRunner.gameStarted){
            TextBox questBar = new TextBox();
            Scene.currentWorld.addObject(questBar, 300, 50);
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

    public static void createThreeByThree(int[] finalArray){
        int leftX = 275;
        int middleX = 375;
        int rightX = 475;
        int topY = 250;
        int middleY = 350;
        int bottomY = 450;

        createQuestionBar();

        GameNum topLeft = new GameNum(leftX, topY, finalArray[0]);
        Scene.currentWorld.addObject(topLeft, leftX, topY);

        GameNum topMiddle = new GameNum(middleX, topY, finalArray[1]);
        Scene.currentWorld.addObject(topMiddle, middleX, topY);

        GameNum topRight = new GameNum(rightX, topY, finalArray[2]);
        Scene.currentWorld.addObject(topRight, rightX, topY);

        GameNum middleLeft = new GameNum(leftX, middleY, finalArray[3]);
        Scene.currentWorld.addObject(middleLeft, leftX, middleY);

        GameNum middleMiddle = new GameNum(middleX, middleY, finalArray[4]);
        Scene.currentWorld.addObject(middleMiddle, middleX, middleY);

        GameNum middleRight = new GameNum(rightX, middleY, finalArray[5]);
        Scene.currentWorld.addObject(middleRight, rightX, middleY);

        GameNum bottomLeft = new GameNum(leftX, bottomY, finalArray[6]);
        Scene.currentWorld.addObject(bottomLeft, leftX, bottomY);

        GameNum bottomMiddle = new GameNum(middleX, bottomY, finalArray[7]);
        Scene.currentWorld.addObject(bottomMiddle, middleX, bottomY);

        GameNum bottomRight = new GameNum(rightX, bottomY, finalArray[8]);
        Scene.currentWorld.addObject(bottomRight, rightX, bottomY);
    }

    public static void createFourByFour(int[] finalArray){
        int leftLeftX = 225;
        int middleLeftX = 325;
        int middleRightX = 425;
        int rightRightX = 525;
        int topTopY = 250;
        int middleTopY = 350;
        int middleBottomY = 450;
        int bottomBottomY = 550;

        createQuestionBar();

        GameNum LLXTTY = new GameNum(leftLeftX, topTopY, finalArray[0]);
        Scene.currentWorld.addObject(LLXTTY, leftLeftX, topTopY);

        GameNum MLXTTY = new GameNum(middleLeftX, topTopY, finalArray[1]);
        Scene.currentWorld.addObject(MLXTTY, middleLeftX, topTopY);

        GameNum MRXTTY = new GameNum( middleRightX, topTopY, finalArray[2]);
        Scene.currentWorld.addObject(MRXTTY, middleRightX, topTopY);

        GameNum RRXTTY = new GameNum( rightRightX, topTopY, finalArray[3]);
        Scene.currentWorld.addObject(RRXTTY, rightRightX, topTopY);

        GameNum LLXMTY = new GameNum( leftLeftX, middleTopY, finalArray[4]);
        Scene.currentWorld.addObject(LLXMTY, leftLeftX, middleTopY);

        GameNum MLXMTY = new GameNum( middleLeftX, middleTopY, finalArray[5]);
        Scene.currentWorld.addObject(MLXMTY, middleLeftX, middleTopY);

        GameNum MRXMTY = new GameNum( middleRightX, middleTopY, finalArray[6]);
        Scene.currentWorld.addObject(MRXMTY, middleRightX, middleTopY);

        GameNum RRXMTY = new GameNum( rightRightX, middleTopY, finalArray[7]);
        Scene.currentWorld.addObject(RRXMTY, rightRightX, middleTopY);

        GameNum LLXMBY = new GameNum( leftLeftX, middleBottomY, finalArray[8]);
        Scene.currentWorld.addObject(LLXMBY, leftLeftX, middleBottomY);

        GameNum MLXMBY = new GameNum( middleLeftX, middleBottomY, finalArray[9]);
        Scene.currentWorld.addObject(MLXMBY, middleLeftX, middleBottomY);

        GameNum MRXMBY = new GameNum( middleRightX, middleBottomY, finalArray[10]);
        Scene.currentWorld.addObject(MRXMBY, middleRightX, middleBottomY);

        GameNum RRXMBY = new GameNum( rightRightX, middleBottomY, finalArray[11]);
        Scene.currentWorld.addObject(RRXMBY, rightRightX, middleBottomY);

        GameNum LLXBBY = new GameNum( leftLeftX, bottomBottomY, finalArray[12]);
        Scene.currentWorld.addObject(LLXBBY, leftLeftX, bottomBottomY);

        GameNum MLXBBY = new GameNum( middleLeftX, bottomBottomY, finalArray[13]);
        Scene.currentWorld.addObject(MLXBBY, middleLeftX, bottomBottomY);

        GameNum MRXBBY = new GameNum( middleRightX, bottomBottomY, finalArray[14]);
        Scene.currentWorld.addObject(MRXBBY, middleRightX, bottomBottomY);

        GameNum RRXBBY = new GameNum( rightRightX, bottomBottomY, finalArray[15]);
        Scene.currentWorld.addObject(RRXBBY, rightRightX, bottomBottomY);
    }

    public static void createSixBySix(int[] finalArray){
        int Q23LeftX = 125;
        int Q23MiddleX = 225;
        int Q23RightX = 325;
        
        int Q14LeftX = 425;
        int Q14MiddleX = 525;
        int Q14RightX = 625;
        
        int Q12TopY = 110;
        int Q12MiddleY = 210;
        int Q12BottomY = 310;
        
        int Q34TopY = 410;
        int Q34MiddleY = 510;
        int Q34BottomY = 610;
        
        createQuestionBar();
        
        GameNum Q2LT = new GameNum(Q23LeftX, Q12TopY, finalArray[0]);
        Scene.currentWorld.addObject(Q2LT, Q23LeftX, Q12TopY);
        
        GameNum Q2MT = new GameNum(Q23MiddleX, Q12TopY, finalArray[1]);
        Scene.currentWorld.addObject(Q2MT, Q23MiddleX, Q12TopY);
        
        GameNum Q2RT = new GameNum(Q23RightX, Q12TopY, finalArray[2]);
        Scene.currentWorld.addObject(Q2RT, Q23RightX, Q12TopY);
        
        GameNum Q1LT = new GameNum(Q14LeftX, Q12TopY, finalArray[3]);
        Scene.currentWorld.addObject(Q1LT, Q14LeftX, Q12TopY);
        
        GameNum Q1MT = new GameNum(Q14MiddleX, Q12TopY, finalArray[4]);
        Scene.currentWorld.addObject(Q1MT, Q14MiddleX, Q12TopY);
        
        GameNum Q1RT = new GameNum(Q14RightX, Q12TopY, finalArray[5]);
        Scene.currentWorld.addObject(Q1RT, Q14RightX, Q12TopY);
        
        GameNum Q2LM = new GameNum(Q23LeftX, Q12MiddleY, finalArray[6]);
        Scene.currentWorld.addObject(Q2LM, Q23LeftX, Q12MiddleY);
        
        GameNum Q2MM = new GameNum(Q23MiddleX, Q12MiddleY, finalArray[7]);
        Scene.currentWorld.addObject(Q2MM, Q23MiddleX, Q12MiddleY);
        
        GameNum Q2RM = new GameNum(Q23RightX, Q12MiddleY, finalArray[8]);
        Scene.currentWorld.addObject(Q2RM, Q23RightX, Q12MiddleY);
        
        GameNum Q1LM = new GameNum(Q14LeftX, Q12MiddleY, finalArray[9]);
        Scene.currentWorld.addObject(Q1LM, Q14LeftX, Q12MiddleY);
        
        GameNum Q1MM = new GameNum(Q14MiddleX, Q12MiddleY, finalArray[10]);
        Scene.currentWorld.addObject(Q1MM, Q14MiddleX, Q12MiddleY);
        
        GameNum Q1RM = new GameNum(Q14RightX, Q12MiddleY, finalArray[11]);
        Scene.currentWorld.addObject(Q1RM, Q14RightX, Q12MiddleY);
        
        GameNum Q2LB = new GameNum(Q23LeftX, Q12BottomY, finalArray[12]);
        Scene.currentWorld.addObject(Q2LB, Q23LeftX, Q12BottomY);
        
        GameNum Q2MB = new GameNum(Q23MiddleX, Q12BottomY, finalArray[13]);
        Scene.currentWorld.addObject(Q2MB, Q23MiddleX, Q12BottomY);
        
        GameNum Q2RB = new GameNum(Q23RightX, Q12BottomY, finalArray[14]);
        Scene.currentWorld.addObject(Q2RB, Q23RightX, Q12BottomY);
        
        GameNum Q1LB = new GameNum(Q14LeftX, Q12BottomY, finalArray[15]);
        Scene.currentWorld.addObject(Q1LB, Q14LeftX, Q12BottomY);
        
        GameNum Q1MB = new GameNum(Q14MiddleX, Q12BottomY, finalArray[16]);
        Scene.currentWorld.addObject(Q1MB, Q14MiddleX, Q12BottomY);
        
        GameNum Q1RB = new GameNum(Q14RightX, Q12BottomY, finalArray[17]);
        Scene.currentWorld.addObject(Q1RB, Q14RightX, Q12BottomY);
        
        GameNum Q3LT = new GameNum(Q23LeftX, Q34TopY, finalArray[18]);
        Scene.currentWorld.addObject(Q3LT, Q23LeftX, Q34TopY);
        
        GameNum Q3MT = new GameNum(Q23MiddleX, Q34TopY, finalArray[19]);
        Scene.currentWorld.addObject(Q3MT, Q23MiddleX, Q34TopY);
        
        GameNum Q3RT = new GameNum(Q23RightX, Q34TopY, finalArray[20]);
        Scene.currentWorld.addObject(Q3RT, Q23RightX, Q34TopY);
        
        GameNum Q4LT = new GameNum(Q14LeftX, Q34TopY, finalArray[21]);
        Scene.currentWorld.addObject(Q4LT, Q14LeftX, Q34TopY);
        
        GameNum Q4MT = new GameNum(Q14MiddleX, Q34TopY, finalArray[22]);
        Scene.currentWorld.addObject(Q4MT, Q14MiddleX, Q34TopY);
        
        GameNum Q4RT = new GameNum(Q14RightX, Q34TopY, finalArray[23]);
        Scene.currentWorld.addObject(Q4RT, Q14RightX, Q34TopY);
        
        GameNum Q3LM = new GameNum(Q23LeftX, Q34MiddleY, finalArray[24]);
        Scene.currentWorld.addObject(Q3LM, Q23LeftX, Q34MiddleY);
        
        GameNum Q3MM = new GameNum(Q23MiddleX, Q34MiddleY, finalArray[25]);
        Scene.currentWorld.addObject(Q3MM, Q23MiddleX, Q34MiddleY);
        
        GameNum Q3RM = new GameNum(Q23RightX, Q34MiddleY, finalArray[26]);
        Scene.currentWorld.addObject(Q3RM, Q23RightX, Q34MiddleY);
        
        GameNum Q4LM = new GameNum(Q14LeftX, Q34MiddleY, finalArray[27]);
        Scene.currentWorld.addObject(Q4LM, Q14LeftX, Q34MiddleY);
        
        GameNum Q4MM = new GameNum(Q14MiddleX, Q34MiddleY, finalArray[28]);
        Scene.currentWorld.addObject(Q4MM, Q14MiddleX, Q34MiddleY);
        
        GameNum Q4RM = new GameNum(Q14RightX, Q34MiddleY, finalArray[29]);
        Scene.currentWorld.addObject(Q4RM, Q14RightX, Q34MiddleY);
        
        GameNum Q3LB = new GameNum(Q23LeftX, Q34BottomY, finalArray[30]);
        Scene.currentWorld.addObject(Q3LB, Q23LeftX, Q34BottomY);
        
        GameNum Q3MB = new GameNum(Q23MiddleX, Q34BottomY, finalArray[31]);
        Scene.currentWorld.addObject(Q3MB, Q23MiddleX, Q34BottomY);
        
        GameNum Q3RB = new GameNum(Q23RightX, Q34BottomY, finalArray[32]);
        Scene.currentWorld.addObject(Q3RB, Q23RightX, Q34BottomY);
        
        GameNum Q4LB = new GameNum(Q14LeftX, Q34BottomY, finalArray[33]);
        Scene.currentWorld.addObject(Q4LB, Q14LeftX, Q34BottomY);
        
        GameNum Q4MB = new GameNum(Q14MiddleX, Q34BottomY, finalArray[34]);
        Scene.currentWorld.addObject(Q4MB, Q14MiddleX, Q34BottomY);
        
        GameNum Q4RB = new GameNum(Q14RightX, Q34BottomY, finalArray[35]);
        Scene.currentWorld.addObject(Q4RB, Q14RightX, Q34BottomY);
        
    }
    
    public void act(){

    }
}

/**
 * Act - do whatever the GameRunner wants to do. This method is called whenever
 * the 'Act' or 'Run' button gets pressed in the environment.
 */
