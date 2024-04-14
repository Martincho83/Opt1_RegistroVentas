package ar.com.unpaz.model;

public class Informe {

    private String cliente;
    private int cantidadVentas;
    private double totalVentas;

    public Informe(String cliente, int cantidadVentas, double totalVentas) {
        this.cliente = cliente;
        this.cantidadVentas = cantidadVentas;
        this.totalVentas = totalVentas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(int cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString(){
        return "Cliente: " + cliente + ", Cantidad de Ventas: " + cantidadVentas + ", Total de Ventas: " + totalVentas;
    }
}
