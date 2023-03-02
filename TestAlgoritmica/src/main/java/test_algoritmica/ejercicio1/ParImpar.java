package test_algoritmica.ejercicio1;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un número y pulsa enter:");
		int numeroIntroducido = teclado.nextInt();
		if (numeroIntroducido == 0) {
			System.out.println("El número introducido es 0.");
		} else {
			if (numeroIntroducido % 2 == 0) {
				System.out.println("El número introducido es par, lista de los números pares descendientes:");
				numeroIntroducido--;
				while (numeroIntroducido > 0) {
					if (numeroIntroducido % 2 == 0) {
						System.out.println(numeroIntroducido--);
					} else {
						numeroIntroducido--;
					}
				}
			} else {
				System.out.println("El número introducido es impar, lista de los números impares descendientes:");
				while (numeroIntroducido > 0) {
					if (numeroIntroducido % 2 != 0) {
						System.out.println(numeroIntroducido--);
					} else {
						numeroIntroducido--;
					}
				}

			}
		}
		teclado.close();
	}

}
