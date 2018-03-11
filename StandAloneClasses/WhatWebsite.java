// Output name of website from a URL
//Jonathan Turner

import javax.swing.JOptionPane;

public class WhatWebsite
{

	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog(null, 
				"Enter website url using www.website.com format");
		
		JOptionPane.showMessageDialog(null, input.substring(input.indexOf("www.") + 4,
				(input.indexOf(".com"))));
	}

}
