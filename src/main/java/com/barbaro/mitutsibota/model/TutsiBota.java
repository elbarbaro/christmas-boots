package com.barbaro.mitutsibota.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class TutsiBota {
	
	@Id
	private String id;
	private String nombre;
	private Character tamanyo;
	private String color;
	private Float peso;
	private List<Articulo> articulos;
	
	public TutsiBota() {}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Character getTamanyo() {
		return tamanyo;
	}
	public void setTamanyo(Character tamanyo) {
		this.tamanyo = tamanyo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Float getPeso() {
		return peso;
	}
	public void setPeso(Float peso) {
		this.peso = peso;
	}
	public List<Articulo> getArticulos() {
		return articulos;
	}
	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}
}
