public  class Ropa implements Producto {
    private String nombre;
    private double precio;
    private String codigo;
    private int cantidad;
    private String talla;

    public Ropa(String nombre, double precio, String codigo, int cantidad, String talla) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.talla = talla;
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

    public String getTalla() {
        return talla;
    }

    @Override
    public String toString() {
        return "Ropa{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", codigo='" + codigo + '\'' +
                ", talla='" + talla + '\'' +
                ", cantidad=" + cantidad +
                '}';

}
}
