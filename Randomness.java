
/**
 * Write a description of class Randomness here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*; 
import apcslib.*; 
import java.util.Random;
public class Randomness
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Randomness
     */
    public static void Randomness()
    { 
       
        Random rand = new Random(); 
        int number = 0, use_guess = 0, response = 0; 
        use_guess = 0;
        number = rand.nextInt(100);
        do {  
          while(use_guess != -1) 
          {  
              use_guess = mean_guess(use_guess, number);
            } 
            response = Keyinput.inInt("Would you like to play again with a new number?(1/0)\n");
            use_guess = 0;
        } 
        while(response == 1);
        
    }

    public static int mean_guess(int use_guess, int number)
    {
         
         
            while(use_guess != -1) 
            { 
                use_guess = Keyinput.inInt("Enter in your guess from 1-100(press -1 to quit)\n"); 
                if (use_guess > number) 
                    Keyinput.printPrompt("Too High!\n"); 
                else 
                    if (use_guess < number) 
                       Keyinput.printPrompt("Too Low!\n"); 
                       else 
                       {
                            Keyinput.printPrompt("You got it!\n"); 
                            use_guess = -1; 
                        }
            } 
            return -1;
    }
}
