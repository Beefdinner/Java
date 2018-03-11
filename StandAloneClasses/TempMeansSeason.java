//Get temp from user and give a probable season
// Jonathan Turner

import java.util.Scanner;

public class TempMeansSeason
{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		//Get inputs from user
		System.out.println("Please enter the Temp as a whole number >");
		int temp = input.nextInt();
		
		//Test for valid range
		if(temp>110 || temp < -5)
		{
			System.out.println("Temperature is outside the valid range");
		}
		//Test for Summer
		else if(temp >= 90)
		{
			System.out.println("It is probably Summer!");
		}
		//Test for Spring
		else if (temp >= 70)
		{
			System.out.println("it is probably Spring!");
		}
		//Test for Fall
		else if (temp >= 50)
		{
			System.out.println("It is probably Fall!");
		}
		//Test for Winter :(
		else if (temp < 50)
		{
			System.out.println("It is probably Winter");
		}
	}

}
