public class MainInventarioProductos {
    public static void main(String[] args) {
        InventarioProductos.Producto producto1 = new InventarioProductos.Producto();
        InventarioProductos.Producto producto2 = new InventarioProductos.Producto();

        producto1.nombre = "Laptop";
        producto1.precio = 1200.0;
        producto1.cantidad = 10;

        producto2.nombre = "Smartphone";
        producto2.precio = 800.0;
        producto2.cantidad = 20;

        System.out.println("Información del Producto 1:");
        producto1.mostrarInformacion();

        System.out.println("\nInformación del Producto 2:");
        producto2.mostrarInformacion();
    }
}
