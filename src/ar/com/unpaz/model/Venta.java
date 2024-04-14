package ar.com.unpaz.model;

public class Venta {
    
    private int id;
    private String fecha;
    private int cliente;
    private double total;

    public Venta(int id, String fecha, int cliente, double total) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.total = total;
    }

    public Venta() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
