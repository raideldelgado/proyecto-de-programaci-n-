package TIENDA_RON;

import java.io.Serializable;

public class RON extends BEBIDA implements Serializable{
    private String tipo;

    public RON(String tipo, String nombre, int cantidad, String envace, int precio_compra, int precio_venta) {
        super(nombre, cantidad, envace, precio_compra, precio_venta);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
