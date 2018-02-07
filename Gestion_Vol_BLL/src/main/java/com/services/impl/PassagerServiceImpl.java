package com.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BEANS.Passager;
import com.dao.PassagerDao;
import com.services.PassagerService;

@Service
@Transactional
public class PassagerServiceImpl implements PassagerService {
	@Autowired
	private PassagerDao passagerDao;

	public Long addPAssage(Passager p) {
		
		return passagerDao.create(p);
	}

	public void deletePAssager(Long idReservation) {
		passagerDao.delete(idReservation);
		
	}

	public Passager getPassagerById(Long idPassager) {
		
		return passagerDao.findById(idPassager);
	}

	public void updatePassager(Passager p) {
		passagerDao.update(p);
		
	}

	public Collection<Passager> getAllPassagers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Passager getPassagerReservation(Long idReservation) {
		// TODO Auto-generated method stub
		return null;
	}
}
