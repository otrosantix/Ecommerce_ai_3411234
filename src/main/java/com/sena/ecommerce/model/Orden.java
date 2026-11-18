package com.sena.ecommerce.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Orden {

	private Long id_orden;
	private LocalDateTime fecha_compra;
	private Double subtotal;
	private Double total;
	
	@ManyToOne
	private Usuario usuario;
}
