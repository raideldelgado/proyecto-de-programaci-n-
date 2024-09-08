package TIENDA_RON;

import java.io.Serializable;

public abstract class BEBIDA implements Serializable{
    protected String nombre;
    protected int cantidad;
    protected String envace;
    protected int precio_compra;
    protected int precio_venta;
    protected int ganancia;

    public BEBIDA(String nombre, int cantidad, String envace, int precio_compra, int precio_venta) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.envace = envace;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.ganancia = ((cantidad * precio_venta) - (cantidad * precio_compra));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEnvace() {
        return envace;
    }

    public void setEnvace(String envace) {
        this.envace = envace;
    }

    public int getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }

    public int getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(int precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getGanancia() {
        return ganancia;
    }

    public void setGanancia(int ganancia) {
        this.ganancia = ganancia;
    }
    
    
}
