// Get input from keyboard and output factorial
// Jonathan Turner

import java.util.Scanner;

public class FactorialInputs
{

	public static void main(String[] args)
	{
		int total = 1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter whole number value: " );//get input from keyboard
		while(!input.hasNextInt()) //Reprompt if needed
		{
			String nope = input.next();
			System.out.print("[ " + nope + " ] Is not a valid whole number! \nPlease enter a whole number: " );
		}
		
		int inputValue = input.nextInt(); //keep value
		
		for(int i = 0; i < inputValue; i++) // do the math
		{
			total = total * (inputValue - i);
		}
		System.out.print("The factorial of " + inputValue + " is " + total); //output the factorial
		
		input.close();
		
	}
	
}
