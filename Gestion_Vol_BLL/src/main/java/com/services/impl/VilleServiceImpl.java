package com.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BEANS.Ville;
import com.dao.VilleDao;
import com.services.VilleService;

@Service
@Transactional
public class VilleServiceImpl implements VilleService {
	@Autowired
	private VilleDao villeDao;

	public Long addVille(Ville v) {
		
		return villeDao.create(v);
	}

	public void deleteVille(Long idVille) {
		villeDao.delete(idVille);
		
	}

	public Ville getVilleById(Long idVille) {
		
		return villeDao.findById(idVille);
	}

	public void updateVille(Ville v) {
		villeDao.update(v);
		
	}

	public Collection<Ville> getAllVilles() {
		
		return villeDao.getAll();
	}
	
	
}
