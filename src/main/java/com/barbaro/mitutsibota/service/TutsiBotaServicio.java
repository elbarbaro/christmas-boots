package com.barbaro.mitutsibota.service;

import java.util.List;

import com.barbaro.mitutsibota.model.Articulo;
import com.barbaro.mitutsibota.model.TutsiBota;

public interface TutsiBotaServicio {
	
	TutsiBota createTutsiBota(TutsiBota tutsiBota);
	List<TutsiBota> getAll();
	TutsiBota getById(String id);
	List<TutsiBota> getByColor(String color);
	TutsiBota updateTutsiBota(TutsiBota tutsiBota);
	List<Articulo> createArticulos(String id, List<Articulo> articulos);
	List<Articulo> createArticulo(String id, Articulo articulo);
	void deleteTutsiBota(String id);
}
