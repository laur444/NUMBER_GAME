import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuestionBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{
    static GreenfootImage barImage;
    private int width = 350;
    private int height = 50;
    
    // default constructor calls the setBar method
    public TextBox(){
        setBar();
    }
    
    // value constructor that creates the instruction screen
    public TextBox(String key){
        if (key == "inst"){
            GreenfootImage instScreene = new GreenfootImage(700, 450);
            instScreene.setColor(Color.BLACK);
            instScreene.fillRect(0, 0, 700, 450);
            instScreene.setColor(Color.WHITE);
            instScreene.drawString(
            "AHHJKHJKHJKHJKHJKHJKHKHJKHJKHJKHJKKJHKJHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\nAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 10, 25);
            setImage(instScreene);
        }
        if (key == "win-screen"){
            
        }
        if (key == "loss-screen"){
            
        }
    }
    
    // creates the image and draw the correct question for the level
    public void setBar(){
        GreenfootImage questionBar = new GreenfootImage(width, height);
        questionBar.setColor(Color.BLACK);
        questionBar.fillRect(0, 0, width, height);
        questionBar.setColor(Color.WHITE);
        if (GameRunner.gameType == "mult"){
                questionBar.drawString("What two numbers multiply to get " + GameRunner.winCondition, 25, 25);
            }
            else if (GameRunner.gameType == "div"){
                questionBar.drawString("What two numbers divide to get " + GameRunner.winCondition, 25, 25);
            }
        setImage(questionBar);
    }
    
    /**
     * Act - do whatever the QuestionBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
