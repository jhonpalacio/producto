package paquete;


public class Producto {
    private String nombre;
    private double precio;
    private int cantidadInventario;

    public Producto(String nombre, double precio, int cantidadInventario) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        if (cantidadInventario >= 0) {
            this.cantidadInventario = cantidadInventario;
        } else {
            System.out.println("La cantidad en inventario no puede ser un valor negativo.");
        }
    }
}

