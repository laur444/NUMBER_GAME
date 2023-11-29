import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class GameNum extends Actor
{
    private int x;
    private int y;
    int num;
    String stringNum;
    static int clickCounter = 0;
    
    
    // initilizes the variables and calls setNum
    public GameNum(int x, int y, int num){
        this.num = num;
        this.x = x;
        this.y = y;
        if (num < 10){
            String file;
            file = GameRunner.currentTheme + "-" + String.valueOf(this.num) + ".png";
            setNum(file);
        } else {
            stringNum = String.valueOf(this.num);
            setNum();
        }
        
    }

    // sets the image to display the value of the GameNum object
    public void setNum(){
        GreenfootImage numBox = new GreenfootImage("Wall.jpg");
        numBox.setColor(Color.WHITE);
        numBox.drawString(stringNum, 20, 30);
        setImage(numBox);
    }
    
    public void setNum(String file){
        GreenfootImage image = new GreenfootImage(file);
        setImage(file);
    }

    // determines game mode and stores users answers
    public void numStart(){
        if (GameRunner.gameStarted){
            if (GameRunner.gameType == "mult"){
                // if clicked and hasnt been clicked more than once
                if (Greenfoot.mouseClicked(this) && clickCounter <= 1){
                    setImage("blueWall.jpg");
                    clickCounter += 1;
                    GameRunner.gameProduct *= num;
                }
                // if click counter is 2 and the answer is correct
                else if (clickCounter == 2 && GameRunner.gameProduct == GameRunner.winCondition){
                    Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(GameNum.class));
                    TextBox winScreen = new TextBox("win");
                    Scene.currentWorld.addObject(winScreen, 375, 345);
                    GameRunner.gameStop();

                }
                // if click counter is 2 and the answer is wrong
                else if (clickCounter >= 2 && GameRunner.gameProduct != GameRunner.winCondition){
                    // if the answer is wrong and there are still tries
                    if (GameRunner.tryCounter > 0){
                        GameRunner.tryCounter -= 1;
                        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(Tries.class));
                        GameRunner.displayTries();
                        clickCounter = 0;
                        GameRunner.gameProduct = 1;
                        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(GameNum.class));
                        if (GameRunner.currentArray.length == 9){
                            GameRunner.createThreeByThree(GameRunner.currentArray);
                        } else if (GameRunner.currentArray.length == 16){
                            GameRunner.createFourByFour(GameRunner.currentArray);
                        } else if (GameRunner.currentArray.length == 36){
                            GameRunner.createSixBySix(GameRunner.currentArray);
                        }
                    }
                    // if the answer is wrong and there are no more tries left
                    else if (GameRunner.tryCounter <= 0){
                        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(GameNum.class));
                        TextBox lossScreen = new TextBox("loss");
                        Scene.currentWorld.addObject(lossScreen, 375, 345);
                        GameRunner.gameStop();
                        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(Tries.class));

                    }
                }
            }

            else if (GameRunner.gameType == "div"){
                if (Greenfoot.mouseClicked(this) && clickCounter <= 1){
                    setImage("blueWall.jpg");
                    // if is first click
                    if (clickCounter < 1){
                        GameRunner.gameQuotient *= num;
                    }
                    // if it isnt first click
                    else{
                        GameRunner.gameQuotient /= num;
                    }
                    clickCounter += 1;
                }
                else if (clickCounter == 2 && GameRunner.gameQuotient == GameRunner.winCondition){
                    Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(GameNum.class));
                    TextBox winScreen = new TextBox("win");
                    Scene.currentWorld.addObject(winScreen, 375, 345);
                    GameRunner.gameStop();
                }
                else if (clickCounter >= 2 && GameRunner.gameQuotient != GameRunner.winCondition){
                    if (GameRunner.tryCounter > 0){
                        GameRunner.tryCounter -= 1;
                        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(Tries.class));
                        GameRunner.displayTries();
                        clickCounter = 0;
                        GameRunner.gameQuotient = 1;
                        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(GameNum.class));
                        if (GameRunner.currentArray.length == 9){
                            GameRunner.createThreeByThree(GameRunner.currentArray);
                        } else if (GameRunner.currentArray.length == 16){
                            GameRunner.createFourByFour(GameRunner.currentArray);
                        } else if (GameRunner.currentArray.length == 36){
                            GameRunner.createSixBySix(GameRunner.currentArray);
                        }
                    }
                    // if the answer is wrong and there are no more tries left
                    else if (GameRunner.tryCounter <= 0){
                        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(GameNum.class));
                        TextBox lossScreen = new TextBox("loss");
                        Scene.currentWorld.addObject(lossScreen, 375, 345);
                        GameRunner.gameStop();
                        Scene.currentWorld.removeObjects(Scene.currentWorld.getObjects(Tries.class));
                    }
                }
            } else if (GameRunner.gameType == "Mult-challenge"){
                
            } else if (GameRunner.gameType == "Div-challenge"){
                
            }
        }
    }

    /**
     * Act - do whatever the gameNum wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        numStart();
    }
}

