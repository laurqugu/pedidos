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
    private Date fecha;
    private String tipoPedido;
    private int codPuntoEntrega;
    private int codProveedor;
    private String codUsuario;
    private int estadoBodega;
    private int estadoProveedor;
    private int estadoPedido;
    private List<Prodpedido> productos;

    public Pedido() {}

    public Pedido(Date fecha, String tipoPedido, int codPuntoEntrega, int codProveedor, String codUsuario, int estadoBodega, int estadoProveedor, int estadoPedido, List<Prodpedido> productos) {
        this.fecha = fecha;
        this.tipoPedido = tipoPedido;
        this.codPuntoEntrega = codPuntoEntrega;
        this.codProveedor = codProveedor;
        this.codUsuario = codUsuario;
        this.estadoBodega = estadoBodega;
        this.estadoProveedor = estadoProveedor;
        this.estadoPedido = estadoPedido;
        this.productos = productos;
    }
    
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
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
        return "Pedido{" + "fecha=" + fecha + ", tipoPedido=" + tipoPedido + ", codPuntoEntrega=" + codPuntoEntrega + ", codProveedor=" + codProveedor + ", codUsuario=" + codUsuario + ", estadoBodega=" + estadoBodega + ", estadoProveedor=" + estadoProveedor + ", estadoPedido=" + estadoPedido + ", productos=" + productos + '}';
    }
    
    
}
