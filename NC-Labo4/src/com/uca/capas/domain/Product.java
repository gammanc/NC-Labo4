package com.uca.capas.domain;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Product {

	@Size(message="La longitud máxima es de 30 caracteres",min=1,max=30)
	@NotBlank(message="Este campo no puede estar vacio")
	private String nombre;

	@Size(message="La longitud máxima es de 30 caracteres",min=1,max=30)
	@NotBlank(message="Este campo no puede estar vacio")
	private String marca;

	@Size(message="La longitud máxima es de 30 caracteres",min=1,max=30)
	@NotBlank(message="Este campo no puede estar vacio")
	private String descripcion;

	@Size(message="La longitud máxima es de 30 caracteres",min=1,max=30)
	@NotBlank(message="Este campo no puede estar vacio")
	private String categoria;
	
	@PositiveOrZero
	private double precio;
	
	@NotNull(message="Este campo no puede estar vacio")
	@Future
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date fechav;

	
	
	public Product() {
		super();
	}


	public Product(String nombre, String marca, String descripcion,
			String categoria, double precio, Date fechav) {
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.fechav = fechav;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFechav() {
		return fechav;
	}

	public void setFechav(Date fechav) {
		this.fechav = fechav;
	}
	
	
}
