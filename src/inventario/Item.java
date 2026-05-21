/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 * Clase abstracta que representa un ítem genérico de la tienda de videojuegos.
 * 
 * <p>Actúa como clase base para todos los productos del inventario.
 * Define los atributos y comportamientos comunes que deben compartir
 * todos los artículos, como el nombre, precio y stock.</p>
 * 
 * <ul>
 *   <li>Toda subclase debe implementar {@link #mostrarInfo()}.</li>
 *   <li>El precio nunca puede ser negativo.</li>
 *   <li>El stock nunca puede ser negativo.</li>
 * </ul>
 * 
 * @author alexandra
 * @version 1.0
 */
public abstract class Item {
    /**
     * Nombre del ítem tal como aparece en el inventario.
     */
    protected String nombre;
    
    /**
     * Precio base del ítem en euros, sin descuentos aplicados.
     */
    protected double precio;
    
    /**
     * Cantidad de unidades disponibles actualmente en el inventario.
     */
    protected int stock;
    
     /**
     * Construye un nuevo ítem con los datos básicos proporcionados.
     *
     * @param nombre El nombre del ítem. No puede ser nulo ni vacío.
     * @param precio El precio base en euros. Debe ser mayor o igual a 0.
     * @param stock La cantidad inicial en stock. Debe ser mayor o igual a 0.
     * @throws IllegalArgumentException Si el precio o el stock son negativos.
     */
    public Item(String nombre, double precio, int stock) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    /**
     * Devuelve el nombre del ítem.
     *
     * @return El nombre del ítem.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Establece un nuevo nombre para el ítem.
     *
     * @param nombre El nuevo nombre. No debería ser nulo ni vacío.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el precio base del ítem.
     *
     * @return El precio en euros.
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Establece un nuevo precio para el ítem.
     *
     * @param precio El nuevo precio en euros. Debe ser mayor o igual a 0.
     * @throws IllegalArgumentException Si el precio es negativo.
     */
    public void setPrecio(double precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }
    
    /**
     * Devuelve el stock actual del ítem.
     *
     * @return La cantidad de unidades disponibles.
     */
    public int getStock() {
        return stock;
    }
    
    /**
     * Establece el stock del ítem.
     *
     * @param stock La nueva cantidad en stock. Debe ser mayor o igual a 0.
     * @throws IllegalArgumentException Si el stock es negativo.
     */
    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("El stock no puede ser negativo.");
        }
        this.stock = stock;
    }
    
    /**
     * Calcula el precio final del ítem aplicando un descuento porcentual.
     * Este método será modificado en las ramas feature y hotfix para
     * provocar el conflicto de merge requerido.
     *
     * @param descuento El porcentaje de descuento a aplicar (0-100).
     * @return El precio final tras aplicar el descuento.
     */
    
    //En feature/sistema-descuentos
    public double calcularPrecioFinal(double descuento) {
        // Descuento especial: si supera el 20%, se aplica un descuento fijo extra del 5%
        if (descuento > 20) {
        descuento += 5;
        }
        
        return precio - (precio * descuento / 100);
    }
    
    /**
     * Muestra por consola la información detallada del ítem.
     * Cada subclase debe proporcionar su propia implementación.
     */
    public abstract void mostrarInfo();
    
    /**
     * Devuelve una representación en texto del ítem.
     *
     * @return Cadena con el nombre y precio del ítem.
     */
    @Override
    public String toString() {
        return "[" + nombre + "] Precio: " + precio + "€ | Stock: " + stock;
    }
}
