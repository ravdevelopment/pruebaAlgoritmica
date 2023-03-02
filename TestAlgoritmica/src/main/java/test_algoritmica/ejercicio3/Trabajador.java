package test_algoritmica.ejercicio3;

public class Trabajador {

	private int horasTrabajadas;
	private double tarifa;
	private double salario;
	
	public Trabajador() {
		
	}
	
	public Trabajador(int horasTrabajadas, double tarifa, double salario) {
		super();
		this.horasTrabajadas = horasTrabajadas;
		this.tarifa = tarifa;
		this.salario = salario;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public double getTarifa() {
		return tarifa;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void leerHorasTrabajadas(int h) {
		this.horasTrabajadas = h;
	}

	public void leerTarifa(double t) {
		this.tarifa = t;
	}
	
	public void calcularSueldo() {
		if(this.getHorasTrabajadas()>40) {
			int horasExtra = this.getHorasTrabajadas()-40;
			double extra = horasExtra*(this.tarifa*0.5 );
			this.salario = (horasTrabajadas * this.tarifa) + extra;
		}
		else {
			this.salario = (horasTrabajadas * this.tarifa);
		}
	}

	@Override
	public String toString() {
		return "Trabajador [Horas Trabajadas = " + horasTrabajadas + ", Tarifa = " + tarifa + "€ por hora, Salario semanal = " + salario + "€]";
	}

	
}
