package com.yeison.inicio.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yeison.inicio.entidades.Factura;

@Repository
public interface FacturaRepositorio extends JpaRepository<Factura, Integer> {
	

}
