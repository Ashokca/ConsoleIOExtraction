import chn.util.*; 
import apcslib.*; 
import java.util.Random;
/**
 * Write a description of class MeanLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MeanLab
{
    // instance variables - replace the example below with your own
    private int x; 


    /**
     * Constructor for objects of class MeanLab
     */
    public static void MeanLab()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main_method()
    { 
       int x, z, rand_num;  
       float mean = 0;
       Random rand = new Random(); 
       z = rand.nextInt(50);
       int[] intArray = new int[z]; 
       for(x = 0; x < z; x++) 
       { 
          rand_num = rand.nextInt(50); 
          intArray[x] = z;
       } 
       mean = mean(intArray, z);  
       Keyinput.printPrompt("The mean is" + " " + mean + "\n");
    } 
    public static float mean(int array[], int rand_num) 
    { 
        int x; 
        float mean = 0, total = 0;
        for (x = 0; x < rand_num; x++) 
        { 
            total += array[x]; 
        } 
        mean = total/rand_num; 
        return mean;
    }
}
