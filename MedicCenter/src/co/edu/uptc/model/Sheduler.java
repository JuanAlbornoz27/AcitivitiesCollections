package co.edu.uptc.model;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Sheduler {
	private Comparator<Patient> comparator;
	private PriorityQueue<Patient> patients;

	public Sheduler() {
		comparator = new pacientComparator();
		patients = new PriorityQueue<Patient>(comparator);
	}

	public void addPacient(Patient pacient) {
		patients.add(pacient);
	}

	public void attendPatient() {
		patients.poll();
	}
	public String showPatients() {
		String patientsFinal="";
		for (Patient patient : patients) {
			patientsFinal+= patient.toString();
		}
		return"Lista De Pacientes: \n"+patientsFinal;
	}

	private class pacientComparator implements Comparator<Patient> {
		@Override
		public int compare(Patient t1, Patient t2) {
			return t1.getLevelPriority() - t2.getLevelPriority();
		}
	}

	public Comparator<Patient> getComparator() {
		return comparator;
	}

	public void setComparator(Comparator<Patient> comparator) {
		this.comparator = comparator;
	}

	public PriorityQueue<Patient> getPatients() {
		return patients;
	}

	public void setPatients(PriorityQueue<Patient> patients) {
		this.patients = patients;
	}

}
