package EjerciciosPolimorfismo;

public class CuentaAhorro extends Cuenta {

    @Override
    public void depositar(double monto) {
        double interes = monto * 0.05; // Interes
        saldo += (monto + interes);
        System.out.println("Cuenta Ahorro: Se depositó Q" + monto + " más Q" + interes + " de interés.");
    }
}
