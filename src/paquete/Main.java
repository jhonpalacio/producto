package paquete;


public class Main {
    public static void main(String[] args) {
        // Crear una nueva instancia de Producto
        Producto producto = new Producto("Laptop", 1200.0, 10);

        // Imprimir los detalles del producto
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad en Inventario: " + producto.getCantidadInventario());

        // Modificar el nombre, precio y cantidad en inventario del producto
        producto.setNombre("Smartphone");
        producto.setPrecio(800.0);
        producto.setCantidadInventario(20);

        // Imprimir los nuevos detalles del producto
        System.out.println("Nuevo Nombre: " + producto.getNombre());
        System.out.println("Nuevo Precio: " + producto.getPrecio());
        System.out.println("Nueva Cantidad en Inventario: " + producto.getCantidadInventario());
    }
}
