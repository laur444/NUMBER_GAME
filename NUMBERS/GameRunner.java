import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;


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
    static double points = 0.0;
    static double pvalue;
    

    //empty default constructor
    public GameRunner(){

    }

    // Starts the game and sets the neccesary static variables
    public static void gameStart(int win, String operator){
        gameStarted = true;
        winCondition = win;
        gameType = operator;
        tryCounter = 2;
        GameRunner.setBg();
    }

    // Ends game and resets the static variables
    public static void gameStop(){
        gameStarted = false;
        gameProduct = 1;
        gameQuotient = 1;
        GameNum.clickCounter = 0;
        winCondition = 0;
        currentArray = null;
        Scene.currentWorld.setBackground("NUMSUMS.png");
        if (points >= 100.0){
            Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
            
        }
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
        Scene.currentWorld.setBackground("NUMSUMS.png");
        
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
        Scene.currentWorld.addObject(instBar, 375, 325);

        Button backButton = new Button("start", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

    }

    public static void setBg(){
        if (GameRunner.currentTheme == "theme1"){
            Scene.currentWorld.setBackground("brick.jpg");
        } else if (GameRunner.currentTheme == "theme2"){
            Scene.currentWorld.setBackground("crumpled-paper.jpg");            
        } else if (GameRunner.currentTheme == "theme3"){
            Scene.currentWorld.setBackground("wet-blue.jpg");
        } else if (GameRunner.currentTheme == "theme4"){
            Scene.currentWorld.setBackground("space.jpg");
        }
    }
    
    public static void goToMultWorldSelect(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("start", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button worldOneButton = new Button("Mult-World1menu", "World1.png");
        Scene.currentWorld.addObject(worldOneButton, 115, 300);
        
        Button worldTwoButton = new Button("Mult-World2menu", "World2.png");
        Scene.currentWorld.addObject(worldTwoButton, 290, 300);
        
        Button worldThreeButton = new Button("Mult-World3menu", "World3.png");
        Scene.currentWorld.addObject(worldThreeButton, 465, 300);
        
        Button challengeButton = new Button("Mult-World4menu", "World4.png");
        Scene.currentWorld.addObject(challengeButton, 640, 300);
    }

    // ends current game and goes to the multiplication menu screne
    public static void goToWorldOneMultMenu(){
        int LeftLeftX = 110;
        int LeftMiddleX = 285;
        int RightMiddleX = 460;
        int RightRightX = 635;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme1";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Mult-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button levelOneStart = new Button("Mult-World1levelOne", "LEVEL1.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Mult-World1levelTwo", "LEVEL2.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Mult-World1levelThree", "LEVEL3.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Mult-World1levelFour", "LEVEL4.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Mult-World1levelFive", "LEVEL5.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Mult-World1levelSix", "LEVEL6.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Mult-World1levelSeven", "LEVEL7.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Mult-World1levelEight", "LEVEL8.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Mult-World1levelNine", "LEVEL9.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Mult-World1levelTen", "LEVEL10.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Mult-World1levelEleven", "LEVEL11.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Mult-World1levelTwelve", "LEVEL12.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }

    public static void goToWorldTwoMultMenu(){
        int LeftLeftX = 110;
        int LeftMiddleX = 285;
        int RightMiddleX = 460;
        int RightRightX = 635;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme2";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Mult-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button levelOneStart = new Button("Mult-World2levelOne", "LEVEL1.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Mult-World2levelTwo", "LEVEL2.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Mult-World2levelThree", "LEVEL3.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Mult-World2levelFour", "LEVEL4.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Mult-World2levelFive", "LEVEL5.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Mult-World2levelSix", "LEVEL6.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Mult-World2levelSeven", "LEVEL7.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Mult-World2levelEight", "LEVEL8.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Mult-World2levelNine", "LEVEL9.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Mult-World2levelTen", "LEVEL10.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Mult-World2levelEleven", "LEVEL11.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Mult-World2levelTwelve", "LEVEL12.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    public static void goToWorldThreeMultMenu(){
        int LeftLeftX = 110;
        int LeftMiddleX = 285;
        int RightMiddleX = 460;
        int RightRightX = 635;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme3";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Mult-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button levelOneStart = new Button("Mult-World3levelOne", "LEVEL1.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Mult-World3levelTwo", "LEVEL2.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Mult-World3levelThree", "LEVEL3.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Mult-World3levelFour", "LEVEL4.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Mult-World3levelFive", "LEVEL5.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Mult-World3levelSix", "LEVEL6.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Mult-World3levelSeven", "LEVEL7.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Mult-World3levelEight", "LEVEL8.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Mult-World3levelNine", "LEVEL9.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Mult-World3levelTen", "LEVEL10.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Mult-World3levelEleven", "LEVEL11.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Mult-World3levelTwelve", "LEVEL12.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    public static void goToWorldFourMultMenu(){
        int LeftLeftX = 110;
        int LeftMiddleX = 285;
        int RightMiddleX = 460;
        int RightRightX = 635;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme4";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Mult-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button levelOneStart = new Button("Mult-World4levelOne", "LEVEL1.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Mult-World4levelTwo", "LEVEL2.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Mult-World4levelThree", "LEVEL3.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Mult-World4levelFour", "LEVEL4.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Mult-World4levelFive", "LEVEL5.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Mult-World4levelSix", "LEVEL6.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Mult-World4levelSeven", "LEVEL7.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Mult-World4levelEight", "LEVEL8.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Mult-World4levelNine", "LEVEL9.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Mult-World4levelTen", "LEVEL10.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Mult-World4levelEleven", "LEVEL11.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Mult-World4levelTwelve", "LEVEL12.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    // goes to multiplication level one and starts the game
    public static void goToMultWorldOneLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(6, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 2, 3);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(15, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 5, 3);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(30, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 6, 5);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(36, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 12, 3);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 
        
        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(190, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 19, 10);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelSix(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(240, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 15, 16);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelSeven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(288, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 24, 12);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelEight(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(555, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 37, 15);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelNine(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(168, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 28, 6);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelTen(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(140, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 35, 4);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelEleven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1728, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 54, 32);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldOneLevelTwelve(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1980, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 60, 30);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(18, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 2, 9);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(28, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 7, 4);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(48, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 8, 6);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(77, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 11, 7);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(330, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 33, 10);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelSix(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(418, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 19, 22);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelSeven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(630, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 30, 21);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelEight(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(972, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 36, 27);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelNine(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(360, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 72, 5);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelTen(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(900, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 90, 10);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelEleven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(900, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 75, 12);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldTwoLevelTwelve(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(2250, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 45, 50);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(50, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 10, 5);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(48, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 12, 4);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(75, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 15, 5);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(112, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 16, 7);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(450, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 30, 15);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelSix(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1000, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 40, 25);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelSeven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1440, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 45, 32);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelEight(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1800, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 50, 36);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelNine(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(880, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 80, 11);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelTen(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(780, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 60, 13);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelEleven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1680, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 56, 30);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldThreeLevelTwelve(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1360, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 85, 16);
        createSixBySix(GameRunner.currentArray);
    }
    
    public static void goToMultWorldFourLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(42, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 7, 6);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(80, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 10, 8);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(126, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 14, 9);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(208, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 9, 16, 16, 13);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(245, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 35, 7);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelSix(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1152, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 36, 32);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelSeven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1080, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 45, 24);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelEight(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5; 

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(2160, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 16, 50, 48, 45);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelNine(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(765, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 85, 9);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelTen(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1050, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 70, 15);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelEleven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(1600, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 25, 64);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToMultWorldFourLevelTwelve(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 

        Button backButton = new Button("Mult-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(4950, "mult");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("mult", 36, 100, 99, 50);
        createSixBySix(GameRunner.currentArray);
    }
    
    
    public static void goToDivWorldSelect(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0; 
        
        
        
        Button backButton = new Button("start", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button worldOneButton = new Button("Div-World1menu", "World1.png");
        Scene.currentWorld.addObject(worldOneButton, 115, 300);
        
        Button worldTwoButton = new Button("Div-World2menu", "World2.png");
        Scene.currentWorld.addObject(worldTwoButton, 290, 300);
        
        Button worldThreeButton = new Button("Div-World3menu", "World3.png");
        Scene.currentWorld.addObject(worldThreeButton, 465, 300);
        
        Button challengeButton = new Button("Div-World4menu", "World4.png");
        Scene.currentWorld.addObject(challengeButton, 640, 300);
    }

    // ends current game and goes to the division menu screne
    public static void goToWorldOneDivMenu(){
        int LeftLeftX = 110;
        int LeftMiddleX = 285;
        int RightMiddleX = 460;
        int RightRightX = 635;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme1";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Div-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button levelOneStart = new Button("Div-World1levelOne", "LEVEL1.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Div-World1levelTwo", "LEVEL2.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Div-World1levelThree", "LEVEL3.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Div-World1levelFour", "LEVEL4.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Div-World1levelFive", "LEVEL5.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Div-World1levelSix", "LEVEL6.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Div-World1levelSeven", "LEVEL7.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Div-World1levelEight", "LEVEL8.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Div-World1levelNine", "LEVEL9.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Div-World1levelTen", "LEVEL10.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Div-World1levelEleven", "LEVEL11.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Div-World1levelTwelve", "LEVEL12.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }

    public static void goToWorldTwoDivMenu(){
        int LeftLeftX = 110;
        int LeftMiddleX = 285;
        int RightMiddleX = 460;
        int RightRightX = 635;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme2";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Div-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button levelOneStart = new Button("Div-World2levelOne", "LEVEL1.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Div-World2levelTwo", "LEVEL2.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Div-World2levelThree", "LEVEL3.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Div-World2levelFour", "LEVEL4.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Div-World2levelFive", "LEVEL5.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Div-World2levelSix", "LEVEL6.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Div-World2levelSeven", "LEVEL7.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Div-World2levelEight", "LEVEL8.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Div-World2levelNine", "LEVEL9.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Div-World2levelTen", "LEVEL10.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Div-World2levelEleven", "LEVEL11.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Div-World2levelTwelve", "LEVEL12.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    public static void goToWorldThreeDivMenu(){
        int LeftLeftX = 110;
        int LeftMiddleX = 285;
        int RightMiddleX = 460;
        int RightRightX = 635;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme3";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Div-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button levelOneStart = new Button("Div-World3levelOne", "LEVEL1.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Div-World3levelTwo", "LEVEL2.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Div-World3levelThree", "LEVEL3.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Div-World3levelFour", "LEVEL4.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Div-World3levelFive", "LEVEL5.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Div-World3levelSix", "LEVEL6.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Div-World3levelSeven", "LEVEL7.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Div-World3levelEight", "LEVEL8.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Div-World3levelNine", "LEVEL9.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Div-World3levelTen", "LEVEL10.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Div-World3levelEleven", "LEVEL11.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Div-World3levelTwelve", "LEVEL12.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    public static void goToWorldFourDivMenu(){
        int LeftLeftX = 110;
        int LeftMiddleX = 285;
        int RightMiddleX = 460;
        int RightRightX = 635;
        
        int TopY = 200;
        int MiddleY = 300;
        int BottomY = 400;
        
        GameRunner.currentTheme = "theme4";
        
        gameStop();

        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));

        Button backButton = new Button("Div-WorldSelect", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        Button levelOneStart = new Button("Div-World4levelOne", "LEVEL1.png");
        Scene.currentWorld.addObject(levelOneStart, LeftLeftX, TopY);

        Button levelTwoStart = new Button("Div-World4levelTwo", "LEVEL2.png");
        Scene.currentWorld.addObject(levelTwoStart, LeftMiddleX, TopY);

        Button levelThreeStart = new Button("Div-World4levelThree", "LEVEL3.png");
        Scene.currentWorld.addObject(levelThreeStart, RightMiddleX, TopY);

        Button levelFourStart = new Button("Div-World4levelFour", "LEVEL4.png");
        Scene.currentWorld.addObject(levelFourStart, RightRightX, TopY);

        Button levelFiveStart = new Button("Div-World4levelFive", "LEVEL5.png");
        Scene.currentWorld.addObject(levelFiveStart, LeftLeftX, MiddleY);
        
        Button levelSixStart = new Button("Div-World4levelSix", "LEVEL6.png");
        Scene.currentWorld.addObject(levelSixStart, LeftMiddleX, MiddleY);
        
        Button levelSevenStart = new Button("Div-World4levelSeven", "LEVEL7.png");
        Scene.currentWorld.addObject(levelSevenStart, RightMiddleX, MiddleY);
        
        Button levelEightStart = new Button("Div-World4levelEight", "LEVEL8.png");
        Scene.currentWorld.addObject(levelEightStart, RightRightX, MiddleY);
        
        Button levelNineStart = new Button("Div-World4levelNine", "LEVEL9.png");
        Scene.currentWorld.addObject(levelNineStart, LeftLeftX, BottomY);
        
        Button levelTenStart = new Button("Div-World4levelTen", "LEVEL10.png");
        Scene.currentWorld.addObject(levelTenStart, LeftMiddleX, BottomY);
        
        Button levelElevenStart = new Button("Div-World4levelEleven", "LEVEL11.png");
        Scene.currentWorld.addObject(levelElevenStart, RightMiddleX, BottomY);
        
        Button levelTwelveStart = new Button("Div-World4levelTwelve", "LEVEL12.png");
        Scene.currentWorld.addObject(levelTwelveStart, RightRightX, BottomY);
    }
    
    // goes to division level one and starts the game
    public static void goToDivWorldOneLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(3, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 16, 6, 2);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(7, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 16, 14, 2);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(9, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 30, 27, 3);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(10, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 30, 30, 3);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(6, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 20, 18, 3);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelSix(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(12, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 25, 24, 2);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelSeven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(13, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 40, 34, 3);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelEight(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(15, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 50, 45, 3);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelNine(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(26, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 60, 52, 2);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelTen(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(5, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 75, 75, 15);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelEleven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(9, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 100, 99, 11);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldOneLevelTwelve(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World1menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(10, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 100, 100, 10);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(6, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 20, 18, 3);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(3, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 25, 21, 7);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(3, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 25, 24, 8);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(3, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 30, 27, 9);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(8, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 40, 32, 4);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelSix(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(11, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 50, 44, 4);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelSeven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(5, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 40, 35, 7);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelEight(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(6, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 50, 48, 8);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelNine(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(14, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 60, 56, 4);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelTen(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(37, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 75, 74, 2);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelEleven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(20, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 90, 80, 4);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldTwoLevelTwelve(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World2menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(13, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 85, 78, 6);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(4, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 16, 16, 4);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(5, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 16, 15, 3);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(2, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 20, 18, 9);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(2, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 30, 30, 15);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(9, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 30, 27, 3);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelSix(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(12, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 50, 48, 4);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelSeven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(10, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 50, 50, 5);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelEight(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(23, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 50, 46, 2);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelNine(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(16, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 75, 64, 4);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelTen(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(8, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 90, 80, 10);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelEleven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(19, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 85, 76, 4);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldThreeLevelTwelve(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World3menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(22, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 95, 88, 4);
        createSixBySix(GameRunner.currentArray);
    }
    
    public static void goToDivWorldFourLevelOne(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(9, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 20, 18, 2);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelTwo(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(4, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 30, 24, 7);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelThree(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(4, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 25, 20, 5);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelFour(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 6.25;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(2, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 9, 25, 24, 12);
        createThreeByThree(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelFive(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(7, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 30, 28, 4);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelSix(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(7, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 45, 42, 6);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelSeven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(11, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 20, 44, 4);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelEight(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 12.5;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(7, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 16, 50, 49, 7);
        createFourByFour(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelNine(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(33, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 100, 99, 3);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelTen(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(9, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 90, 81, 9);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelEleven(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(19, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 100, 95, 5);
        createSixBySix(GameRunner.currentArray);
    }

    public static void goToDivWorldFourLevelTwelve(){
        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(null));
        GameRunner.pvalue = 25.0;
        
        Button backButton = new Button("Div-World4menu", "backButton.png");
        Scene.currentWorld.addObject(backButton, 80, 50);

        GameRunner.gameStart(4, "div");
        GameRunner.displayTries();
        GameRunner.currentArray = NumGen.generate("div", 36, 90, 84, 21);
        createSixBySix(GameRunner.currentArray);
    }
    
    // creates a question bar for the level
    public static void createQuestionBar(){
        if (GameRunner.gameStarted){
            TextBox questBar = new TextBox();
            Scene.currentWorld.addObject(questBar, 332, 50);
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
        int topTopY = 150;
        int middleTopY = 250;
        int middleBottomY = 350;
        int bottomBottomY = 450;

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
