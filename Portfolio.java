
/**
 * Ashok Canchi
 */
import java.util.Scanner;   

public class Portfolio
{
    // instance variables - replace the example below with your own
    private int errorCode;
    public Portfolio()
    {
        // initialise instance variables
        errorCode = 0;
    }
    
    public static void main(String[] args)
    {
        //Portfolio runner = new Portfolio();
       Keyinput.printPrompt("\u000C");
       Keyinput.printPrompt("Ashok's portfolio:");
        int exit = 1;
 
        while(exit != 0) //while function to repeat the program
        {
           Keyinput.printPrompt("\nType 1 for the CountdownSong\n");
           Keyinput.printPrompt("Type 2 for a Farenhieght and Celsius conversion tool\n");
           Keyinput.printPrompt("Type 3 for a multiple choice quiz on the C programming language\n"); 
           Keyinput.printPrompt("Type 4 for the Guessing Game\n");
           Keyinput.printPrompt("Type 5 for a tool that will find the mean for an array of values\n");
           int choose = Keyinput.inInt("Type 6 for a dice rolling game\n");
           String[] arg = new String[] {"123"};
           if(choose == 1) //using if conditionals to help give the user what program they wanted
           { 
               CountdownSong CD = new CountdownSong(); //helping to connect the classes together by making an object
               CD.countmain(args);
           }
           
           if(choose == 2)
           {
               Faren fh = new Faren(); //helping to connect the classes together by making an object
              fh.farenmain();
           } 
           
           if (choose == 3) 
           {  
               MC multiplechoice = new MC(); //helping to connect the classes together by making an object
               multiplechoice.MCmain(args);
           }
           if (choose == 4) 
           {  
               Randomness rand = new Randomness(); 
               rand.Randomness();
            } 
            if (choose == 5) 
           {  
               MeanLab mean = new MeanLab(); 
               mean.main_method();
            }
            if (choose == 6) 
           {  
               RandomDice dice = new RandomDice(); 
               dice.RandomDice();
            }
           if(exit != 0) //using if statement to see if user wants to repeat
           {
              Keyinput.printPrompt("\nType 3 to repeat program\n");
              exit = Keyinput.inInt("Type 0 to quit\n");
           }
        }
    }
}