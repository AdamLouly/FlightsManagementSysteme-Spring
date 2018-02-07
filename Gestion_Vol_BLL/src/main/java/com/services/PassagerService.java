package com.services;

import java.util.Collection;

import com.BEANS.Passager;

public interface PassagerService {
	public Long addPAssage(Passager p);
	public void deletePAssager(Long idReservation);
	public Passager getPassagerById(Long idPassager);
	public void updatePassager(Passager p);
	public Collection<Passager> getAllPassagers();
	public Passager getPassagerReservation(Long idReservation);

}
