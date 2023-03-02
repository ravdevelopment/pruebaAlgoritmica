package test_algoritmica.ejercicio2;

public class Persona {

	public int edad;
	public String sexo;
	
	public Persona(int edad, String sexo) { 
		this.edad = edad;
		this.sexo = sexo;
	}
	
	

	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	@Override
	public String toString() {
		return "[ Edad = " + edad + " ], [ Sexo = " + sexo + " ]\r";
	}
	
	
	
}
