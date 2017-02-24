package regex.controller;

import regex.view.RegexFrame;
import java.awt.Color;


public class RegexController 
{
	private RegexFrame appFrame;
	
	public RegexController()
	{
		this.appFrame = new RegexFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public Color testFName(String name)
	{
		if(name.matches(".*[a-zA-Z-]") && name.length() > 1 && name.length() < 31)
		{
			return Color.GREEN;
		}
		else
		{
			return Color.RED;
		}
	}
	
	public Color testLName(String name)
	{
		if(name.matches(".*[a-zA-Z-]") && name.length() > 1 && name.length() < 41)
		{
			return Color.GREEN;
		}
		else
		{
			return Color.RED;
		}
	}
	
	public Color testEmail(String email)
	{
		if(email.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$"))
		{
			return Color.GREEN;
		}
		else
		{
			return Color.RED;
		}
	}
	
	public Color testPNumber(String pNumber)
	{
		if(pNumber.matches("^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$"))
		{
			return Color.GREEN;
		}
		else
		{
			return Color.RED;
		}
	}
}
