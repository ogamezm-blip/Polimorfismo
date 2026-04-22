package EjerciciosPolimorfismo;

public class Estudiante extends Persona{
	
	@Override
	public void presentarse(String carnet, String carrera) {
		System.out.println("Carnet: " + carnet + "\nCarrera: " + carrera);
	}

}
