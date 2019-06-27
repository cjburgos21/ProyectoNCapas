package com.raven.springboot.web.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raven.springboot.web.app.models.dao.IPeliculaDao;
import com.raven.springboot.web.app.models.entity.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{

	@Autowired
	private IPeliculaDao peliculaDao;
	
	@Transactional(readOnly = true)
	public List<Pelicula> findAll() {
		
		return (List<Pelicula>) peliculaDao.findAll();
		
	}
	
	@Transactional
	public void save(Pelicula pelicula) {
		
		peliculaDao.save(pelicula);
		
	}
	
	@Transactional(readOnly = true)
	public Pelicula findOne(Long id) {
		
		return peliculaDao.findById(id).orElse(null);
		
	}
	
	@Transactional
	public void delete(Long id) {
		
		peliculaDao.deleteById(id);
		
	}
	
	
}
