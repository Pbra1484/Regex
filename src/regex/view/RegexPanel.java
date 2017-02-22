package regex.view;

import javax.swing.*;
import java.awt.*;
import regex.controller.RegexController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegexPanel extends JPanel 
{
	private JTextField fName;
	private JTextField lName;
	private JTextField pNumber;
	private JTextField eMail;
	private JLabel fNameL;
	private JLabel lNameL;
	private JLabel pNumberL;
	private JLabel eMailL;
	private JButton inputButton;
	private RegexController baseController;
	private SpringLayout baseLayout;
	
	
	
	
	RegexPanel(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fName = new JTextField(30);
		lName = new JTextField(40);
		pNumber = new JTextField(10);
		eMail = new JTextField(20);
		fNameL = new JLabel("First Name");
		lNameL = new JLabel("Last Name");
		pNumberL = new JLabel("Phone Number");
		eMailL = new JLabel("eMail");
		inputButton = new JButton("input");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(fName);
		this.add(lName);
		this.add(pNumber);
		this.add(eMail);
		this.add(fNameL);
		this.add(lNameL);
		this.add(pNumberL);
		this.add(eMailL);
		this.add(inputButton);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
		inputButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}
}
