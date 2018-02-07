package com.services;

import java.util.Collection;

import com.BEANS.Reservation;

public interface ReservationService {
	public Long addReservation(Reservation r);
	public void deleteReservation(Long idReservation);
	public Reservation getReservationById(Long idReservation);
	public void updateReservation(Reservation r);
	public Collection<Reservation> getAllReservations();
	public Collection<Reservation> getreservationClient(String idClient);
	public Collection<Reservation> getReservationPassager(Long idPassager);
	public Collection<Reservation> getReservationVol(Long idVol);

}
