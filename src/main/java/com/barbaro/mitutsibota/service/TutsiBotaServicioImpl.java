package com.barbaro.mitutsibota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbaro.mitutsibota.dao.TutsiBotaRepositorio;
import com.barbaro.mitutsibota.model.Articulo;
import com.barbaro.mitutsibota.model.TutsiBota;

@Service
public class TutsiBotaServicioImpl implements TutsiBotaServicio {
	
	@Autowired
	private TutsiBotaRepositorio repository;
	
	@Override
	public TutsiBota createTutsiBota(TutsiBota tutsiBota) {
		return repository.insert(tutsiBota);
	}
	
	@Override
	public List<TutsiBota> getAll() {
		return repository.findAll();
	}
	
	@Override
	public TutsiBota getById(String id) {
		return repository.findById(id).get();
	}
	
	@Override
	public TutsiBota updateTutsiBota(TutsiBota tutsiBota) {
		// Objeto controlado por mongo
		TutsiBota bota = getById(tutsiBota.getId());
		
		// Cambiar valores
		bota.setNombre(tutsiBota.getNombre());
		bota.setPeso(tutsiBota.getPeso());
		bota.setColor(tutsiBota.getColor());
		bota.setTamanyo(tutsiBota.getTamanyo());
		bota.setArticulos(tutsiBota.getArticulos());
		
		return repository.save(bota);
	}
	
	@Override
	public void deleteTutsiBota(String id) {
		repository.deleteById(id);
	}
	
	@Override
	public List<Articulo> createArticulos(String id, List<Articulo> articulos) {
		TutsiBota tutsiBota = getById(id);
		tutsiBota.getArticulos().addAll(articulos);
		return repository.save(tutsiBota).getArticulos();
	}
	
	@Override
	public List<Articulo> createArticulo(String id, Articulo articulo) {
		TutsiBota tutsiBota = getById(id);
		tutsiBota.getArticulos().add(articulo);
		return repository.save(tutsiBota).getArticulos();
	}
	
	@Override
	public List<TutsiBota> getByColor(String color) {
		return repository.findByColor(color);
	}
}
