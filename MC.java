
/**
 * Write a description of class MC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */ 
import chn.util.*;
public class MC
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MC
     */ 
   
    public static void MCmain(String[] args)
     {  
        int response;  
        double correct_answers = 0; //initilizing variables 
        double results;  
        int repeat = 0; 
        do { 
        correct_answers = 0;
        Keyinput.printPrompt("When two pointers in the c language point to two different arrays, is it benificial to compare them?\n");
           //printing questions and possible answer choices
        response = Keyinput.inInt("1. No" + '\n' + "2. Yes\n"); //getting user inputted integer
        if (response == 1) 
        {  
            Keyinput.printPrompt("Correct!\n"); //checking if the user entered the right number
            correct_answers += 1; //using the "+=" operator to write correct_answers = correct_answers + 1, this helps to tell how many questions the user got right
        }   
        Keyinput.printPrompt("What happens when the file buffer becomes full?\n");  //printing out the second question
        response = Keyinput.inInt("1. it destroys the data" + '\n' + "2.the data is written to a disk\n");  //getting user inputted integer
        if (response == 2) 
        {  
            Keyinput.printPrompt("Correct!\n"); //checking if the user entered the right number
            correct_answers += 1; //using the "+=" operator to write correct_answers = correct_answers + 1, this helps to tell how many questions the user got right
        }  
       results = (correct_answers/2.0) * 100; //calculating the percentage of questions the user got right
       Keyinput.printPrompt("You got " + results + "%\n"); //printing out the percentage of questions the user got right 
       Keyinput.printPrompt("Do you want to take the quiz again?\n"); 
       Keyinput.printPrompt("1. Yes\n"); 
       repeat = Keyinput.inInt("0. No\n");
    } 
    while(repeat == 1);
        
        
        
    } 

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void checkAnswer() 
    { 
   
    }
}
