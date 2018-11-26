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
    
    public Prodpedido(){}
    
    //constructor
    public Prodpedido(int PLU, int cantidadProducto) {
        this.PLU = PLU;
        this.cantidadProducto = cantidadProducto;
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
    
    //toString
    @Override
    public String toString() {
        return "prodpedido{" + "PLU=" + PLU + ", cantidadProducto=" + cantidadProducto + '}';
    }
    
    
}
