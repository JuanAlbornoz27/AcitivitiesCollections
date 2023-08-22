package co.edu.uptc.model;

public class Patient {
	private String name;
	private int levelPriority;
	public Patient(String name, int levelPriority) {
		this.name = name;
		this.levelPriority = levelPriority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevelPriority() {
		return levelPriority;
	}
	public void setLevelPriority(int levelPriority) {
		this.levelPriority = levelPriority;
	}
	@Override
	public String toString() {
		return " \n º Nombre Del Paciente: " + name + " \n Nivel de Prioridad: " + levelPriority ;
	}
	
}
