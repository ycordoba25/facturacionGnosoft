package com.yeison.inicio.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeison.inicio.entidades.Detalle;
import com.yeison.inicio.entidades.Factura;
import com.yeison.inicio.repositorios.DetalleRepositorio;
import com.yeison.inicio.repositorios.FacturaRepositorio;


@Service
public class DetalleServicio {
	
	@Autowired
	private DetalleRepositorio detalleRepositorio;
	@Autowired
	private FacturaRepositorio facturaRepositorio;
	
    
	
	public List<Detalle> listar(int id){
		
		Factura idFactura =facturaRepositorio.findById(id).get();
		return detalleRepositorio.findByFactura(idFactura);
				
			
				
	}
}