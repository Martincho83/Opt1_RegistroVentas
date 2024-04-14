package ar.com.unpaz.crud;

import ar.com.unpaz.model.*;
import java.util.*;

public interface Funcionalidades {
    List<Producto> getListProductos();
    List<Detalle> getListDetalles();
    List<Cliente> getListClientes();
    List<Venta> getListVentas();
    List<Informe> generarInforme(List<Cliente> clientes, List<Venta> ventas);
}
