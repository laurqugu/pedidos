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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author desarrollo
 */
@Entity
@Table(name = "productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Productos.findAll", query = "SELECT p FROM Productos p")
    , @NamedQuery(name = "Productos.findByCodproducto", query = "SELECT p FROM Productos p WHERE p.codproducto = :codproducto")
    , @NamedQuery(name = "Productos.findByCodproveedor", query = "SELECT p FROM Productos p WHERE p.codproveedor = :codproveedor")
    , @NamedQuery(name = "Productos.findByDescripcion", query = "SELECT p FROM Productos p WHERE p.descripcion = :descripcion")})
public class Productos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPRODUCTO")
    private Integer codproducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPROVEEDOR")
    private Integer codproveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Productos() {
    }

    public Productos(Integer codproducto) {
        this.codproducto = codproducto;
    }

    public Productos(Integer codproducto, int codproveedor, String descripcion) {
        this.codproducto = codproducto;
        this.codproveedor = codproveedor;
        this.descripcion = descripcion;
    }

    public Integer getCodproducto() {
        return codproducto;
    }

    public void setCodproducto(Integer codproducto) {
        this.codproducto = codproducto;
    }

    public Integer getCodproveedor() {
        return codproveedor;
    }

    public void setCodproveedor(Integer codproveedor) {
        this.codproveedor = codproveedor;
    }    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codproducto != null ? codproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productos)) {
            return false;
        }
        Productos other = (Productos) object;
        if ((this.codproducto == null && other.codproducto != null) || (this.codproducto != null && !this.codproducto.equals(other.codproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.dbpedidos.service.Productos[ codproducto=" + codproducto + " ]";
    }
    
}
