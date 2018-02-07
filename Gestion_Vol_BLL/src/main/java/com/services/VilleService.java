package com.services;

import java.util.Collection;

import com.BEANS.Ville;

public interface VilleService {
public Long addVille(Ville v);
public void deleteVille(Long idVille);
public Ville getVilleById(Long idVille);
public void updateVille(Ville v);
public Collection<Ville> getAllVilles();



	
}
