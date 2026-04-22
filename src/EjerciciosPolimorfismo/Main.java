package EjerciciosPolimorfismo;

public class Main {

	public static void main(String[] args) {
		
		// Ejercicio 1
		System.out.println("      Ejercicio 1. Animal y Perro\n");
        Animal perro = new Perro();
        perro.hacerSonido();
        
        // Ejercicio 2
     	System.out.println("\n      Ejercicio 2. Figura y Rectangulo\n");
     	Figura figuritaR = new Rectangulo(10, 5);
        System.out.println("Área del Rectángulo: " + figuritaR.area());
     	
        // Ejercicio 3
     	System.out.println("\n      Ejercicio 3. Empleado y Vendedor\n");
        Empleado empleado = new Vendedor("Ana", 500);
        empleado.resumen();
        
        // Ejercicio 4
     	System.out.println("\n      Ejercicio 4. Cuenta y CuentaAhorro\n");
     	Cuenta deposito = new CuentaAhorro();
        deposito.depositar(200);
     	
     	
	}

}
