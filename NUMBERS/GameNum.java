import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

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
        } else if (num < 100){
            GreenfootImage image = new GreenfootImage(80, 55);
            String file1;
            String file2;
            String toString = String.valueOf(this.num);
            file1 = GameRunner.currentTheme + "-" + toString.charAt(0) + ".png";
            file2 = GameRunner.currentTheme + "-" + toString.charAt(1) + ".png";
            GreenfootImage image1 = new GreenfootImage(file1);
            GreenfootImage image2 = new GreenfootImage(file2);
            
            image.drawImage(image1, 0, 0);
            image.drawImage(image2, 30, 5);
            
            setImage(image);
        } else if (num < 1000){
            GreenfootImage image = new GreenfootImage(110, 60);
            String file1;
            String file2;
            String file3;
            String toString = String.valueOf(this.num);
            file1 = GameRunner.currentTheme + "-" + toString.charAt(0) + ".png";
            file2 = GameRunner.currentTheme + "-" + toString.charAt(1) + ".png";
            file3 = GameRunner.currentTheme + "-" + toString.charAt(2) + ".png";
            GreenfootImage image1 = new GreenfootImage(file1);
            GreenfootImage image2 = new GreenfootImage(file2);
            GreenfootImage image3 = new GreenfootImage(file3);
            
            image.drawImage(image1, 0, 0);
            image.drawImage(image2, 30, 5);
            image.drawImage(image3, 60, 10);
            
            setImage(image);
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
                    GameRunner.points += GameRunner.pvalue;
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
                        GameRunner.pvalue = (double)((int)(GameRunner.pvalue * 0.85));
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
                        if (GameRunner.points >= 10.0){
                            GameRunner.points -= 10.0;
                        } else {
                            GameRunner.points = 0.0;
                        }
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

