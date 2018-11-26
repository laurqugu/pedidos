/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbpedidos.service;

import java.util.Date;
import java.util.List;

/**
 *
 * @author desarrollo
 */
public class Pedido {
    
    //Definición de variables
    private Date fechaHoraPedido;
    private String tipoPedido;
    private int codPuntoEntrega;
    private String codUsuario;
    private int estadoBodega;
    private int estadoProveedor;
    private int estadoPedido;
    private List<Prodpedido> productos;

    public Pedido() {}

    public Pedido(Date fechaHoraPedido, String tipoPedido, int codPuntoEntrega, String codUsuario, int estadoBodega, int estadoProveedor, int estadoPedido, List<Prodpedido> productos) {
        this.fechaHoraPedido = fechaHoraPedido;
        this.tipoPedido = tipoPedido;
        this.codPuntoEntrega = codPuntoEntrega;
        this.codUsuario = codUsuario;
        this.estadoBodega = estadoBodega;
        this.estadoProveedor = estadoProveedor;
        this.estadoPedido = estadoPedido;
        this.productos = productos;
    }

    public Date getFechaHoraPedido() {
        return fechaHoraPedido;
    }

    public void setFechaHoraPedido(Date fechaHoraPedido) {
        this.fechaHoraPedido = fechaHoraPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public int getCodPuntoEntrega() {
        return codPuntoEntrega;
    }

    public void setCodPuntoEntrega(int codPuntoEntrega) {
        this.codPuntoEntrega = codPuntoEntrega;
    }

    public String getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(String codUsuario) {
        this.codUsuario = codUsuario;
    }

    public int getEstadoBodega() {
        return estadoBodega;
    }

    public void setEstadoBodega(int estadoBodega) {
        this.estadoBodega = estadoBodega;
    }

    public int getEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(int estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

    public int getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(int estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public List<Prodpedido> getProductos() {
        return productos;
    }

    public void setProductos(List<Prodpedido> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "pedido{" + "fechaHoraPedido=" + fechaHoraPedido + ", tipoPedido=" + tipoPedido + ", codPuntoEntrega=" + codPuntoEntrega + ", codUsuario=" + codUsuario + ", estadoBodega=" + estadoBodega + ", estadoProveedor=" + estadoProveedor + ", estadoPedido=" + estadoPedido + ", productos=" + productos + '}';
    }
    
    
    
    
}
