/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;
import inventario.excepciones.StockAgotadoException;

/**
 * Clase principal que demuestra el funcionamiento del gestor de inventario.
 * 
 * <p>Crea una instancia de {@link Inventario}, añade varios productos
 * (tanto {@link Videojuego} como {@link Consola}) y realiza operaciones
 * de búsqueda, venta y gestión de excepciones.</p>
 * 
 * @author alexandra
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear inventario de la tienda
        Inventario inventario = new Inventario("GameZone");

        //Crear productos
        Videojuego juegoA = new Videojuego("The Legend of Zelda: BOTW", 59.99, 10, "Nintendo Switch", "Aventura", 12);
        Videojuego juegoB = new Videojuego("God of War Ragnarok", 69.99, 5, "PS5", "Acción", 18);
        Videojuego juegoC = new Videojuego("Minecraft", 29.99, 20, "PC", "Sandbox", 7);
        Consola consolaA = new Consola("PlayStation 5", 549.99, 3, "Sony", "PS5 Digital", true);
        Consola consolaB = new Consola("Nintendo Switch OLED", 349.99, 7, "Nintendo", "Switch OLED", true);

        //Añadir al inventario
        inventario.agregarItem(juegoA);
        inventario.agregarItem(juegoB);
        inventario.agregarItem(juegoC);
        inventario.agregarItem(consolaA);
        inventario.agregarItem(consolaB);

        //Mostrar inventario completo
        inventario.mostrarInventario();

        //Demostrar búsqueda
        System.out.println("\n--- BÚSQUEDA ---");
        Item encontrado = inventario.buscarItem("Minecraft");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        //Demostrar venta exitosa
        System.out.println("\n--- VENTA ---");
        inventario.venderItem("God of War Ragnarok", 2);

        //Demostrar descuento
        System.out.println("\n--- DESCUENTO ---");
        double precioConDescuento = juegoA.calcularPrecioFinal(10);
        System.out.println("Precio de '" + juegoA.getNombre() + "' con 10% descuento: " + precioConDescuento + "€");

        //Demostrar excepción de stock agotado
        System.out.println("\n--- PRUEBA DE EXCEPCIÓN ---");
        try {
            inventario.venderItem("PlayStation 5", 99);
        } catch (StockAgotadoException e) {
            System.out.println("ERROR CONTROLADO: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        //Inventario final
        inventario.mostrarInventario();
    } 
}
