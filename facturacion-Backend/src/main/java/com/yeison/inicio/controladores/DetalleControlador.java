package com.yeison.inicio.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yeison.inicio.entidades.Detalle;

import com.yeison.inicio.servicios.DetalleServicio;




@RestController
@RequestMapping("/detalle")
public class DetalleControlador {
	
	@Autowired
	private DetalleServicio detalleServicio;

		
	
	@GetMapping("/listar/{id}")
	public List<Detalle> listarDetalle(@PathVariable int id){
		return detalleServicio.listar(id);
		
	}
	
}