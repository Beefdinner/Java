//Write a program that says hello based on int input from user
//Jonathan Turner
import java.util.Scanner;

public class SayHello_i_times
{

	public static void main(String[] args)
	{
		int inputValue = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a value: ");  //Prompt for value		
		
		while (!input.hasNextInt()) //verify value is an integer
		{	
			String nope = input.next();
			System.out.print("Please enter a value in integer format: ");
		}
		inputValue = input.nextInt();//store int value
		for(int i = 1; i <= inputValue; i++) //print hello world "inputValue" times
		{
			System.out.println("Hello World");	
		}
		input.close(); 
	}

}
