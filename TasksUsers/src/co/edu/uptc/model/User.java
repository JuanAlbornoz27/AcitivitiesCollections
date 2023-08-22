package co.edu.uptc.model;

import java.util.Iterator;
import java.util.LinkedList;

public class User {
	private String name;
	private LinkedList <Task> tasks;
 
	public User(String name) {
		tasks= new LinkedList<Task>();
		this.name = name;
	}
	public void addTask(Task task) {
		tasks.add(task);
	}
	public void removeTask(Task task) {
		tasks.remove(task);
	}
	public String showTasks() {
		String allTask=""; 
		for (Task task : tasks) {
			allTask+= task.toString();

		}
		return allTask;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LinkedList<Task> getTasks() {
		return tasks;
	}
	public void setTasks(LinkedList<Task> tasks) {
		this.tasks = tasks;
	}
	@Override
	public String toString() {
		return "ª Nombre del usuario: " + name + "\n" + " Tareas: " + tasks + "\n";
	}
	
}
