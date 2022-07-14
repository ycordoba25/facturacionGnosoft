package com.yeison.inicio.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yeison.inicio.entidades.Detalle;
import com.yeison.inicio.entidades.Factura;

@Repository
public interface DetalleRepositorio extends JpaRepository<Detalle, Integer> {
	


	public List<Detalle> findByFactura(Factura idFactura);
	
	
	
}
