package co.edu.uptc.view;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelTask extends JPanel{
	private JLabel userName;
	private JLabel lblTask;
	private JLabel spaceName;
	private JLabel spaceTask;
	public PanelTask() {
		initComponentes();
	}
	private void initComponentes() { 
		setLayout(new FlowLayout());
		setSize(getWidth(), 200);
		userName = new JLabel("Nombre");
		add(userName);
		spaceName= new JLabel();
		add(spaceName);
		lblTask = new JLabel("Tareas:");
		add(lblTask);
		spaceTask = new JLabel();
		add(spaceTask); 
		
		
	}
	public void setId(String name) {
		spaceName.setText(name);
	}
	public void setTask(String task) {
		spaceTask.setText(task);
	}
	
}

