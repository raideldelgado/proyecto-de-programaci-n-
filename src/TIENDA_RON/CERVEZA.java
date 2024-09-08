package TIENDA_RON;

import java.io.Serializable;

public class CERVEZA extends BEBIDA implements Serializable {
    private int volumen;

    public CERVEZA(int volumen, String nombre, int cantidad, String envace, int precio_compra, int precio_venta) {
        super(nombre, cantidad, envace, precio_compra, precio_venta);
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
