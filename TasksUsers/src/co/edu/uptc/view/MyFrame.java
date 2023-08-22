package co.edu.uptc.view;

import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JFrame;

import co.edu.uptc.model.User;

public class MyFrame extends JFrame {
	PanelFillTask infoTask;
	PanelTasks tasks;
	
	public MyFrame(ActionListener listener) {
		infoTask = new PanelFillTask(listener);
		tasks= new PanelTasks(listener);
		add(tasks); 
		initComponents(listener); 

	}
	private void initComponents(ActionListener listener) {
		setSize(700, 600);
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void closeDialogBtn() {
		infoTask.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void changeVisibleInfo() {
		infoTask.setLocationRelativeTo(this);
		infoTask.changeVisibleInfoUser();
	}

	public String getDescription() {
		return infoTask.getTask();
	}
	public String getHours() {
		return infoTask.getHours();
	}	
	public String getName() {
		return infoTask.getName();
	}
	public void setArrayTasks(LinkedList<User>users) {
		tasks.setArray(users);
	}
	}
