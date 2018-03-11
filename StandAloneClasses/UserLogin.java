//Get user login and paswword
import javax.swing.JOptionPane;

public class UserLogin
{

	public static void main(String[] args)
	{
		//Get user ID and Password
		String login = JOptionPane.showInputDialog(null, "Please enter User id");
		String password = JOptionPane.showInputDialog(null, "Please enter Password");
		
		//Welcome correct credentials
		if (login.equals("admin") && password.equals("open"))
		{
			JOptionPane.showMessageDialog(null, "Welcome");
		}
		//Wrong password
		else if (login.equals("admin") && !password.equals("open"))
		{
			JOptionPane.showMessageDialog(null, "Wrong password");
		}
		//Wrong ID
		else if (!login.equals("admin") && password.equals("open"))
		{
			JOptionPane.showMessageDialog(null, "Wrong user ID");
		}
		//Nothing matches
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, wrong ID and Password");
		}

	}

}
