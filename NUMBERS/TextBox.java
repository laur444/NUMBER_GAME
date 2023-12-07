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
            GreenfootImage instScreen = new GreenfootImage(700, 450);
            instScreen.setColor(Color.BLACK);
            instScreen.fillRect(0, 0, 700, 450);
            instScreen.setColor(Color.WHITE);
            instScreen.drawString(
            "Multiplication mode:\nYou have three tries as displayed on the top right.\nThe given question is displayed on the top.\nClick the multiplicand and the multiplier that's product is the answer seen in the question.\n(Hint: Multiplication is cummulative so the order clicked is not important.)", 10, 25);
            instScreen.drawString(
            "Division mode:\nYou have three tries as displayed on the top right.\nThe given question is displayed on the top.\nClick the dividend first and then the divisor that's quotient is the answer seen in the question\n(Hint: Division is not cummulative so you must pay attention to the order you click.)", 10, 100);
            setImage(instScreen);
        }
        if (key == "win"){
            GreenfootImage winScreen = new GreenfootImage("winloss.png");
            Font font = new Font(75);
            winScreen.setFont(font);
            winScreen.drawString("Victory!", 60, 190);
            winScreen.drawString("+" + GameRunner.pvalue, 60, 318);
            Font font1 = new Font(28);
            winScreen.setFont(font1);
            winScreen.drawString("Current Points: " + Double.toString(GameRunner.points), 65, 415);
            
            
            setImage(winScreen);
            
        }
        if (key == "loss"){
            GreenfootImage winScreen = new GreenfootImage("winloss.png");
            Font font = new Font(65);
            winScreen.setFont(font);
            winScreen.drawString("Try Again!", 60, 190);
            winScreen.drawString("-10", 60, 318);
            Font font1 = new Font(28);
            winScreen.setFont(font1);
            winScreen.drawString("Current Points: " + Double.toString(GameRunner.points), 65, 415);
            
            
            setImage(winScreen);
            
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
