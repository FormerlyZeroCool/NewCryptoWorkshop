package Section1Lesson;

import java.util.Scanner;

public class Section1LessonMain {

	public static void main(String[] args) 
	{
	    char input = '\0';

	    System.out.println("Enter a single character followed by the enter/return key: ");


	    Scanner k =new Scanner(System.in);
	    // First we need to get the user's input and save it in the variable "input"
	    // I'll let you guys figure that one out

	    input = k.nextLine().charAt(0);
	    
	    
	    if(/*check if its uppercase*/)
	    {
	    	//Only print this if the letter entered is uppercase
	    	System.out.println("You entered the uppercase letter: " + input);
	    }

	    //else if(/*check if its lowercase*/)
	    {
	    	//Only print this if the letter entered is lowercase
	    	System.out.println("You entered the lowercase letter: " + input);
	    }

	    // if its neither than its not an alphabetical character
	    //else
	    {
	    	//Only print this if the letter entered is non alphabetic
	    	System.out.println("You entered a non-alphabetical character: " + input);
	    }

	    System.out.println("our code didn't take input and our if statements are not working! Lets fix our code!\n"
	    		+ "refer to the comments.");

	}

}
