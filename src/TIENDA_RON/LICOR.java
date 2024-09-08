package TIENDA_RON;

import java.io.Serializable;

public class LICOR extends BEBIDA implements Serializable{
    private String color;

    public LICOR(String color, String nombre, int cantidad, String envace, int precio_compra, int precio_venta) {
        super(nombre, cantidad, envace, precio_compra, precio_venta);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
