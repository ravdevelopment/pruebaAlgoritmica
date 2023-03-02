package test_algoritmica.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Trabajador trabajador = new Trabajador();
		trabajador.leerHorasTrabajadas(41);
		trabajador.leerTarifa(10);
		trabajador.calcularSueldo();
		System.out.println(trabajador);
		
	}
}
