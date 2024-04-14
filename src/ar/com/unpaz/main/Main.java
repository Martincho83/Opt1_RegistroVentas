package ar.com.unpaz.main;
import java.util.*;
import ar.com.unpaz.servicio.*;
import ar.com.unpaz.model.*;
import  ar.com.unpaz.repositorio.*;

public class Main {

    public static void main(String[] args) {

        LeerArchivoServicio servvicio = new LeerArchivoServicio();

        // Lectura de Productos
        System.out.print("********************\n");
        System.out.print("Lectura de Productos\n");
        System.out.print("********************\n");
        List<Producto> productos = servvicio.getListProductos();
        for (Producto producto : productos) {
            System.out.println("ID; " + producto.getId() + ", Nombre: " + producto.getNombre() + ", Cantidad; " + producto.getCantidad() + ", Precio " + producto.getPrecio());
        }

        // Lectura de Clientes
        System.out.print("********************\n");
        System.out.print("Lectura de Clientes\n");
        System.out.print("********************\n");
        List<Cliente> clientes = servvicio.getListClientes();
        for (Cliente cliente : clientes) {
            System.out.println("ID; " + cliente.getId() + ", Nombre: " + cliente.getNombre() + ", Apellido: " + cliente.getApellido() + ", Telefono: " + cliente.getTelefono());
        }

        // Lectura de Detalles
        System.out.print("********************\n");
        System.out.print("Lectura de Detalles\n");
        System.out.print("********************\n");
        List<Detalle> detalles = servvicio.getListDetalles();
        for (Detalle detalle : detalles) {
            System.out.println("ID; " + detalle.getId() + ", Venta: " + detalle.getVenta() + ", Producto: " + detalle.getProducto() + ", Cantidad: " + detalle.getCantidad() + ", Precio: " + detalle.getPrecio());
        }

        // Lectura de Ventas
        System.out.print("********************\n");
        System.out.print("Lectura de Ventas\n");
        System.out.print("********************\n");
        List<Venta> ventas  = servvicio.getListVentas();
        for (Venta venta : ventas) {
            System.out.println("ID; " + venta.getId() + ", Fecha: " + venta.getFecha() + ", Cliente: " + venta.getCliente() + ", Total: " + venta.getTotal());
        }

        // Generación de Informe de Ventas por Cliente
        System.out.print("********************\n");
        System.out.print("Informe Ventas por Clientes\n");
        System.out.print("********************\n");;
        GeneradorInforme generadorInforme = new GeneradorInforme();
        List<Informe> informes = generadorInforme.generarInforme(clientes,ventas);
        for (Informe informe : informes) {
            System.out.println(informe);
        }
    }
}