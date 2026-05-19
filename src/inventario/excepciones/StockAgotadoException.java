/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.excepciones;

/**
 *
 * @author alexandra
 */
public class StockAgotadoException extends RuntimeException {
    private final String nombreProducto;
    private final int stockDisponible;
    
    public StockAgotadoException(String nombreProducto, int stockDisponible, int cantidadSolicitada) {
        super("Stock insuficiente para '" + nombreProducto + "'. "
                + "Solicitado: " + cantidadSolicitada
                + ", Disponible: " + stockDisponible);
        this.nombreProducto = nombreProducto;
        this.stockDisponible = stockDisponible;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }
    
    public int getStockDisponible() {
        return stockDisponible;
    }
}
