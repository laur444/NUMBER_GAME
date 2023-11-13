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
                getWorld().setBackground("fingerprint.jpg");
                GameRunner.goToStart();
            }
            else if (scene == "inst"){
                getWorld().setBackground("fingerprint.jpg");
                GameRunner.goToInstructions();
            }
            else if (scene == "Mult-WorldSelect"){
                getWorld().setBackground("fingerprint.jpg");
                GameRunner.goToMultWorldSelect();
            }
            else if (scene == "Div-WorldSelect"){
                getWorld().setBackground("fingerprint.jpg");
                GameRunner.goToDivWorldSelect();
            }
            else if (scene == "Mult-World1menu"){
                getWorld().setBackground("fingerprint.jpg");
                GameRunner.goToWorldOneMultMenu();
            }
            else if (scene == "Mult-World1levelOne"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToMultWorldOneLevelOne();
            }
            else if (scene == "Mult-World1levelTwo"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToMultWorldOneLevelTwo();
            }
            else if (scene == "Mult-World1levelThree"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToMultWorldOneLevelThree();
            }
            else if (scene == "Mult-World1levelFour"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToMultWorldOneLevelFour();
            }
            else if (scene == "Mult-World1levelFive"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToMultWorldOneLevelFive();
            }
            else if (scene == "Div-World1menu"){
                getWorld().setBackground("fingerprint.jpg");
                GameRunner.goToWorldOneDivMenu();
            }
            else if (scene == "Div-World1levelOne"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToDivWorldOneLevelOne();
            }
            else if (scene == "Div-World1levelTwo"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToDivWorldOneLevelTwo();
            }
            else if (scene == "Div-World1levelThree"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToDivWorldOneLevelThree();
            }
            else if (scene == "Div-World1levelFour"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToDivWorldOneLevelFour();
            }
            else if (scene == "Div-World1levelFive"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToDivWorldOneLevelFive();
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
