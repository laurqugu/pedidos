/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbpedidos.service.service;

import com.mycompany.dbpedidos.service.Pedido;
import com.mycompany.dbpedidos.service.Pedidos;
import com.mycompany.dbpedidos.service.Prodpedido;
import com.mycompany.dbpedidos.service.Productopedido;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author desarrollo
 */
@Stateless
@Path("com.mycompany.dbpedidos.service.pedidos")
public class PedidosFacadeREST extends AbstractFacade<Pedidos> {

    @PersistenceContext(unitName = "com.mycompany_dbpedidos_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public PedidosFacadeREST() {
        super(Pedidos.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Pedido pedido) {
        //Inserte pedido
        Pedidos ped = new Pedidos();
        ped.setCodusuario(pedido.getCodUsuario());
        
        super.create(ped);
        
        for(Prodpedido p:pedido.getProductos()){
            Productopedido pp = new Productopedido();
            pp.setCantidadproducto(p.getCantidadProducto());
            pp.
        }
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Pedidos entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Pedidos find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Pedidos> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Pedidos> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}