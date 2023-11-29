import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private String scene;
    World currentWorld;
    private int x;
    private int y; 
    
    //empty default constructor
    public Button(){
        
    }
    
    // value constructor that initializes the button
    public Button(String scene, String image){
        this.scene = scene;
        GreenfootImage button = new GreenfootImage(image);
        setImage(button);
    }
    
    // decodes the scene keyword and determines which goTo method to use
    public void decodeScene(){
        if (Greenfoot.mouseClicked(this)){
            if (scene == "start"){
                GameRunner.goToStart();
            }
            
            else if (scene == "inst"){
                GameRunner.goToInstructions();
            }
            
            else if (scene == "Mult-WorldSelect"){
                GameRunner.goToMultWorldSelect();
            }
            else if (scene == "Div-WorldSelect"){
                GameRunner.goToDivWorldSelect();
            }
            
            else if (scene == "Mult-World1menu"){
                GameRunner.goToWorldOneMultMenu();
            }
            else if (scene == "Mult-World1levelOne"){
                GameRunner.goToMultWorldOneLevelOne();
            }
            else if (scene == "Mult-World1levelTwo"){
                GameRunner.goToMultWorldOneLevelTwo();
            }
            else if (scene == "Mult-World1levelThree"){
                GameRunner.goToMultWorldOneLevelThree();
            }
            else if (scene == "Mult-World1levelFour"){
                GameRunner.goToMultWorldOneLevelFour();
            }
            else if (scene == "Mult-World1levelFive"){
                GameRunner.goToMultWorldOneLevelFive();
            }
            else if (scene == "Mult-World1levelSix"){
                GameRunner.goToMultWorldOneLevelSix();
            }
            else if (scene == "Mult-World1levelSeven"){
                GameRunner.goToMultWorldOneLevelSeven();
            }
            else if (scene == "Mult-World1levelEight"){
                GameRunner.goToMultWorldOneLevelEight();
            }
            else if (scene == "Mult-World1levelNine"){
                GameRunner.goToMultWorldOneLevelNine();
            }
            else if (scene == "Mult-World1levelTen"){
                GameRunner.goToMultWorldOneLevelTen();
            }
            else if (scene == "Mult-World1levelEleven"){
                GameRunner.goToMultWorldOneLevelEleven();
            }
            else if (scene == "Mult-World1levelTwelve"){
                GameRunner.goToMultWorldOneLevelTwelve();
            }
            
            else if (scene == "Mult-World2menu"){
                GameRunner.goToWorldTwoMultMenu();
            }
            else if (scene == "Mult-World2levelOne"){
                GameRunner.goToMultWorldTwoLevelOne();
            }
            else if (scene == "Mult-World2levelTwo"){
                GameRunner.goToMultWorldTwoLevelTwo();
            }
            else if (scene == "Mult-World2levelThree"){
                GameRunner.goToMultWorldTwoLevelThree();
            }
            else if (scene == "Mult-World2levelFour"){
                GameRunner.goToMultWorldTwoLevelFour();
            }
            else if (scene == "Mult-World2levelFive"){
                GameRunner.goToMultWorldTwoLevelFive();
            }
            else if (scene == "Mult-World2levelSix"){
                GameRunner.goToMultWorldTwoLevelSix();
            }
            else if (scene == "Mult-World2levelSeven"){
                GameRunner.goToMultWorldTwoLevelSeven();
            }
            else if (scene == "Mult-World2levelEight"){
                GameRunner.goToMultWorldTwoLevelEight();
            }
            else if (scene == "Mult-World2levelNine"){
                GameRunner.goToMultWorldTwoLevelNine();
            }
            else if (scene == "Mult-World2levelTen"){
                GameRunner.goToMultWorldTwoLevelTen();
            }
            else if (scene == "Mult-World2levelEleven"){
                GameRunner.goToMultWorldTwoLevelEleven();
            }
            else if (scene == "Mult-World2levelTwelve"){
                GameRunner.goToMultWorldTwoLevelTwelve();
            }
            
            else if (scene == "Mult-World3menu"){
                GameRunner.goToWorldThreeMultMenu();
            }
            else if (scene == "Mult-World3levelOne"){
                GameRunner.goToMultWorldThreeLevelOne();
            }
            else if (scene == "Mult-World3levelTwo"){
                GameRunner.goToMultWorldThreeLevelTwo();
            }
            else if (scene == "Mult-World3levelThree"){
                GameRunner.goToMultWorldThreeLevelThree();
            }
            else if (scene == "Mult-World3levelFour"){
                GameRunner.goToMultWorldThreeLevelFour();
            }
            else if (scene == "Mult-World3levelFive"){
                GameRunner.goToMultWorldThreeLevelFive();
            }
            else if (scene == "Mult-World3levelSix"){
                GameRunner.goToMultWorldThreeLevelSix();
            }
            else if (scene == "Mult-World3levelSeven"){
                GameRunner.goToMultWorldThreeLevelSeven();
            }
            else if (scene == "Mult-World3levelEight"){
                GameRunner.goToMultWorldThreeLevelEight();
            }
            else if (scene == "Mult-World3levelNine"){
                GameRunner.goToMultWorldThreeLevelNine();
            }
            else if (scene == "Mult-World3levelTen"){
                GameRunner.goToMultWorldThreeLevelTen();
            }
            else if (scene == "Mult-World3levelEleven"){
                GameRunner.goToMultWorldThreeLevelEleven();
            }
            else if (scene == "Mult-World3levelTwelve"){
                GameRunner.goToMultWorldThreeLevelTwelve();
            }
            
            else if (scene == "Div-World1menu"){
                GameRunner.goToWorldOneDivMenu();
            }
            else if (scene == "Div-World1levelOne"){
                GameRunner.goToDivWorldOneLevelOne();
            }
            else if (scene == "Div-World1levelTwo"){
                GameRunner.goToDivWorldOneLevelTwo();
            }
            else if (scene == "Div-World1levelThree"){
                GameRunner.goToDivWorldOneLevelThree();
            }
            else if (scene == "Div-World1levelFour"){
                GameRunner.goToDivWorldOneLevelFour();
            }
            else if (scene == "Div-World1levelFive"){
                GameRunner.goToDivWorldOneLevelFive();
            }
            else if (scene == "Div-World1levelSix"){
                GameRunner.goToDivWorldOneLevelSix();
            }
            else if (scene == "Div-World1levelSeven"){
                GameRunner.goToDivWorldOneLevelSeven();
            }
            else if (scene == "Div-World1levelEight"){
                GameRunner.goToDivWorldOneLevelEight();
            }
            else if (scene == "Div-World1levelNine"){
                GameRunner.goToDivWorldOneLevelNine();
            }
            else if (scene == "Div-World1levelTen"){
                GameRunner.goToDivWorldOneLevelTen();
            }
            else if (scene == "Div-World1levelEleven"){
                GameRunner.goToDivWorldOneLevelEleven();
            }
            else if (scene == "Div-World1levelTwelve"){
                GameRunner.goToDivWorldOneLevelTwelve();
            }
            
            else if (scene == "Div-World2menu"){
                GameRunner.goToWorldTwoDivMenu();
            }
            else if (scene == "Div-World2levelOne"){
                GameRunner.goToDivWorldTwoLevelOne();
            }
            else if (scene == "Div-World2levelTwo"){
                GameRunner.goToDivWorldTwoLevelTwo();
            }
            else if (scene == "Div-World2levelThree"){
                GameRunner.goToDivWorldTwoLevelThree();
            }
            else if (scene == "Div-World2levelFour"){
                GameRunner.goToDivWorldTwoLevelFour();
            }
            else if (scene == "Div-World2levelFive"){
                GameRunner.goToDivWorldTwoLevelFive();
            }
            else if (scene == "Div-World2levelSix"){
                GameRunner.goToDivWorldTwoLevelSix();
            }
            else if (scene == "Div-World2levelSeven"){
                GameRunner.goToDivWorldTwoLevelSeven();
            }
            else if (scene == "Div-World2levelEight"){
                GameRunner.goToMultWorldTwoLevelEight();
            }
            else if (scene == "Div-World2levelNine"){
                GameRunner.goToDivWorldTwoLevelNine();
            }
            else if (scene == "Div-World2levelTen"){
                GameRunner.goToDivWorldTwoLevelTen();
            }
            else if (scene == "Div-World2levelEleven"){
                GameRunner.goToDivWorldTwoLevelEleven();
            }
            else if (scene == "Div-World2levelTwelve"){
                GameRunner.goToDivWorldTwoLevelTwelve();
            }
            
            else if (scene == "Div-World3menu"){
                GameRunner.goToWorldThreeDivMenu();
            }
            else if (scene == "Div-World3levelOne"){
                GameRunner.goToDivWorldThreeLevelOne();
            }
            else if (scene == "Div-World3levelTwo"){
                GameRunner.goToDivWorldThreeLevelTwo();
            }
            else if (scene == "Div-World3levelThree"){
                GameRunner.goToDivWorldThreeLevelThree();
            }
            else if (scene == "Div-World3levelFour"){
                GameRunner.goToDivWorldThreeLevelFour();
            }
            else if (scene == "Div-World3levelFive"){
                GameRunner.goToDivWorldThreeLevelFive();
            }
            else if (scene == "Div-World3levelSix"){
                GameRunner.goToDivWorldThreeLevelSix();
            }
            else if (scene == "Div-World3levelSeven"){
                GameRunner.goToDivWorldThreeLevelSeven();
            }
            else if (scene == "Div-World3levelEight"){
                GameRunner.goToDivWorldThreeLevelEight();
            }
            else if (scene == "Div-World3levelNine"){
                GameRunner.goToDivWorldThreeLevelNine();
            }
            else if (scene == "Div-World3levelTen"){
                GameRunner.goToDivWorldThreeLevelTen();
            }
            else if (scene == "Div-World3levelEleven"){
                GameRunner.goToDivWorldThreeLevelEleven();
            }
            else if (scene == "Div-World3levelTwelve"){
                GameRunner.goToDivWorldThreeLevelTwelve();
            }
            else if (scene == "Mult-challenge"){
                GameRunner.goToMultChallenge();
            }
            else if (scene == "Div-challenge"){
                GameRunner.goToDivChallenge();
            }
        }
    }
    
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        decodeScene();
        // Add your action code here.
    }
    
}
