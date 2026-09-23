public class Cuenta {
  
  //Atributos
  private int cedula;
  private String nombre;
  private String numeroCuenta;
  private String tipoCuenta;
  private double saldo;
  
  //El constructor de la clase permite inicializar la clase
  //El constructor de la clase se reconoce porque tiene el mismo nombre de la clase
  public Cuenta(int cedula, String nombre, String numeroCuenta, String tipoCuenta, double saldo){
    this.cedula = cedula;
    this.nombre= nombre;
    this.numeroCuenta = numeroCuenta;
    this.tipoCuenta = tipoCuenta;
    this.saldo = saldo;
  }
  
  public String toString(){
    return "Cuenta [ cedula:" + cedula + " nombre: " + nombre + " numerocuenta: " + numeroCuenta + 
                     " tipoCuenta: " + tipoCuenta + " saldo: " + saldo + "]";
  }
//Creación del método recargar
  public void recargarCuenta(double cantidad){
    saldo += cantidad;
  }

  public void retirarCuenta(double cantidad){
    saldo -= cantidad;
  }
  //retirar
  public boolean retirarCuentaSegura(double cantidad){
    if (cantidad <= 0) {
      System.out.println("La cantidad a retirar debe ser mayor que cero.");
      return false;
    }
    if (cantidad > saldo) {
      System.out.println("Saldo insuficiente para realizar el retiro, saldo actual: " + saldo);
      return false;
    }
    saldo -= cantidad;
    return true;
  }
}