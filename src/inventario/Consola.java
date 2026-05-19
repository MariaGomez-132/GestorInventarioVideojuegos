/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author alexandra
 */
public class Consola extends Item {
    private String marca;
    private String modelo;
    private boolean incluyeMando;
    
    public Consola(String nombre, double precio, int stock, String marca, String modelo, boolean incluyeMando) {
        super(nombre, precio, stock);
        this.marca = marca;
        this.modelo = modelo;
        this.incluyeMando = incluyeMando;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public boolean getIncluyeMando() {
        return incluyeMando;
    }
    
    public void setIncluyeMando(boolean incluyeMando) {
        this.incluyeMando = incluyeMando;
    }
    
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
