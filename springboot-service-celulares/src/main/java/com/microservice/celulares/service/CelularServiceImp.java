package com.microservice.celulares.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.celulares.entity.Celular;
import com.microservice.celulares.repository.CelularDAO;

@Service
public class CelularServiceImp implements CelularService {
	
	@Autowired
	private CelularDAO celularDao;
	
	@Override
	public List<Celular> findAll() {
		
		return (List<Celular>) celularDao.findAll();
	}

	@Override
	public Celular findById(Long id) {
		return celularDao.findById(id).orElse(null);
	}

	@Override
	public void deleteById(Long id) {
		celularDao.deleteById(id);
	}

	@Override
	public Celular save(Celular instance) {
		return celularDao.save(instance);
	}

	@Override
	public boolean existsById(Long id) {
		return celularDao.existsById(id);
	}

}
