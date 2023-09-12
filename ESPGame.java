/* 

 * Class: CMSC203  

 * Instructor: Professor Monshi

 * Description: (This code allows the user to input their name, mc number, and their description.
After that the user plays the color guessing game. It tell the user if the color they input matches the randomly generated one.) 

 * Due: 09/10/2023

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming assignment  

* independently. I have not copied the code from a student or   * any source. I have not given my code to any student. 

 * Print your Name here: Iban Vasquez 

*/ 
import java.util.Random;
import java.util.Scanner;

public class ESPGame {

	public static void main(String[] args)
	{
		String name, description, dueDate, userGuess;
		
		int round = 1, correct = 0, random;
		final String COLOR_RED = "Red", COLOR_GREEN = "Green", COLOR_BLUE = "Blue", COLOR_ORANGE = "Orange", COLOR_YELLOW = "Yellow";
		int mcNumber;
		
		Scanner input = new Scanner (System.in);
		
		Random rand = new Random();
		
		System.out.print("Enter your name: ");
		
		name = input.nextLine();
		
		System.out.print("Enter your McNumber: M");
		
		mcNumber = input.nextInt();
		input.nextLine();
		
		System.out.print("Describe yourself: ");
		
		description = input.nextLine();
		
		System.out.print("Due Date: ");
		
		dueDate = input.nextLine();
		
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		
		while (round < 12)
		{
			boolean flag = false;
			System.out.println("Round " + round + "\n");
			System.out.println("I am thinking of a color.\n" + 
			"Is it Red, Green, Blue, Orange, or Yellow?" +
			"\nEnter your guess:");
			random = rand.nextInt(1, 6);
			
			while (flag == false)
			{
				flag = true;
				userGuess = input.nextLine();
				if(userGuess.equalsIgnoreCase(COLOR_RED))
				{
					if(random == 1)
					{
						correct++;
					}
				}
				else if(userGuess.equalsIgnoreCase(COLOR_GREEN))
				{
					if(random == 2)
					{
						correct++;
					}
				}
				else if(userGuess.equalsIgnoreCase(COLOR_BLUE))
				{
					if(random == 3)
					{
						correct++;
					}
				}
				else if(userGuess.equalsIgnoreCase(COLOR_ORANGE))
				{
					if(random == 4)
					{
						correct++;
					}
				}
				else if(userGuess.equalsIgnoreCase(COLOR_YELLOW))
				{
					if(random == 5)
					{
						correct++;
					}
				}
				else 
				{
					System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?" + 
				"\nEnter you guess again: ");
					flag = false;
				}
				
				
			}
			
			if(random == 1)
			{
				System.out.println("I was thinking of Red");
			}
			else if(random == 2)
			{
				System.out.println("I was thinking of Green");
			}
			else if(random == 3)
			{
				System.out.println("I was thinking of Blue");
			}
			else if(random == 4)
			{
				System.out.println("I was thinking of Orange");
			}
			else if(random == 5)
			{
				System.out.println("I was thinking of Yellow");
			}
			round++;
		}
		System.out.println("Game Over\n" +
		"\nYou guessed " + correct + " out of 11 colors correctly\n" + 
		"User Name: " + name +
		"\nMc Number: M" + mcNumber + 
		"\nUser Description: " + description + 
		"\nDue Date: " + dueDate);
		
		input.close();		
		
	}
}
