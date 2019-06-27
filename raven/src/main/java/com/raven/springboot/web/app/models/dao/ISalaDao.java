package com.raven.springboot.web.app.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.raven.springboot.web.app.models.entity.Sala;

public interface ISalaDao extends CrudRepository<Sala,Long>{
	

}
