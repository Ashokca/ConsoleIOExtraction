import chn.util.*; 
import apcslib.*; 
import java.util.Random;
/**
 * Write a description of class RandomDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomDice
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RandomDice
     */
    public static void RandomDice()
    {
        // initialise instance variables
        int dice = 0, player_1 = 0, x = 0, cpu = 0, round_counter = 1, response = 0;
        int player_win = 0, cpu_win= 0;
        do 
        {
         player_1 = 0; 
         cpu = 0;   
        Keyinput.printPrompt("Begin Round" + " " + round_counter);
        while (dice <= 0) 
        {
        dice = Keyinput.inInt("\nHow many dice would you like to roll?\n");
    } 
    Random rand = new Random(); 
    for (x = 1; x <= dice; x++)
    { 
        player_1 += rand.nextInt(6); 
        cpu += rand.nextInt(6);
    }
    Keyinput.printPrompt("The amount you got was" + " " + player_1); 
    Keyinput.printPrompt("\nThe amount the cpu got was" + " " + cpu);
    if (player_1 > cpu) 
    { 
        Keyinput.printPrompt("\nYou win!\n"); 
        player_win++;
    } 
    if (cpu > player_1) 
    { 
        Keyinput.printPrompt("\nThe Cpu Wins!\n"); 
        cpu_win++;
    } 
    response = Keyinput.inInt("Would you like to begin another round?[1/0]\n"); 
}
 while(response != 0);
       if (player_win > cpu_win) 
       {
           Keyinput.printPrompt("You had more wins, therefore you are the winner!\n"); 
       } 
       else 
        if (cpu_win > player_win) 
        { 
            Keyinput.printPrompt("The cpu had more wins, therefore the cpu is the winner!\n"); 
        } 
        else 
         { 
             Keyinput.printPrompt("You and the cpu had the same amount of points, therefore it is a tie!\n");
         }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
