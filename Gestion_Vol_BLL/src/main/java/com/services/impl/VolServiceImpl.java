package com.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BEANS.Vol;
import com.dao.VolDao;
import com.services.VolService;

@Service
@Transactional
public class VolServiceImpl implements VolService {
	@Autowired
	private VolDao volDao;

	public Long addVol(Vol v) {
		
		return volDao.create(v);
	}

	public void deleteVol(Long idVol) {
		volDao.delete(idVol);
		
	}

	public Vol getVolById(Long idVol) {
		
		return volDao.findById(idVol);
	}

	public void updateVol(Vol v) {
		volDao.update(v);
		
	}

	public Collection<Vol> getAllVols() {
		
		return volDao.getAll();
	}

	public Collection<Vol> getVolCompagnie(Long idCompagnie) {
		
		return volDao.getEntityByColValue("Vol", "id_compagnie", String.valueOf(idCompagnie));
	}

	public Collection<Vol> getVolAeroportDepart(Long idAeroport) {
		
		return volDao.getEntityByColValue("Vol", "aeroport_depart", String.valueOf(idAeroport));
	}

	public Collection<Vol> getVolAeroportArrive(Long idAeroport) {
		return volDao.getEntityByColValue("Vol", "aeroport_arrive", String.valueOf(idAeroport));
	}
}
