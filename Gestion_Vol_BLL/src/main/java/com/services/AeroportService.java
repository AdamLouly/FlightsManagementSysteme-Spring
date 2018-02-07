package com.services;

import java.util.Collection;

import com.BEANS.Aeroport;

public interface AeroportService {
	public Long addAeroport(Aeroport c);
	public void deleteAeroport(Long idAeroport);
	public Aeroport getAeroportById(Long idAeroport);
	public void updateAeroport(Aeroport c);
	public Collection<Aeroport> getAllAeroports();
	//retourne la liste des aeroport d'une ville
	public Collection<Aeroport> getAeroportVille(Long idVille);

}
