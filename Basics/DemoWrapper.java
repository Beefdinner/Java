//Play with the demo of wrappers
public class DemoWrapper
{

	public static void main(String[] args)
	{
		int intPrimitive = 42;
		Integer integerObject = intPrimitive;

		System.out.println("The int is " + intPrimitive);
		System.out.println("The integer object is " + integerObject);
		
		int sum = intPrimitive + integerObject;
		System.out.println("The Sum is " + sum);
		
		int i1 = Integer.parseInt("76"); //remember the rules "" means a string
		Integer i2 = Integer.valueOf("76");
		
		System.out.println("The value of i1 is " + i1);
		System.out.println("The value of i2 is " + i2);
		
		
		
	}

}
