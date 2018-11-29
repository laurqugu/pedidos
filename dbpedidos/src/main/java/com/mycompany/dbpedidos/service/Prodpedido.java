/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbpedidos.service;

/**
 *
 * @author desarrollo
 */
public class Prodpedido {
    private int PLU;
    private int cantidadProducto;
    private int codPedido;
    
    public Prodpedido(){}
    
    //constructor
    public Prodpedido(int PLU, int cantidadProducto, int codPedido) {
        this.PLU = PLU;
        this.cantidadProducto = cantidadProducto;
        this.codPedido = codPedido;
    }
    
    //get & setter
    public int getPLU() {
        return PLU;
    }

    public void setPLU(int PLU) {
        this.PLU = PLU;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }
    
        
    //toString

    @Override
    public String toString() {
        return "Prodpedido{" + "PLU=" + PLU + ", cantidadProducto=" + cantidadProducto + ", codPedido=" + codPedido + '}';
    } 
}
