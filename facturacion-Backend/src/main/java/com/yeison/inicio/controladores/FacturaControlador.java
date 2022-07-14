package com.yeison.inicio.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeison.inicio.entidades.Factura;
import com.yeison.inicio.servicios.FacturaServicio;



@RestController
@RequestMapping("/factura")
public class FacturaControlador {
	
	@Autowired
	private FacturaServicio facturaServicio;
	
	@PostMapping("/nueva")
	public String crearFactura(@RequestBody Factura factura) {
		boolean registroExitoso= facturaServicio.guardar(factura);
		if(registroExitoso) {
			return "Se ha realizado el registro";
		}else {
			return "Error";
		}
		
	}
	@GetMapping("/listar")
	public List<Factura> listarFactura(){
		return facturaServicio.listar();
		
	}
	
	@PutMapping("/editar")
	public void editarFactura(@RequestBody Factura factura) {
		facturaServicio.actualizar(factura);
	
	}
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable int id) {
		facturaServicio.eliminar(id);
	}
}
