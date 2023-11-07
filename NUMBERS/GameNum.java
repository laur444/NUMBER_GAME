import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GameNum extends Actor
{
    int x;
    int y;
    int num;
    String stringNum;
    static int clickCounter = 0;

    
    public GameNum(int x, int y, int num){
        this.x = x;
        this.y = y;
        this.num = num;
        stringNum = String.valueOf(this.num);
        
        setNum();
    }
    
    public void setNum(){
        GreenfootImage numBox = new GreenfootImage("Wall.jpg");
        numBox.setColor(Color.WHITE);
        numBox.drawString(stringNum, 20, 30);
        setImage(numBox);
    }
    
    
    
    /**
     * Act - do whatever the gameNum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (GameRunner.gameStarted){
            if (GameRunner.gameType == "mult"){
                if (Greenfoot.mouseClicked(this) && clickCounter <= 1){
                setImage("blueWall.jpg");
                clickCounter += 1;
                GameRunner.gameProduct *= num;
            }
                else if (clickCounter == 2 && GameRunner.gameProduct == GameRunner.winCondition){
                GameRunner.gameStop();
                getWorld().setBackground("blueWall.jpg");
            }
                else if (clickCounter >= 2 && GameRunner.gameProduct != GameRunner.winCondition){
                GameRunner.gameStop();
                // if statement for operator 
                GameRunner.goToMultMenu();
            }
            }
            else if (GameRunner.gameType == "div"){
                if (Greenfoot.mouseClicked(this) && clickCounter <= 1){
                    setImage("blueWall.jpg");
                    if (clickCounter < 1){
                        GameRunner.gameQuotient *= num;
                    }
                    else{
                        GameRunner.gameQuotient /= num;
                    }
                    clickCounter += 1;
            }
                else if (clickCounter == 2 && GameRunner.gameQuotient == GameRunner.winCondition){
                    GameRunner.gameStop();
                    getWorld().setBackground("blueWall.jpg");
            }
                else if (clickCounter >= 2 && GameRunner.gameQuotient != GameRunner.winCondition){
                    GameRunner.gameStop();
                    GameRunner.goToDivMenu();
            }
            }
        }
    }
    }
