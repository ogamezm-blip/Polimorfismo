package EjerciciosPolimorfismo;

public class Main {

	public static void main(String[] args) {
		
		/*
		 1. Cómo aplicaste herencia: 
		 Utilicé la palabra clave 'extends' en las clases hijas para que heredaran 
		 los atributos y métodos de sus clases padre.
		 
		 2. Qué métodos sobrescribiste: 
		 Los métodos que sobreescribí fueron las de las clases hijas para 
		 agregar más informacion y hacer cambios utiles.
		 
		 3. Casos de prueba utilizados: 
		 En el método main, instancié objetos de las clases hijas, pero 
		 los almacené en variables de referencia de las clases padre. 
		 Al ejecutar los métodos Java decide en tiempo de ejecución llamar al método
		 del objeto real y no al de la referencia.
		 */
		
		// Ejercicio 1
		System.out.println("      Ejercicio 1. Animal y Perro\n");
        Animal perro = new Perro();
        perro.hacerSonido();
        
        // Ejercicio 2
     	System.out.println("\n\n      Ejercicio 2. Figura y Rectangulo\n");
     	Figura figuritaR = new Rectangulo(10, 5);
        System.out.println("Área del Rectángulo: " + figuritaR.area());
     	
        // Ejercicio 3
     	System.out.println("\n\n       Ejercicio 3. Empleado y Vendedor\n");
        Empleado empleado = new Vendedor("Ana", 500);
        empleado.resumen();
        
        // Ejercicio 4
     	System.out.println("\n\n      Ejercicio 4. Cuenta y CuentaAhorro\n");
     	Cuenta deposito = new CuentaAhorro();
        deposito.depositar(200);
     	
        // Ejercicio 5
     	System.out.println("\n\n      Ejercicio 5. Transporte y Avion\n");
     	Transporte t1 = new Avion();
        t1.moverse();
     	
        // Ejercicio 6
     	System.out.println("\n\n      Ejercicio 6. Persona y Estudiante\n");
     	Persona estudiante = new Estudiante();
        estudiante.presentarse("1234", "Ingenieria en Sistemas");
        
        // Ejercicio 7
     	System.out.println("\n\n      Ejercicio 7. Vehiculo y Motocicleta\n");
     	Vehiculo m1 = new Motocicleta();
        m1.encender();
        
        // Ejercicio 8
     	System.out.println("\n\n      Ejercicio 8. Producto y ProductoDigital\n");
     	Producto p1 = new ProductoDigital();
        p1.mostrarDescripcion("Manzana", 5);
        
        // Ejercicio 9
     	System.out.println("\n\n      Ejercicio 9. Instrumento y Guitarra\n");
     	Instrumento g1 = new Guitarra();
        g1.tocar();
        
        // Ejercicio 10
     	System.out.println("\n\n      Ejercicio 10. Trabajador y TrabajadorPorHora\n");
     	Trabajador trabajador1 = new TrabajadorPorHora();
        trabajador1.calcularPago(8, 25);
	}

}
