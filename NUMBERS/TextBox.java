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
            GreenfootImage instScreen = new GreenfootImage("inst.png");
            Font font = new Font(25);
            instScreen.setFont(font);
            instScreen.setColor(Color.BLACK);
            instScreen.drawString(
            "Multiplication mode:\nYou have three tries as displayed on the top right.\nThe given question is displayed on the top.\nClick the multiplicand and the multiplier that's product\n is the answer seen in the question.\n(Hint: Multiplication is cummulative so the order\n clicked is not important.)",
            20, 40);
            instScreen.drawString(
            "Division mode:\nYou have three tries as displayed on the top right.\nThe given question is displayed on the top.\nClick the dividend first and then the divisor\n that's quotient is the answer seen in the question\n(Hint: Division is not cummulative so you must pay\n attention to the order you click.)",
            20, 250);
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
        GreenfootImage questionBar = new GreenfootImage("qbar.png");
        questionBar.setColor(Color.BLACK);
        Font font = new Font(15);
        questionBar.setFont(font);
        
        if (GameRunner.gameType == "mult"){
                questionBar.drawString("What two numbers multiply to get " + GameRunner.winCondition,
                30, 50);
            }
            else if (GameRunner.gameType == "div"){
                questionBar.drawString("What two numbers divide to get " + GameRunner.winCondition,
                30, 50);
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
