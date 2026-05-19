/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;
import inventario.excepciones.StockAgotadoException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alexandra
 */
public class Inventario {
    private String nombreTienda;
    private List<Item> items;
    
    public Inventario(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.items = new ArrayList<>();
    }
    
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
    
    public boolean eliminarItem(String nombre) {
        for (Item i : items) {
            if (i.getNombre().equals(nombre)) {
                items.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Item buscarItem(String nombre) {
        for (Item i : items) {
            if (i.getNombre().equals(nombre)) {
                return i;
            }
        }
        return null;
    }
    
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
    
    public List<Item> getItems() {
        return items;
    }
    
    public String getNombreTienda() {
        return nombreTienda;
    }
}
