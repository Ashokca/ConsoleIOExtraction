import chn.util.*;
import java.util.Scanner; 
import java.util.*;
public class CountdownSong
{ // everything in Java is a class, we will learn more latter
    
    public static void countmain(String[] args)
    { // code blocks are in curly braces {}
        // initialise control variables for program   
        int repeat = 0;
        String name2;  
        do 
        {
        Keyinput.printPrompt("How many monkeys do you want jumping on the bed?\n"); 
     
        Scanner reader = new Scanner(System.in); 
         int countdown = reader.nextInt(); 
         //getting user inputed integer
        Keyinput.printPrompt("what is the doctor's name?\n"); 
       
                   // integrer variable assignment, statements end in semi colon
        String bedJumpers = "monkeys";     
        String doctor = Keyinput.inString();// string of characters  
        Keyinput.printPrompt("What is the animal's name\n");
        String animal = Keyinput.inString(); 
        //getting user inputted animal

        // prepare for countdown loop
        int i = countdown; 
        countdown = 0;
        String space = " ";
        while (i > -1) { // while is a control flow statement, observe blocks of code

   
                // messages print each time through loop,  println prints a line to console, plus sign (i + space...) concatonates
             
                Keyinput.printPrompt(i + space + "little" + space + animal + space + "jumping on the bed\n");
                Keyinput.printPrompt("One fell off and broke his head\n");
               Keyinput.printPrompt("Mama called doctor" + space +  doctor + space + "and doctor" + space + doctor + space + "said\n");
                Keyinput.printPrompt("no more" + space + animal + space + "jumping on the bed.\n"); 
          //using + operator to add strings like doctor and animal
       i--;
    } 
    Keyinput.printPrompt("Do you want to go again?\n"); 
    Keyinput.printPrompt("1. Yes\n"); 
    Keyinput.printPrompt("0. No\n"); 
    repeat = Keyinput.inInt("Enter an integer\n"); 
            // decrement i at end of loop
        // this is equivalent to i = i - 1, -- is a shorthand
            
        }     
        while(repeat != 0);
    } 
}