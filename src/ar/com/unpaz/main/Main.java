package ar.com.unpaz.main;
import java.util.*;
import ar.com.unpaz.servicio.*;
import ar.com.unpaz.model.*;
import  ar.com.unpaz.repositorio.*;

public class Main {

    public static void main(String[] args) {
        LeerArchivoServicio servProducto = new LeerArchivoServicio();
        System.out.print("********************\n");
        System.out.print("Lectura de Productos\n");
        System.out.print("********************\n");
        List<Producto> lista1 = new ArrayList<Producto>();
        lista1 = servProducto.getListProductos();
        for (Producto producto : lista1) {
            System.out.println("ID; " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Cantidad; " + producto.getCantidad() + ", Precio " + producto.getPrecio());
        }

        LeerArchivoServicio servCliente = new LeerArchivoServicio();
        System.out.print("********************\n");
        System.out.print("Lectura de Clientes\n");
        System.out.print("********************\n");
        List<Cliente> lista2 = new ArrayList<Cliente>();
        lista2 = servCliente.getListClientes();
        for (Cliente cliente : lista2) {
            System.out.println("ID; " + cliente.getId() + ", Nombre: " + cliente.getNombre() + ", Apellido: " + cliente.getApellido() + ", Telefono: " + cliente.getTelefono());
        }

        LeerArchivoServicio servDetalle = new LeerArchivoServicio();
        System.out.print("********************\n");
        System.out.print("Lectura de Detalles\n");
        System.out.print("********************\n");
        List<Detalle> lista3 = new ArrayList<Detalle>();
        lista3 = servDetalle.getListDetalles();
        for (Detalle detalle : lista3) {
            System.out.println("ID; " + detalle.getId() + ", Venta: " + detalle.getVenta() + ", Producto: " + detalle.getProducto() + ", Cantidad: " + detalle.getCantidad() + ", Precio: " + detalle.getPrecio());
        }

        LeerArchivoServicio servVenta = new LeerArchivoServicio();
        System.out.print("********************\n");
        System.out.print("Lectura de Ventas\n");
        System.out.print("********************\n");
        List<Venta> lista4 = new ArrayList<Venta>();
        lista4 = servVenta.getListVentas();
        for (Venta venta : lista4) {
            System.out.println("ID; " + venta.getId() + ", Fecha: " + venta.getFecha() + ", Cliente: " + venta.getCliente() + ", Total: " + venta.getTotal());
        }

        LeerArchivoServicio servicio = new LeerArchivoServicio();

        List<Cliente> listaClientes = servicio.getListClientes();
        List<Venta> listaVentas = servicio.getListVentas();

        GeneradorInforme generadorInforme = new GeneradorInforme();

        List<Informe> informes = generadorInforme.generarInforme(listaClientes, listaVentas);

        System.out.print("********************\n");
        System.out.print("Informe Ventas por Clientes\n");
        System.out.print("********************\n");;
        for (Informe informe : informes) {
            System.out.println(informe);
        }
    }
}