package EjerciciosPolimorfismo;

public class Cuenta {
    protected double saldo;

    public void depositar(double monto) {
        saldo += monto;
    }
}
