package ar.com.unpaz.servicio;

import ar.com.unpaz.model.*;

import javax.swing.*;
import java.util.*;

public class GenerarInforme {

    public List<Informe> generarInforme(List<Cliente> clientes, List<Venta> ventas){
        Map<Integer,Informe> informesMap = new HashMap<>();

        for(Cliente cliente : clientes){
            informesMap.put(cliente.getId(),new Informe(cliente.getNombre(),0,0.0));
        }
        for(Venta venta : ventas){
            int clienteId = venta.getCliente();
            Informe informe = informesMap.get(clienteId);
            if(informe !=null){
                informe.setCantidadVentas(informe.getCantidadVentas() + 1);
                informe.setTotalVentas(informe.getTotalVentas() + venta.getTotal());
            }
        }

        List<Informe> informes = new ArrayList<>(informesMap.values());

        return informes;
    }
}