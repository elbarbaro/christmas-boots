package com.barbaro.mitutsibota.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.barbaro.mitutsibota.model.TutsiBota;

@Repository
public interface TutsiBotaRepositorio extends MongoRepository<TutsiBota, String> {
	
	List<TutsiBota> findByColor(String color);
}
