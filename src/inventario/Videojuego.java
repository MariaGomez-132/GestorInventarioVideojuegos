/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author alexandra
 */
public class Videojuego extends Item {
    private String plataforma;
    private String genero;
    private int pegi;
    
    public Videojuego(String nombre, double precio, int stock, String plataforma, String genero, int pegi) {
        super(nombre, precio, stock);
        this.plataforma = plataforma;
        this.genero = genero;
        this.pegi = pegi;
    }
    
    public String getPlataforma() {
        return plataforma;
    }
    
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getPegi() {
        return pegi;
    }
    
    public void setPegi(int pegi) {
        this.pegi = pegi;
    }
    
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
