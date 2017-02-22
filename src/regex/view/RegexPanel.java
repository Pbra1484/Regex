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
		lName = new JTextField(30);
		pNumber = new JTextField(10);
		eMail = new JTextField(30);
		fNameL = new JLabel("First Name");
		lNameL = new JLabel("Last Name");
		pNumberL = new JLabel("Phone Number");
		eMailL = new JLabel("EmAiL");
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
		baseLayout.putConstraint(SpringLayout.WEST, fName, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, lName, 0, SpringLayout.WEST, fName);
		baseLayout.putConstraint(SpringLayout.WEST, pNumber, 0, SpringLayout.WEST, fName);
		baseLayout.putConstraint(SpringLayout.WEST, eMail, 0, SpringLayout.WEST, fName);
		baseLayout.putConstraint(SpringLayout.WEST, fNameL, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fName, 6, SpringLayout.SOUTH, fNameL);
		baseLayout.putConstraint(SpringLayout.NORTH, fNameL, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, lName, 6, SpringLayout.SOUTH, lNameL);
		baseLayout.putConstraint(SpringLayout.NORTH, lNameL, 6, SpringLayout.SOUTH, fName);
		baseLayout.putConstraint(SpringLayout.WEST, lNameL, 0, SpringLayout.WEST, fName);
		baseLayout.putConstraint(SpringLayout.NORTH, pNumber, 6, SpringLayout.SOUTH, pNumberL);
		baseLayout.putConstraint(SpringLayout.NORTH, pNumberL, 6, SpringLayout.SOUTH, eMail);
		baseLayout.putConstraint(SpringLayout.WEST, pNumberL, 0, SpringLayout.WEST, fName);
		baseLayout.putConstraint(SpringLayout.NORTH, eMail, 6, SpringLayout.SOUTH, eMailL);
		baseLayout.putConstraint(SpringLayout.NORTH, eMailL, 6, SpringLayout.SOUTH, lName);
		baseLayout.putConstraint(SpringLayout.WEST, eMailL, 0, SpringLayout.WEST, fName);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, inputButton, -10, SpringLayout.EAST, this);
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
