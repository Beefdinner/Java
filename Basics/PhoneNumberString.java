// Get phone number from user without dashes, output number with dashes. 
// Jonathan Turner 

import javax.swing.JOptionPane;

public class PhoneNumberString
{

	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog(
				null, "Please enter phone number without dashes");
		
		JOptionPane.showMessageDialog(null, input + 
				" is " + input.substring(0,3)+ "-" + 
				input.substring(3, 6) + "-" + input.substring(6));
	
	}

}
