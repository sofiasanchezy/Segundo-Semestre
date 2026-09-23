public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.saldo = 1500.50;
        cuenta.titular = "Ana Lopez";
        cuenta.numeroCuenta = 123456;
        cuenta.tipoCuenta = "Ahorros";
        cuenta.clave = 2024;
        cuenta.mostrarInformacion();
    }
}

class CuentaBancaria {
    double saldo;
    String titular;
    int numeroCuenta;
    String tipoCuenta;
    int clave;

    public void mostrarInformacion() {
        System.out.println("Saldo:" + saldo);
        System.out.println("Titular:" + titular);
        System.out.println("Numero de Cuenta:" + numeroCuenta);
        System.out.println("Tipo de Cuenta:" + tipoCuenta);
        System.out.println("Clave:" + clave);
    }
}