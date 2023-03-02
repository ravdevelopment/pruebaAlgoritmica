package test_algoritmica.ejercicio2;

import java.util.ArrayList;
import java.util.Random;

public class PersonaDB {
	ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

	public void leerPersonas() {
		String[] genero = { "Hombre", "Mujer" };
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			listaPersonas.add(new Persona(r.nextInt(100) + 1, genero[r.nextInt(genero.length)]));
		}
	}

	public ArrayList<Persona> funcionA() {
		ArrayList<Persona> temp = new ArrayList<Persona>();
		for (Persona persona : listaPersonas) {
			if (persona.getEdad() >= 18) {
				temp.add(persona);
			}
		}
		return temp;
	}

	public ArrayList<Persona> funcionB() {
		ArrayList<Persona> temp = new ArrayList<Persona>();
		for (Persona persona : listaPersonas) {
			if (persona.getEdad() < 18) {
				temp.add(persona);
			}
		}
		return temp;
	}

	public ArrayList<Persona> funcionC() {
		ArrayList<Persona> temp = new ArrayList<Persona>();
		for (Persona persona : listaPersonas) {
			if (persona.getEdad() >= 18 && persona.getSexo().equals("Hombre")) {
				temp.add(persona);
			}
		}
		return temp;
	}

	public ArrayList<Persona> funcionD() {
		ArrayList<Persona> temp = new ArrayList<Persona>();
		for (Persona persona : listaPersonas) {
			if (persona.getEdad() < 18 && persona.getSexo().equals("Mujer")) {
				temp.add(persona);
			}
		}
		return temp;
	}

	public Double funcionE() {
		Double cantidad = 0.0;
		for (Persona persona : listaPersonas) {
			if (persona.getEdad() > 18) {
				cantidad++;
			}
		}
		Double porcentaje = cantidad / 50;

		return porcentaje;
	}

	public Double funcionF() {
		Double cantidad = 0.0;
		for (Persona persona : listaPersonas) {
			if (persona.getSexo().equals("Mujer")) {
				cantidad++;
			}
		}
		Double porcentaje = cantidad / 50;

		return porcentaje;
	}


	
}