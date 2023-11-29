import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class NumGen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumGen extends Actor
{
    public NumGen(){
        
    }
    
    public static int[] generate(String mode, int length, int bound, int x, int y){
        int[] finalArray = new int[length];
        Random rand = new Random();
        if (mode.equals("mult")){
            int product = x * y;
            for (int i = 0; i < length; i++){
                int temp = rand.nextInt(bound)+1;
            
                if (i > 0){
                     for (int z = i-1; z >= 0; z--){
                        while (temp * finalArray[z] == product || temp == finalArray[z] || temp == x || temp == y){
                            temp = rand.nextInt(bound)+1;
                    }
                }
            }
            finalArray[i] = temp;
        }
        } else if (mode.equals("div")){
            int quotient = x / y;
            
            for (int i = 0; i < length; i++){
                int temp = rand.nextInt(bound)+1;
                if (i > 0){
                    for (int z = i-1; z >= 0; z--){
                        while (temp / finalArray[z] == quotient || finalArray[z] / temp == quotient || temp == finalArray[z] || temp == x || temp == y){
                            temp = rand.nextInt(bound)+1;
                        }
                    }
                }
                finalArray[i] = temp;
            }
        }
        
        int index1 = rand.nextInt(length);
        int index2 = rand.nextInt(length);
        while (index1 == index2){
            index2 = rand.nextInt(length);
        }
        finalArray[index1] = x;
        finalArray[index2] = y;
        
        return finalArray;
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
