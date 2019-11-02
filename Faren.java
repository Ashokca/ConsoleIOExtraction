
import chn.util.*; 
/**
 * Write a description of class Drawingtool here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Faren
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Drawingtool
     */
    public static void farenmain()
    {
        int response, repeat; //initilizing variables
        double faren, cel; 
        String cel1, faren1;
        do 
        {
        Keyinput.printPrompt("1. Do you want to convert from farenhieght to celsious\n"); //printing questions
        response = Keyinput.inInt("2.Do you want to convert from celsius\n");  //getting user inputted integer
        
      
        switch (response) 
        { 
            case 1:  
                faren = Keyinput.inDouble("How much farenhieght\n");  //getting user input for farenhieght
                cel = (5.0/9) * (faren - 32.0); //calculating celsius from the user inputted farenhieght
                cel1 = Double.toString(cel);
                Keyinput.printPrompt(cel1);
                break; 
            case 2:  
                
                cel = Keyinput.inDouble("How much Celsius\n"); //getting user input for celsius
                faren = (cel * 9/5.0) + 32; 
                faren1 = Double.toString(faren);//calculating farenhieght for the user inputted celsius
                Keyinput.printPrompt(faren1);
                break; 
            default: 
                Keyinput.printPrompt("Not a valid number\n"); 
            }
        Keyinput.printPrompt("Would you like to repeat the program?\n");  //letting the user repeat the program with a do-while
        Keyinput.printPrompt("1. Yes\n"); 
        repeat = Keyinput.inInt("no\n");  
    } 
    while(repeat == 1);
        
    }


    public static void sampleMethod(String[] args)
    {
    }
        
        
}   
    

