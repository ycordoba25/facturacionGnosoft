package com.yeison.inicio.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Detalle {

	@Column
	private String producto;
	@Column
	private int cantidad;
	@Column
	private double precio;
	@ManyToOne
	private Factura factura;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	public Detalle(String producto, int cantidad, double precio, Factura factura, int id) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
		this.factura = factura;
		this.id = id;
	}
	public Detalle() {
		
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}
