import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private int x;
    private int y;
    private String scene;
    World currentWorld;
    
    public Button(){
        
    }
    
    public Button(int x, int y, String scene, String image){
        this.x = x;
        this.y = y;
        this.scene = scene;
        GreenfootImage button = new GreenfootImage(image);
        setImage(button);
    }
    
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            if (scene == "Mult-menu"){
                getWorld().setBackground("fingerprint.jpg");
                GameRunner.goToMultMenu();
            }
            else if (scene == "Mult-levelOne"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToMultLevelOne();
            }
            else if (scene == "start"){
                getWorld().setBackground("fingerprint.jpg");
                GameRunner.goToStart();
            }
            else if (scene == "Div-menu"){
                getWorld().setBackground("fingerprint.jpg");
                GameRunner.goToDivMenu();
            }
            else if (scene == "Div-levelOne"){
                getWorld().setBackground("brick.jpg");
                GameRunner.goToDivLevelOne();
            }
        }
            
        // Add your action code here.
    }
    
}
