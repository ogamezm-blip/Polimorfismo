package EjerciciosPolimorfismo;

public class TrabajadorPorHora extends Trabajador{
	@Override
	public void calcularPago(double horasTrabajadas, double pagoPorHora) {
		System.out.println("Horas Trabajadas: " + horasTrabajadas + "\nPaga por hora: " + pagoPorHora);
		System.out.println("Pago total: " + horasTrabajadas * pagoPorHora);
	}
}
