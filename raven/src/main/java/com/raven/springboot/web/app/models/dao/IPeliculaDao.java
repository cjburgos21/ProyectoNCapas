package com.raven.springboot.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.raven.springboot.web.app.models.entity.Pelicula;

public interface IPeliculaDao extends CrudRepository<Pelicula, Long>{

}
