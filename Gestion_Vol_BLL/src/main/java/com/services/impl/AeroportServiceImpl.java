package com.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BEANS.Aeroport;
import com.dao.AeroportDao;
import com.services.AeroportService;

@Service
@Transactional
public class AeroportServiceImpl implements AeroportService {
	@Autowired
	private AeroportDao aeroportDao;

	public Long addAeroport(Aeroport c) {
		return aeroportDao.create(c);
		
	}

	public void deleteAeroport(Long idAeroport) {
		aeroportDao.delete(idAeroport);
		
	}

	public Aeroport getAeroportById(Long idAeroport) {
		
		return aeroportDao.findById(idAeroport);
	}

	public void updateAeroport(Aeroport c) {
		aeroportDao.update(c);
		
	}

	public Collection<Aeroport> getAllAeroports() {
		
		return aeroportDao.getAll();
	}

	public Collection<Aeroport> getAeroportVille(Long idVille) {
		
		return aeroportDao.getEntityByColValue("Aeroport","id_ville", String.valueOf(idVille) );
	}

	
}
