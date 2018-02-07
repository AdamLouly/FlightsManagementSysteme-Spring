package com.services;

import java.util.Collection;

import com.BEANS.Compagnie;

public interface CompagnieService {
	public Long addCompagnie(Compagnie c);
	public void deleteCompagnie(Long idCompagnie);
	public Compagnie getCompagnieById(Long idCompagnie);
	public void updateCompagnie(Compagnie c);
	public Collection<Compagnie> getAllCompagnies();

	
}
