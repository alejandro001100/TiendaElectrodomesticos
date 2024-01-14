import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Seleccione una opción: \n1. Agregar Producto \n2. Vender Producto \n3. Ver lista de productos \n4. Salir");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consume la línea nueva restante

                switch (opcion) {
                    case 1:
                        tienda.agregarProducto();
                        break;
                    case 2:
                        tienda.venderProducto();
                        break;
                    case 3:
                        tienda.mostrarProductos();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa.");
                        return;
                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (ProductoNoEncontradoException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        }
    }
}
