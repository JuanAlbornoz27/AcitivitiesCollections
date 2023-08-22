package co.edu.uptc.presenter;

import co.edu.uptc.model.Patient;
import co.edu.uptc.model.Sheduler;
import co.edu.uptc.view.IoManager;

public class Presenter {
	IoManager io;
	Sheduler sheduler;
	public Presenter() {
		init();
	}
	private void init() {
		sheduler= new Sheduler();
		io = new IoManager();
		boolean salir=false;
		while (!salir) {
		try {
			switch (io.readMenu()) {
			case 1:
				this.showPatients();
				break;
			case 2:
				this.addPatients();
				break;
			case 3:
				this.attendPatient();
				break;
			case 4:
				io.showGraphicMessage("----Has salido del menu----");
				salir = true;
				break;	
						
			default:
				io.showGraphicErrorMessage("Ingrese Un Numero de la lista!!!");
				break;
			}
		}catch(NumberFormatException e) {
			io.showGraphicErrorMessage("Debe Ingresar un numero entero");
		}
	}
	}
	public void showPatients() {
		io.showGraphicMessage(sheduler.showPatients());
	}
	public void addPatients() {
		sheduler.addPacient(new Patient(io.readGraphicString("Ingrese el nombre del paciente: "),io.readGraphicInt("Ingrese el nivel de proridad: ")));
	}
	public void attendPatient() {
		sheduler.attendPatient();
	}
	public static void main(String[] args) {
		new Presenter();
	}
}