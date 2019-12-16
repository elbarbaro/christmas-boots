package com.barbaro.mitutsibota.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.barbaro.mitutsibota.model.Articulo;
import com.barbaro.mitutsibota.model.TutsiBota;
import com.barbaro.mitutsibota.service.TutsiBotaServicio;

@RestController
@RequestMapping("/tutsibotas")
public class TutsiBotaController {
	
	@Autowired
	private TutsiBotaServicio service;
	
	@PostMapping
	public TutsiBota createTutsiBota(@RequestBody TutsiBota tutsiBota) {
		return service.createTutsiBota(tutsiBota);
	}
	
	@GetMapping
	public List<TutsiBota> getAll(@RequestParam(name = "color", required = false) String color){
		if(color != null && !color.isEmpty()) {
			return service.getByColor(color);
		}else {
			return service.getAll();
		}
	}
	
	@GetMapping("/{id}")
	public TutsiBota getTutsiBotaById(@PathVariable("id") String id) {
		return service.getById(id);
	}

	@PutMapping
	public TutsiBota updateTutsiBota(@RequestBody TutsiBota tutsiBota) {
		return service.updateTutsiBota(tutsiBota);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteTutsiBota(@PathVariable("id") String id) {
		service.deleteTutsiBota(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping("/{id}/articulos")
	public List<Articulo> addArticulos(@PathVariable("id") String id, @RequestBody List<Articulo> articulos){
		return service.createArticulos(id, articulos);
	}
	
	@PutMapping("/{id}/unarticulos")
	public List<Articulo> addArticulos(@PathVariable("id") String id, @RequestBody Articulo articulo){
		return service.createArticulo(id, articulo);
	}
	
	/*@GetMapping("")
	public List<TutsiBota> getTutsiBotasByColor(@RequestParam("color") String color){
		return service.getByColor(color);
	}*/
}
