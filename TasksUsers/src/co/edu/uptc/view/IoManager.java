package co.edu.uptc.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IoManager {
	
	private Scanner scanner;
	
	public IoManager() {
		
		this.scanner = new Scanner (System.in);
	}

	//************* POP_UP WINDOW DATA ENTRY********************************

	//---TEXT DATA

	//get text information (char) for keyboard
	public char readGraphicChar(String menssage) {
		this.showMessage(menssage);
		return JOptionPane.showInputDialog(null, menssage).charAt(0);
	}

	//get text information (String) for keyboard
	public String readGraphicString(String menssage) {
		this.showMessage(menssage);
		return JOptionPane.showInputDialog(null, menssage);
	}

	//----NUMERICAL DATA

	public short readGraphicShort(String message) {
		this.showMessage(message);
		return Short.parseShort(JOptionPane.showInputDialog(null, message));
	}

	public int readGraphicInt(String message) {
		this.showMessage(message);
		return Integer.parseInt(JOptionPane.showInputDialog(null, message));
	}

	public long readGraphicLong(String message) {
		this.showMessage(message);
		return Long.parseLong(JOptionPane.showInputDialog(null, message));
	}

	public double readGraphicDouble(String message) {
		this.showMessage(message);
		return Double.parseDouble(JOptionPane.showInputDialog(null, message));
	}
	public float readGraphicFloat(String message) {
		this.showMessage(message);
		return Float.parseFloat(JOptionPane.showInputDialog(null, message));
	}
	// ----- BOOLEAN DATA
	public boolean readGraphicBoolean(String message) {
		this.showMessage(message);
		return Boolean.parseBoolean(JOptionPane.showInputDialog(null, message));
	}

	//************* DISPLAY DATA BY pop-up window********************************


	public void showGraphicMessage (String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public void showGraphicErrorMessage(String message) {
		JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
	}
	public void showGraphicArrayString(String[] message) {
		String show="";
		for (int i=0; i<message.length;i++)
			show+=message[i]+"\n";
		JOptionPane.showMessageDialog(null, show);
	}
	public void showGraphicArrayStringInLine(String[] message) {
		String show="";
		for (int i=0; i<message.length;i++)
			show+=message[i]+"/";
		JOptionPane.showMessageDialog(null, show);
	}

	//----NUMERICAL DATA

	public void showGraphicArrayaShortInLine(short[] shor) {
		String show="";
		for(int i=0;i<shor.length;i++) {
			show+=shor[i]+"/";
		}
		JOptionPane.showMessageDialog(null, show);
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}

	public int readInt(String message) {
		this.showMessage(message);
		return scanner.nextInt();
	}
	
	public short readShort(String message) {
		this.showMessage(message);
		return scanner.nextShort();
	}
	
	public String readString(String message) {
		this.showMessage(message);
		return scanner.next();
	}
	
	
	public double readDouble(String message) {
		this.showMessage(message);
		return scanner.nextDouble();
	}
	int opcion;
	public int readMenu() {
		 
		String menuText=
				"-------Menu-------" + "\n" 
						+ "1. Agregar Tarea" + "\n" 
						+ "2. Ver tareas libres" + "\n"
						+ "3. Asignar tareas" + "\n"
						+ "4. Ver tareas de todos los usuarios" + "\n"
						+ "5. Ver tareas de un usuario" + "\n"
						+ "6. Salir"+ "\n"
						+"Ingrese Una de las opciones: ";
		return readGraphicInt(menuText);
	}
	
	

	
	
	
	
	
}
