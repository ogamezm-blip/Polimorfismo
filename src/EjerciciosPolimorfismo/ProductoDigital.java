package EjerciciosPolimorfismo;

public class ProductoDigital extends Producto{
	@Override
	public void mostrarDescripcion(String nombre, double precio) {
		System.out.println("Producto Digital: " + nombre + "\nPrecio: Q." + precio);
	}
}
