import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tienda {
    private List<Producto> inventario;
    private Scanner scanner;

    public Tienda() {
        this.inventario = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void agregarProducto() {
        try {
            System.out.println("Ingrese el tipo de producto (Electrodomestico/Ropa):");
            String tipo = scanner.nextLine();

            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el precio del producto:");
            double precio = scanner.nextDouble();

            if ("electrodomestico".equalsIgnoreCase(tipo)) {

                System.out.println("Ingrese la cantidad del producto:");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el código del producto:");
                String codigo = scanner.nextLine();

                System.out.println("Ingrese la marca del producto:");
                String marca = scanner.nextLine();

                inventario.add(new Electrodomestico(nombre, precio, codigo, marca, cantidad));

            } else if ("ropa".equalsIgnoreCase(tipo)) {

                System.out.println("Ingrese la cantidad del producto:");
                int cantidad = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el código del producto:");
                String codigo = scanner.nextLine();

                System.out.println("Ingrese la talla del producto:");
                String talla = scanner.nextLine();

                inventario.add(new Ropa(nombre, precio, codigo, cantidad, talla));


            } else {
                System.out.println("Tipo de producto no reconocido.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida.");
            scanner.nextLine(); // Limpiar el buffer del scanner
        }
    }

    public void venderProducto() throws ProductoNoEncontradoException {
        try {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la cantidad del producto:");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Consume la línea nueva restante

            Producto producto = buscarProducto(nombre);

            if (producto.getCantidad() < cantidad) {
                System.out.println("No hay suficientes productos en el inventario.");
            } else {
                producto.setCantidad(producto.getCantidad() - cantidad);
                System.out.println("Venta realizada con éxito.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada no válida.");
            scanner.nextLine();
        }
    }

    public void mostrarProductos() {
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }
    private Producto buscarProducto(String nombre) throws ProductoNoEncontradoException {
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }

        throw new ProductoNoEncontradoException("Producto no encontrado.");
    }
}










