package com.raven.springboot.web.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raven.springboot.web.app.models.dao.IUsuarioDao;
import com.raven.springboot.web.app.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		
		return (List<Usuario>) usuarioDao.findAll();
		
	}
	
	@Transactional
	public void save(Usuario usuario) {
		
		usuarioDao.save(usuario);
		
	}
	
	@Transactional(readOnly = true)
	public Usuario findOne(Long id) {
		
		return usuarioDao.findById(id).orElse(null);
		
	}
	
	@Transactional
	public void delete(Long id) {
		
		usuarioDao.deleteById(id);
		
	}

	
	@Transactional(readOnly = true)
	public Page<Usuario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return usuarioDao.findAll(pageable);
	}

}
