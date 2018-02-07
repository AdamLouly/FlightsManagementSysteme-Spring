package com.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BEANS.Reservation;
import com.dao.ReservationDao;
import com.services.ReservationService;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private ReservationDao reservationDao;

	public Long addReservation(Reservation r) {
		
		return reservationDao.create(r);
	}

	public void deleteReservation(Long idReservation) {
		reservationDao.delete(idReservation);
		
	}

	public Reservation getReservationById(Long idReservation) {
		
		return reservationDao.findById(idReservation);
	}

	public void updateReservation(Reservation r) {
		reservationDao.update(r);
		
	}

	public Collection<Reservation> getAllReservations() {
		
		return reservationDao.getAll();
	}

	public Collection<Reservation> getreservationClient(String idClient) {
		
		return reservationDao.getEntityByColValue("Reservation", "id_client", String.valueOf(idClient));
	}

	public Collection<Reservation> getReservationPassager(Long idPassager) {
		return reservationDao.getEntityByColValue("Reservation", "id_passager", String.valueOf(idPassager));
	}

	public Collection<Reservation> getReservationVol(Long idVol) {
		return reservationDao.getEntityByColValue("Reservation", "id_vol", String.valueOf(idVol));
	}
}
