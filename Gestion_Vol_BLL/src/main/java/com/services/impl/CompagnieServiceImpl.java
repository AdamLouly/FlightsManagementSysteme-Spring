package com.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BEANS.Compagnie;
import com.dao.CompagnieDao;
import com.services.CompagnieService;

@Service
@Transactional
public class CompagnieServiceImpl implements CompagnieService{
	@Autowired
	private CompagnieDao compagnieDao;

	public Long addCompagnie(Compagnie c) {
		
		return compagnieDao.create(c);
	}

	public void deleteCompagnie(Long idCompagnie) {
		compagnieDao.delete(idCompagnie);
		
	}

	public Compagnie getCompagnieById(Long idCompagnie) {
		
		return compagnieDao.findById(idCompagnie);
	}

	public void updateCompagnie(Compagnie c) {
	compagnieDao.update(c);
		
	}

	public Collection<Compagnie> getAllCompagnies() {
		
		return compagnieDao.getAll();
	}

}
