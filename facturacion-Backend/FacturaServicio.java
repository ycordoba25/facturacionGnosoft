package com.yeison.inicio.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yeison.inicio.entidades.Factura;
import com.yeison.inicio.repositorios.FacturaRepositorio;

@Service
public class FacturaServicio {
	@Autowired
	private FacturaRepositorio facturaRepositorio;
    
	public boolean guardar(Factura factura) {
		Factura creada = facturaRepositorio.save(factura);
		if(creada==null) {
			return false;
		}else {
			return true;
		}
	}
	
	public List<Factura> listar(){
		return facturaRepositorio.findAll();
	}
	
	public void actualizar(Factura factura) {
		 facturaRepositorio.save(factura);
		
	}
	public void eliminar(Integer id) {
		facturaRepositorio.deleteById(id);
		
	}
	
	

}
