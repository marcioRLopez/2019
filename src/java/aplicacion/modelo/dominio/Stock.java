package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author GRUPO10 clase de tipo rubro que es la categoria del producto para su
 * venta
 */
public class Stock implements Serializable {

    /**
     * atributo de tipo entero
     */
    public int cantidad;
    /**
     * atributo  que indica el stock de medicamentos de la veterinaria
     */
    public String medicamento;
    /**
     * atributo que indica el stock de alimento balanceado para su venta
     */
    public String alimentoBalanceado;
    /**
     * atributo que indica el stock de otros productos ej cosmetica, accesorios
     */
    public String Producto;
    
    /**
     * constructor por defecto
     */

    public Stock() {
    }
/**
 * constructor parametrizado
 * @param cantidad el stock en general
 * @param medicamento los medicamentos
 * @param alimentoBalanceado los alimentos para la venta
 * @param Producto  productos varios
 */
    public Stock(int cantidad, String medicamento, String alimentoBalanceado, String Producto) {
        this.cantidad = cantidad;
        this.medicamento = medicamento;
        this.alimentoBalanceado = alimentoBalanceado;
        this.Producto = Producto;
    }
    
    // SECCION DE GETTERS Y SETTERS

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getAlimentoBalanceado() {
        return alimentoBalanceado;
    }

    public void setAlimentoBalanceado(String alimentoBalanceado) {
        this.alimentoBalanceado = alimentoBalanceado;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }
    
    
    

    

}
