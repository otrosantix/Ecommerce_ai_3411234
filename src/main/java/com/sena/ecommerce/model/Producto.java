package com.sena.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Producto {

	private Long id_producto;
	private String categoria;
	private String nombre;
	private String cod_producto;
	private String descripcion;
	private Double precio;
	private int stock;
	
	@ManyToOne
	private Usuario usuario;
	
}
