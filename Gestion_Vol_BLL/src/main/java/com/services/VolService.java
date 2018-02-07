package com.services;

import java.util.Collection;

import com.BEANS.Vol;

public interface VolService {
	public Long addVol(Vol v);
	public void deleteVol(Long idVol);
	public Vol getVolById(Long idVol);
	public void updateVol(Vol v);
	public Collection<Vol> getAllVols();
	//retourne les vols que propose une compagnie 
	public Collection<Vol> getVolCompagnie(Long idCompagnie);
	//retourne les vols que propose une compagnie 
	public Collection<Vol> getVolAeroportDepart(Long idAeroport);
	//retourne les vols que propose une compagnie 
	public Collection<Vol> getVolAeroportArrive(Long idAeroport);

	
}
