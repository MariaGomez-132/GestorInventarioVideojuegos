/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 * Representa un videojuego disponible en la tienda.
 * 
 * <p>Extiende la clase {@link Item} añadiendo atributos específicos
 * de un videojuego, como la plataforma, el género y la clasificación
 * por edades (PEGI).</p>
 * 
 * @author alexandra
 * @version 1.0
 */
public class Videojuego extends Item {
    /**
     * Plataforma para la que está disponible el videojuego.
     * Por ejemplo: <b>PS5</b>, <b>Xbox Series X</b>, <b>PC</b>.
     */
    private String plataforma;
    
    /**
     * Género del videojuego (Acción, RPG, Deportes, etc.).
     */
    private String genero;
    
    /**
     * Clasificación PEGI del videojuego (3, 7, 12, 16, 18).
     */
    private int pegi;
    
    /**
     * Construye un nuevo videojuego con todos sus atributos.
     *
     * @param nombre El título del videojuego.
     * @param precio El precio en euros.
     * @param stock Las unidades disponibles en inventario.
     * @param plataforma La plataforma compatible.
     * @param genero El género del juego.
     * @param pegi La clasificación por edades PEGI.
     */
    public Videojuego(String nombre, double precio, int stock, String plataforma, String genero, int pegi) {
        super(nombre, precio, stock);
        this.plataforma = plataforma;
        this.genero = genero;
        this.pegi = pegi;
    }
    
    /**
     * Devuelve la plataforma del videojuego.
     *
     * @return La plataforma compatible.
     */
    public String getPlataforma() {
        return plataforma;
    }
    
    /**
     * Establece la plataforma del videojuego.
     *
     * @param plataforma La nueva plataforma.
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    /**
     * Devuelve el género del videojuego.
     *
     * @return El género del juego.
     */
    public String getGenero() {
        return genero;
    }
    
    /**
     * Establece el género del videojuego.
     *
     * @param genero El nuevo género.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
     /**
     * Devuelve la clasificación PEGI del videojuego.
     *
     * @return El valor PEGI (3, 7, 12, 16 o 18).
     */
    public int getPegi() {
        return pegi;
    }
    
    /**
     * Establece la clasificación PEGI del videojuego.
     *
     * @param pegi El nuevo valor PEGI.
     */
    public void setPegi(int pegi) {
        this.pegi = pegi;
    }
    
    /**
     * Muestra por consola la información completa del videojuego,
     * incluyendo plataforma, género y clasificación PEGI.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("=== VIDEOJUEGO ===");
        System.out.println("Título: " + nombre);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Género: " + genero);
        System.out.println("PEGI: " + pegi);
        System.out.println("Precio: " + precio + "€");
        System.out.println("Stock: " + stock + " unidades");
    }
}
