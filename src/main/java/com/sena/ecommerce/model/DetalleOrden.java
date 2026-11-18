package com.sena.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class DetalleOrden {

	private Long id_detalles;
	private int cantidad_orden;
	private Double precio_unitario;

	@ManyToOne
	private Producto producto;

}