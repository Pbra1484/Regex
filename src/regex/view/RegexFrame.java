package regex.view;

import javax.swing.JFrame;
import regex.controller.RegexController;
import java.awt.Dimension;

public class RegexFrame extends JFrame 
{
	RegexController baseController;
	RegexPanel appPanel;
	
	
	
	RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RegexPanel();
		
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Regex");
		this.setSize(500, 500);
		this.setVisible(true);
	}

}
