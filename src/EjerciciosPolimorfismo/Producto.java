package EjerciciosPolimorfismo;

public class Producto {
	protected String nombre;
	protected double precio;
	
	public void mostrarDescripcion(String nombre, double precio) {
		System.out.println("Producto: " + nombre + " Q." + precio);
	}
}
