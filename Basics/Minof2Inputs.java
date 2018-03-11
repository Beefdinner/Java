import java.util.Scanner;

public class Minof2Inputs
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter first value >");
		double num1 = input.nextDouble();
		
		System.out.print("\nPlease enter first value >");
		double num2 = input.nextDouble();
		
		System.out.println("The min number is: " + Math.min(num1,num2));
		
	}

}
