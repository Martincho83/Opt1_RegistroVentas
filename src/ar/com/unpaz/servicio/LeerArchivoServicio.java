package ar.com.unpaz.servicio;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.*;
import ar.com.unpaz.repositorio.*;

import java.util.ArrayList;
import java.util.List;

public class LeerArchivoServicio implements Funcionalidades {

    @Override
    public List<Producto> getListProductos(){
        LeerArchivoRepositorio repo = new LeerArchivoRepositorio();
        List<Producto> sList = new ArrayList<Producto>();
        sList = repo.getListProductos();
        return sList;
    }

    @Override
    public List<Cliente> getListClientes(){
        LeerArchivoRepositorio repo = new LeerArchivoRepositorio();
        List<Cliente> sList = new ArrayList<Cliente>();
        sList = repo.getListClientes();
        return sList;
    }

    @Override
    public List<Detalle> getListDetalles(){
        LeerArchivoRepositorio repo = new LeerArchivoRepositorio();
        List<Detalle> sList = new ArrayList<Detalle>();
        sList = repo.getListDetalles();
        return sList;
    }

    @Override
    public List<Venta> getListVentas(){
        LeerArchivoRepositorio repo = new LeerArchivoRepositorio();
        List<Venta> sList = new ArrayList<Venta>();
        sList = repo.getListVentas();
        return sList;
    }

    @Override
    public List<Informe> generarInforme(List<Cliente> clientes, List<Venta> ventas){
        return new ArrayList<>();
    }
}
