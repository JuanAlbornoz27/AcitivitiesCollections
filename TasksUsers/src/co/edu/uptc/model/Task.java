package co.edu.uptc.model;

public class Task {
	private int id;
	private String description;
	private String dateExpiration;
	public Task(int id,String description, String dateExpiration) {
		this.description = description;
		this.dateExpiration = dateExpiration;
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Id: "+id+"\n  Descripcion:" + description + "  Fecha de vencimiento:" + dateExpiration +"\n";
	}
	
	
	
}
