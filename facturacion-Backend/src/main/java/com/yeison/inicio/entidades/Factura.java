package com.yeison.inicio.entidades;

import java.sql.Array;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String cliente;
	@Column
	private LocalDate fecha;
	@OneToMany
	private List<Detalle> detalle;
	
	public Factura(int id, String cliente, LocalDate fecha) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.fecha = fecha;
	}
	public Factura() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	


}
