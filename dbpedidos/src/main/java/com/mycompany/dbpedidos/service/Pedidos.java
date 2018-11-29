/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbpedidos.service;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author desarrollo
 */
@Entity
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p")
    , @NamedQuery(name = "Pedidos.findByCodpedido", query = "SELECT p FROM Pedidos p WHERE p.codpedido = :codpedido")
    , @NamedQuery(name = "Pedidos.findByFecha", query = "SELECT p FROM Pedidos p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Pedidos.findByCodusuario", query = "SELECT p FROM Pedidos p WHERE p.codusuario = :codusuario")
    , @NamedQuery(name = "Pedidos.findByCodproveedor", query = "SELECT p FROM Pedidos p WHERE p.codproveedor = :codproveedor")
    , @NamedQuery(name = "Pedidos.findByCodpuntodeentraga", query = "SELECT p FROM Pedidos p WHERE p.codpuntodeentraga = :codpuntodeentraga")
    , @NamedQuery(name = "Pedidos.findByCodestadobodega", query = "SELECT p FROM Pedidos p WHERE p.codestadobodega = :codestadobodega")
    , @NamedQuery(name = "Pedidos.findByCodestadopedido", query = "SELECT p FROM Pedidos p WHERE p.codestadopedido = :codestadopedido")
    , @NamedQuery(name = "Pedidos.findByCodestadoproveedor", query = "SELECT p FROM Pedidos p WHERE p.codestadoproveedor = :codestadoproveedor")
    , @NamedQuery(name = "Pedidos.findByTipodepedido", query = "SELECT p FROM Pedidos p WHERE p.tipodepedido = :tipodepedido")})
public class Pedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODPEDIDO")
    private Integer codpedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODUSUARIO")
    private String codusuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TIPODEPEDIDO")
    private String tipodepedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPROVEEDOR")
    private int codproveedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODESTADOBODEGA")
    private int codestadobodega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODESTADOPROVEEDOR")
    private int codestadoproveedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODESTADODEPEDIDO")
    private int codestadopedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODPUNTODEENTRAGA")
    private int codpuntodeentraga;

    public Pedidos() {
    }

    public Pedidos(Integer codpedido) {
        this.codpedido = codpedido;
    }

    public Pedidos(Integer codpedido, Date fecha, String codusuario, String tipodepedido, int codproveedor, int codestadobodega, int codestadoproveedor, int codestadopedido, int codpuntodeentraga) {
        this.codpedido = codpedido;
        this.fecha = fecha;
        this.codusuario = codusuario;
        this.tipodepedido = tipodepedido;
        this.codproveedor = codproveedor;
        this.codestadobodega = codestadobodega;
        this.codestadoproveedor = codestadoproveedor;
        this.codestadopedido = codestadopedido;
        this.codpuntodeentraga = codpuntodeentraga;
    }  
    

    public Integer getCodpedido() {
        return codpedido;
    }

    public void setCodpedido(Integer codpedido) {
        this.codpedido = codpedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCodusuario() {
        return codusuario;
    }

    public void setCodusuario(String codusuario) {
        this.codusuario = codusuario;
    }

    public int getCodproveedor() {
        return codproveedor;
    }

    public void setCodproveedor(int codproveedor) {
        this.codproveedor = codproveedor;
    }

    public int getCodpuntodeentraga() {
        return codpuntodeentraga;
    }

    public void setCodpuntodeentraga(int codpuntodeentraga) {
        this.codpuntodeentraga = codpuntodeentraga;
    }

    public int getCodestadobodega() {
        return codestadobodega;
    }

    public void setCodestadobodega(int codestadobodega) {
        this.codestadobodega = codestadobodega;
    }

    public int getCodestadoproveedor() {
        return codestadoproveedor;
    }

    public void setCodestadoproveedor(int codestadoproveedor) {
        this.codestadoproveedor = codestadoproveedor;
    }

    public int getCodestadopedido() {
        return codestadopedido;
    }

    public void setCodestadopedido(int codestadopedido) {
        this.codestadopedido = codestadopedido;
    }
    
    
    public String getTipodepedido() {
        return tipodepedido;
    }

    public void setTipodepedido(String tipodepedido) {
        this.tipodepedido = tipodepedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codpedido != null ? codpedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.codpedido == null && other.codpedido != null) || (this.codpedido != null && !this.codpedido.equals(other.codpedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.dbpedidos.service.Pedidos[ codpedido=" + codpedido + " ]";
    }
    
}
