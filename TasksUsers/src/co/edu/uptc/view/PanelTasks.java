package co.edu.uptc.view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.model.Task;
import co.edu.uptc.model.User;



public class PanelTasks extends JPanel{
//	private ArrayList<PanelTask> users;
	private PanelTask taskPanel;
	private JButton addDialog;
	public PanelTasks(ActionListener listener) {
//		users = new ArrayList<PanelTask>();
		initComponents(listener);

 
	} 

	private void initComponents(ActionListener listener) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(getBackground());
		setVisible(true);
		addDialog = new JButton("Agregar Tarea");
		addDialog.addActionListener(listener);
		addDialog.setActionCommand("addDialog");
		add(addDialog);
		
	}

	public void setArray(LinkedList<User> users) {
		for (User user : users) {
//			this.users.add(fillTasksPanel(user)); 
			add(fillTasksPanel(user));
		}
	}

	private PanelTask fillTasksPanel(User user) {
		taskPanel= new PanelTask();
		taskPanel.setId(user.getName());
		taskPanel.setTask(user.showTasks());
		return taskPanel;
	}
	

}

