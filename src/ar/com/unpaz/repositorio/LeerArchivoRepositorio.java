package ar.com.unpaz.repositorio;

import ar.com.unpaz.crud.Funcionalidades;
import ar.com.unpaz.model.*;

import java.util.*;
import java.io.*;


public class LeerArchivoRepositorio implements Funcionalidades {

    @Override
    public List<Producto> getListProductos(){
        File sFile = new File("producto.txt");
        List<Producto> sListProducto = new ArrayList<>();
        FileReader sFileReader;
        try {
            sFileReader = new FileReader(sFile);
            BufferedReader sBufferReader = new BufferedReader(sFileReader);
            String linea = "";
            while ((linea = sBufferReader.readLine()) !=null){
                String data[] = linea.split(",");
                Producto sProducto = new Producto();
                sProducto.setId(Integer.parseInt(data[0])) ;
                sProducto.setNombre(data[1]);
                sProducto.setCantidad(Integer.parseInt(data[2]));
                sProducto.setPrecio(Double.parseDouble(data[3])) ;
                sListProducto.add(sProducto);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return sListProducto;
    }

    @Override
    public List<Cliente> getListClientes(){
        File sFile = new File("cliente.txt");
        List<Cliente> sListCliente = new ArrayList<>();
        FileReader sFileReader;
        try {
            sFileReader = new FileReader(sFile);
            BufferedReader sBufferReader = new BufferedReader(sFileReader);
            String linea = "";
            while ((linea = sBufferReader.readLine()) !=null){
                String data[] = linea.split(",");
                Cliente sCliente = new Cliente();
                sCliente.setId(Integer.parseInt(data[0]));
                sCliente.setNombre(data[1]);
                sCliente.setApellido((data[2]));
                sCliente.setTelefono((data[3]));
                sListCliente.add(sCliente);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return sListCliente ;
    }

    @Override
    public List<Detalle> getListDetalles(){
        File sFile = new File("detalle.txt");
        List<Detalle> sListDetalle = new ArrayList<>();
        FileReader sFileReader;
        try {
            sFileReader = new FileReader(sFile);
            BufferedReader sBufferReader = new BufferedReader(sFileReader);
            String linea = "";
            while ((linea = sBufferReader.readLine()) !=null){
                String data[] = linea.split(",");
                Detalle sDetalle = new Detalle();
                sDetalle.setId(Integer.parseInt(data[0]));
                sDetalle.setVenta(Integer.parseInt(data[1]));
                sDetalle.setProducto(Integer.parseInt((data[2])));
                sDetalle.setPrecio(Double.parseDouble((data[3])));
                sDetalle.setPrecio(Double.parseDouble((data[4])));
                sListDetalle.add(sDetalle);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return sListDetalle ;
    }

    @Override
    public List<Venta> getListVentas(){
        File sFile = new File("venta.txt");
        List<Venta> sListVenta = new ArrayList<>();
        FileReader sFileReader;
        try {
            sFileReader = new FileReader(sFile);
            BufferedReader sBufferReader = new BufferedReader(sFileReader);
            String linea = "";
            while ((linea = sBufferReader.readLine()) !=null){
                String data[] = linea.split(",");
                Venta sVenta = new Venta();
                sVenta.setId(Integer.parseInt(data[0]));
                sVenta.setFecha(data[1]);
                sVenta.setCliente(Integer.parseInt((data[2])));
                sVenta.setTotal(Double.parseDouble((data[3])));
                sListVenta.add(sVenta);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return sListVenta ;
    }

    @Override
    public List<Informe> generarInforme(List<Cliente> clientes, List<Venta> ventas) {
        return List.of();
    }
}