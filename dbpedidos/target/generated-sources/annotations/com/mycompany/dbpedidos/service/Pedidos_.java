package com.mycompany.dbpedidos.service;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pedidos.class)
public abstract class Pedidos_ {

	public static volatile SingularAttribute<Pedidos, Integer> codestadoproveedor;
	public static volatile SingularAttribute<Pedidos, Date> fecha;
	public static volatile SingularAttribute<Pedidos, Integer> codestadopedido;
	public static volatile SingularAttribute<Pedidos, Integer> codpuntodeentraga;
	public static volatile SingularAttribute<Pedidos, Integer> codproveedor;
	public static volatile SingularAttribute<Pedidos, Integer> codpedido;
	public static volatile SingularAttribute<Pedidos, String> codusuario;
	public static volatile SingularAttribute<Pedidos, String> tipodepedido;
	public static volatile SingularAttribute<Pedidos, Integer> codestadobodega;

}

