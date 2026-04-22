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
     	
     	
	}

}
