
public class Math {
	
	public static void main(String [] args)
	
	{
		// calculate the cost of lunch
		double salad = 5.95;
		double water = .89;
		
		System.out.println("The cost of lunch is $" + (salad + water));
		
		// calculate your age as of a certain year
		
		int targetYear = 2011;
		int birthYear = 1986;
		
		System.out.println("Your age in " + targetYear + " is " + (targetYear - birthYear));
		
		//calculate the total calories of apples
		
		int caloriesPerApple = 127;
		int numberOfApples = 3;
		
		System.out.println("The calories in " + numberOfApples + "is" + (caloriesPerApple * numberOfApples));
		
		//calculate miles per gallon
		
		double miles = 426.8;
		double gallons = 15.2;
		double mileage = miles / gallons;

		System.out.println("The mileage is " + mileage);
		
		//Division and Modulus
		
		final int PENNIES_PER_QUARTER = 25;
		int pennies = 113;
		
		int quarters = pennies / PENNIES_PER_QUARTER;
		System.out.println("There are " + quarters + " quarters in "  + pennies + " pennies");
		
		int penniesLeftOver = pennies % PENNIES_PER_QUARTER;
		System.out.println("There are " + penniesLeftOver + " pennies left over.");
		
		final double MONTHS_PER_YEAR = 12;
		double annualSalary = 50000.00;
		
		double monthlySalary = annualSalary / MONTHS_PER_YEAR;
		System.out.println("The monthly salary is " + monthlySalary);
		
		
		
	}

}
