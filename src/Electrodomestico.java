public class Electrodomestico implements Producto {
    private String nombre;
    private double precio;
    private String codigo;
    private int cantidad;

    private String marca;


    public Electrodomestico(String nombre, double precio, String codigo, String marca, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getcodigo() {
        return codigo;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigo='" + codigo + '\'' +
                ", marca='" + marca + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
