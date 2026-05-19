/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario.excepciones;

/**
 * Excepción personalizada que se lanza cuando se intenta realizar
 * una operación sobre un producto cuyo stock está agotado o es insuficiente.
 * 
 * <p>Esta excepción extiende {@link RuntimeException} para que no sea
 * obligatorio capturarla en tiempo de compilación, aunque se recomienda
 * gestionarla explícitamente en la lógica de negocio.</p>
 * 
 * @author alexandra
 * @version 1.0
 */
public class StockAgotadoException extends RuntimeException {
    /**
     * Nombre del producto que causó la excepción.
     */
    private final String nombreProducto;
    
    /**
     * Stock disponible en el momento de lanzar la excepción.
     */
    private final int stockDisponible;
    
    /**
     * Construye una nueva excepción con información detallada sobre
     * el producto y el stock disponible.
     *
     * @param nombreProducto  El nombre del producto sin stock suficiente.
     * @param stockDisponible La cantidad de stock disponible actualmente.
     * @param cantidadSolicitada La cantidad que se intentó obtener.
     */
    public StockAgotadoException(String nombreProducto, int stockDisponible, int cantidadSolicitada) {
        super("Stock insuficiente para '" + nombreProducto + "'. "
                + "Solicitado: " + cantidadSolicitada
                + ", Disponible: " + stockDisponible);
        this.nombreProducto = nombreProducto;
        this.stockDisponible = stockDisponible;
    }
    
    /**
     * Devuelve el nombre del producto que causó la excepción.
     *
     * @return El nombre del producto sin stock.
     */
    public String getNombreProducto() {
        return nombreProducto;
    }
    
    /**
     * Devuelve el stock disponible en el momento de lanzar la excepción.
     *
     * @return La cantidad de stock disponible.
     */
    public int getStockDisponible() {
        return stockDisponible;
    }
}
