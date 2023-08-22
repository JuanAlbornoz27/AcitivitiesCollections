package co.edu.uptc.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelFillTask extends JDialog{
	private JLabel lblTask;
	private JLabel time;
	private JLabel name;
	private JTextField spaceTask;
	private JTextField spaceHours; 
	private JTextField spaceName;
	private JButton btnAdd; 
	public PanelFillTask(ActionListener listener) {
		setLocationRelativeTo(this);
		initComponents(listener);
	}
	private void initComponents(ActionListener listener) {
		setLayout(new GridBagLayout());
		setBackground(new Color(47,169,174,255));
		setSize(700,300);
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(20, 20, 10,20);
		gbc.gridx=0;
		gbc.gridy=0;
		lblTask = new JLabel("Ingresa Tu Tarea: ");
		add( lblTask,gbc);
		gbc.gridx=0;
		gbc.gridy=1;
		spaceTask = new JTextField(10);
		add( spaceTask,gbc);
		gbc.gridx=1;
		gbc.gridy=0; 
		time = new JLabel("Ingresa la fecha de expiracion: ");
		add( time,gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		spaceHours = new JTextField(10);
		add( spaceHours,gbc);
		gbc.gridx=2;
		gbc.gridy=0;
		name= new JLabel("Ingresa nombre del Usuario:");
		add(name,gbc);
		gbc.gridx=2;
		gbc.gridy=1;
		spaceName = new JTextField(12);
		add(spaceName,gbc);
		gbc.gridx=1;
		gbc.gridy=2;
		btnAdd= new JButton("Agregar Tarea");
		btnAdd.setActionCommand("add");
		btnAdd.addActionListener(listener);
		add(btnAdd,gbc);
	}
	public void changeVisibleInfoUser() {
		setVisible(true);
	}
	public String getTask() {
		return spaceTask.getText();
	}	
	public String getHours() {
		return spaceHours.getText();
	}	
	public String getName() {
		return spaceName.getText();
	}
	
	}
