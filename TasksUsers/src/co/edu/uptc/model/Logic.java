package co.edu.uptc.model;

import java.util.LinkedList;

public class Logic {
	private LinkedList<User> users;
	private LinkedList<Task> taskForAsign;
	public Logic() {
		users= new LinkedList<>();
		taskForAsign= new LinkedList<Task>();
		addTaskAsign();
	}
	private void addTaskAsign() {
		taskForAsign.add(new Task(1, "Estender la ropa", "20 Agosto"));
		taskForAsign.add(new Task(2, "Doblar ropa", "22 Agosto"));
		taskForAsign.add(new Task(3, "Cambiar tendidos", "28 Agosto"));

		
	}
	private void addUser(User user) {
		users.add(user);
	}
	public void addTask(String name,Task task) {
		boolean flag= true;
		for (User user1 : users) {
			if( user1.getName().equalsIgnoreCase(name)) {
				user1.addTask(task);
				flag=false;
			}
			else if(!(user1.getName().equals(name))){
				flag= true;
			}
		}
		if(flag) {
			User user= new User(name);
			user.addTask(task);
			this.addUser(user);
		}
	}
	public void AsignTaks(String name,int id){
		boolean flag= false;
		Task task= null;
		for (Task task1 : taskForAsign) {
			if(task1.getId()==(id)) {
				flag=true;
				addTask(name, task1);
				task= task1;
				}	
		}
		if (flag) {
			taskForAsign.remove(task);
		}
	}
	public String showTasksForAsign() {
		String output="";
		for (Task task: taskForAsign) {
				output+= task.toString();
			}
		return output;

		}
	
	public String showTasks(String name) {
		String output="";
		for (User user : users) {
			if(user.getName().equalsIgnoreCase(name)) {
				output+= user.getTasks();
			}
		}
		return output;
	}
	public String showUsers() {
		String output="";
		for (User user : users) {
			output+=user.toString();
		}
		return output;
	}

	public LinkedList<User> getUsers() {
		return users;
	}

	public void setUsers(LinkedList<User> users) {
		this.users = users;
	}
	
		
	}
	

