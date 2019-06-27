package com.raven.springboot.web.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raven.springboot.web.app.models.dao.ISalaDao;
import com.raven.springboot.web.app.models.entity.Sala;

@Service
public class SalaServiceImpl implements ISalaService {
	
	@Autowired
	private ISalaDao salaDao;

	@Transactional(readOnly = true)
	public List<Sala> findAll() {

		return (List<Sala>) salaDao.findAll();
		
	}

	@Transactional
	public void save(Sala sala) {

		salaDao.save(sala);
		
	}

	@Transactional(readOnly = true)
	public Sala findOne(Long id) {

		return salaDao.findById(id).orElse(null);
		
	}

	@Transactional
	public void delete(Long id) {
		
		salaDao.deleteById(id);
		
	}

}
