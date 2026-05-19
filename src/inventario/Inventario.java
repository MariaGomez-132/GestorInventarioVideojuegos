/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;
import inventario.excepciones.StockAgotadoException;
import java.util.ArrayList;
import java.util.List;

/**
 * Gestiona el inventario completo de la tienda de videojuegos.
 * 
 * <p>Permite añadir, eliminar, buscar y vender ítems del catálogo.
 * Mantiene internamente una lista de objetos {@link Item} que puede
 * contener tanto {@link Videojuego} como {@link Consola}.</p>
 * 
 * <ul>
 *   <li>No se permiten ítems duplicados (mismo nombre).</li>
 *   <li>La venta descuenta automáticamente el stock.</li>
 *   <li>Si el stock es insuficiente se lanza {@link StockAgotadoException}.</li>
 * </ul>
 * 
 * @author alexandra
 * @version 1.0
 */
public class Inventario {
    /**
     * Nombre de la tienda propietaria del inventario.
     */
    private String nombreTienda;
    
    /**
     * Lista interna de todos los ítems del inventario.
     */
    private List<Item> items;
    
    /**
     * Construye un inventario vacío para la tienda indicada.
     *
     * @param nombreTienda El nombre de la tienda.
     */
    public Inventario(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.items = new ArrayList<>();
    }
    
    /**
     * Añade un nuevo ítem al inventario si no existe ya uno con el mismo nombre.
     *
     * @param item El ítem a añadir. No puede ser nulo.
     * @return {@code true} si se añadió correctamente, {@code false} si ya existía.
     */
    public boolean agregarItem(Item item) {
        for (Item i : items) {
            if (i.getNombre().equals(item.getNombre())) {
                System.out.println("Ya existe un ítem con el nombre: " + item.getNombre());
                return false;
            }
        }
        items.add(item);
        return true;
    }
    
     /**
     * Elimina un ítem del inventario por su nombre.
     *
     * @param nombre El nombre del ítem a eliminar.
     * @return {@code true} si se eliminó, {@code false} si no se encontró.
     */
    public boolean eliminarItem(String nombre) {
        for (Item i : items) {
            if (i.getNombre().equals(nombre)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Busca un ítem en el inventario por nombre.
     *
     * @param nombre El nombre del ítem a buscar.
     * @return El {@link Item} encontrado, o {@code null} si no existe.
     */
    public Item buscarItem(String nombre) {
        for (Item i : items) {
            if (i.getNombre().equals(nombre)) {
                return i;
            }
        }
        return null;
    }
    
    /**
     * Registra la venta de una cantidad determinada de un ítem,
     * descontando las unidades del stock disponible.
     *
     * @param nombre   El nombre del ítem a vender.
     * @param cantidad La cantidad de unidades a vender.
     * @throws StockAgotadoException    Si el stock disponible es menor que la cantidad solicitada.
     * @throws IllegalArgumentException Si el ítem no existe en el inventario.
     */
    public void venderItem(String nombre, int cantidad) {
        Item item = buscarItem(nombre);
        
        if (item == null) {
            throw new IllegalArgumentException("El ítem '" + nombre + "' no existe en el inventario.");
        }
        
        if (item.getStock() < cantidad) {
            throw new StockAgotadoException(nombre, item.getStock(), cantidad);
        }
        
        item.setStock(item.getStock() - cantidad);
        System.out.println("Venta registrada: " + cantidad + " x '" + nombre + "'. Stock restante: " + item.getStock());
    }
    
    /**
     * Muestra por consola todos los ítems del inventario con su información.
     */
    public void mostrarInventario() {
        System.out.println("\n========================================");
        System.out.println("  INVENTARIO DE: " + nombreTienda.toUpperCase());
        System.out.println("========================================");
        if (items.isEmpty()) {
            System.out.println("  El inventario está vacío.");
        } else {
            for (Item item : items) {
                item.mostrarInfo();
                System.out.println("----------------------------------------");
            }
        }
        System.out.println("Total de productos: " + items.size());
    }
    
    /**
     * Devuelve la lista completa de ítems del inventario.
     *
     * @return Lista de {@link Item} del inventario.
     */
    public List<Item> getItems() {
        return items;
    }
    
    /**
     * Devuelve el nombre de la tienda.
     *
     * @return El nombre de la tienda.
     */
    public String getNombreTienda() {
        return nombreTienda;
    }
}
