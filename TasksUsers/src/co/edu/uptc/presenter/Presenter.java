package co.edu.uptc.presenter;



import co.edu.uptc.model.Logic;
import co.edu.uptc.model.Task;
import co.edu.uptc.model.User;
import co.edu.uptc.view.IoManager;

class Presenter {
	IoManager io;
	Logic logic;

	public Presenter() {
		init();
	}

	private void init() {
		logic = new Logic();
		io = new IoManager();
		boolean salir = false;
		while (!salir) {
			try {
				switch (io.readMenu()) {
				case 1:
					this.addTasks();
					break;
				case 2:
					this.showTasksForAsign();
					break;
				case 3:
					this.asignTask();
					break;
				case 4:
					this.showUsers();
					break;
				case 5:
					this.showTasks();
					break;
				case 6:
					io.showGraphicMessage("----Has salido del menu----");
					salir = true;
					break;
				default:
					io.showGraphicErrorMessage("Ingrese Un Numero de la lista!!!");
					break;
				}
			} catch (NumberFormatException e) {
				io.showGraphicErrorMessage("Debe Ingresar un numero entero");
			}
		}
	}

	public void addTasks() {
		logic.addTask(io.readGraphicString("Ingrese el nombre del usuario"), new Task(io.readGraphicInt("Ingrese el id"), io.readGraphicString("Ingrese la descripcion de la tarea"), io.readGraphicString("Ingrese la fecha de vencimiento")));
	}
	public void showTasks() {
		io.showGraphicMessage(logic.showTasks(io.readGraphicString("Ingrese el nombre del usuario")));
	}
	public void asignTask() {
		logic.AsignTaks(io.readGraphicString("Ingrese el nombre del usuario al que le quiere asignar la tarea"), io.readGraphicInt("Ingrese el id de la tarea"));
	}
	
	public void showTasksForAsign() {
		io.showGraphicMessage(logic.showTasksForAsign());
	}
	public void showUsers() {
		io.showGraphicMessage(logic.showUsers());
	}


	public static void main(String[] args) {
		new Presenter();
	}

	
	

}
