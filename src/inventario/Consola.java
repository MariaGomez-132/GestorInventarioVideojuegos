/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 * Representa una consola de videojuegos disponible en la tienda.
 * 
 * <p>Extiende {@link Item} con atributos propios de hardware,
 * como la marca, el modelo y si incluye mando en el pack.</p>
 * 
 * @author alexandra
 * @version 1.0
 */
public class Consola extends Item {
     /**
     * Marca fabricante de la consola (Sony, Microsoft, Nintendo...).
     */
    private String marca;
    
    /**
     * Modelo específico de la consola (PS5, Xbox Series X, Switch OLED...).
     */
    private String modelo;
    
    /**
     * Indica si la consola se vende con mando incluido en el pack.
     */
    private boolean incluyeMando;
    
    /**
     * Construye una nueva consola con todos sus atributos.
     *
     * @param nombre El nombre comercial de la consola.
     * @param precio El precio en euros.
     * @param stock Las unidades disponibles.
     * @param marca La marca fabricante.
     * @param modelo El modelo específico.
     * @param incluyeMando {@code true} si incluye mando, {@code false} si no.
     */
    public Consola(String nombre, double precio, int stock, String marca, String modelo, boolean incluyeMando) {
        super(nombre, precio, stock);
        this.marca = marca;
        this.modelo = modelo;
        this.incluyeMando = incluyeMando;
    }
    
    /**
     * Devuelve la marca de la consola.
     *
     * @return La marca fabricante.
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * Establece la marca de la consola.
     *
     * @param marca La nueva marca.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /**
     * Devuelve el modelo de la consola.
     *
     * @return El modelo específico.
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * Establece el modelo de la consola.
     *
     * @param modelo El nuevo modelo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    /**
     * Indica si la consola incluye mando en el pack de venta.
     *
     * @return {@code true} si incluye mando, {@code false} en caso contrario.
     */
    public boolean getIncluyeMando() {
        return incluyeMando;
    }
    
    /**
     * Establece si la consola incluye mando.
     *
     * @param incluyeMando {@code true} para incluir mando, {@code false} para excluirlo.
     */
    public void setIncluyeMando(boolean incluyeMando) {
        this.incluyeMando = incluyeMando;
    }
    
    /**
     * Muestra por consola la información completa de la consola,
     * incluyendo marca, modelo y si viene con mando.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("=== CONSOLA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Con mando: " + (incluyeMando ? "Sí" : "No"));
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}
