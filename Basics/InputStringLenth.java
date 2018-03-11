import javax.swing.JOptionPane;

public class InputStringLenth
{

	public static void main(String[] args)
	{
		//get input from user from user
		String input = JOptionPane.showInputDialog(null, 
				"Input String");
		//output length
		JOptionPane.showMessageDialog(null, "Your string has "  + input.length() + " charactors");

	}

}
