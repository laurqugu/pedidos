/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbpedidos.service;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author desarrollo
 */
@Entity
@Table(name = "productopedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productopedido.findAll", query = "SELECT p FROM Productopedido p")
    , @NamedQuery(name = "Productopedido.findById", query = "SELECT p FROM Productopedido p WHERE p.id = :id")
    , @NamedQuery(name = "Productopedido.findByCodpedido", query = "SELECT p FROM Productopedido p WHERE p.codpedido = :codpedido")
    , @NamedQuery(name = "Productopedido.findByCodproducto", query = "SELECT p FROM Productopedido p WHERE p.codproducto = :codproducto")
    , @NamedQuery(name = "Productopedido.findByCantidadproducto", query = "SELECT p FROM Productopedido p WHERE p.cantidadproducto = :cantidadproducto")
    , @NamedQuery(name = "Productopedido.findByCantidadconfirmada", query = "SELECT p FROM Productopedido p WHERE p.cantidadconfirmada = :cantidadconfirmada")})
public class Productopedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDADPRODUCTO")
    private int cantidadproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPEDIDO")
    private int codpedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPRODUCTO")
    private int codproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPROVEEDOR")
    private int codproveedor;
    @Column(name = "CANTIDADCONFIRMADA")
    private Integer cantidadconfirmada;

    public Productopedido() {
    }

    public Productopedido(Integer id) {
        this.id = id;
    }

    public Productopedido(Integer id, int cantidadproducto, int codproducto, int codpedido, int codproveedor) {
        this.id = id;
        this.cantidadproducto = cantidadproducto;
        this.codproducto = codproducto;
        this.codpedido = codpedido;
        this.codproveedor = codproveedor;
    }

    public int getCodproveedor() {
        return codproveedor;
    }

    public void setCodproveedor(int codproveedor) {
        this.codproveedor = codproveedor;
    }

    public int getCodpedido() {
        return codpedido;
    }

    public void setCodpedido(int codpedido) {
        this.codpedido = codpedido;
    }
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }

    public Productopedido(int codpedido) {
        this.codpedido = codpedido;
    }
    
    public int getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(int codproducto) {
        this.codproducto = codproducto;
    }
    

    public Integer getCantidadconfirmada() {
        return cantidadconfirmada;
    }

    public void setCantidadconfirmada(Integer cantidadconfirmada) {
        this.cantidadconfirmada = cantidadconfirmada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productopedido)) {
            return false;
        }
        Productopedido other = (Productopedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.dbpedidos.service.Productopedido[ id=" + id + " ]";
    }
    
}
