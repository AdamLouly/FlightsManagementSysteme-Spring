package com.BEANS;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ville {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id_ville;
	private String nom;
	
   @OneToMany(mappedBy="ville",fetch=FetchType.LAZY)
	private Collection<Aeroport> aeroports;
public Long getId() {
	return id_ville;
}

public void setId(Long id) {
	this.id_ville = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}
   
public Collection<Aeroport> getAeroports() {
		return aeroports;
	}

	public void setAeroports(Collection<Aeroport> aeroports) {
		this.aeroports = aeroports;
	}

}