package test_algoritmica.ejercicio2;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		PersonaDB control = new PersonaDB();
		control.leerPersonas();
		System.out.println("Lista de personas mayores de edad: \r" + control.funcionA());
		System.out.println("Lista de personas menores de edad: \r" + control.funcionB());
		System.out.println("Lista de personas personas masculinas mayores de edad: \r" + control.funcionC());
		System.out.println("Lista de personas femeninas menores de edad: \r" + control.funcionD());
		System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: \r" + (control.funcionE()*100)+"%");
		System.out.println("Porcentaje que representan las mujeres respecto al total de personas: \r" + (control.funcionF()*100) + "%");
}
}

