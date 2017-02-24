package regex.view;

import javax.swing.JFrame;
import regex.controller.RegexController;
import java.awt.Dimension;

public class RegexFrame extends JFrame 
{
	RegexController baseController;
	RegexPanel appPanel;
	
	
	
	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new RegexPanel(baseController);
		
		
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
