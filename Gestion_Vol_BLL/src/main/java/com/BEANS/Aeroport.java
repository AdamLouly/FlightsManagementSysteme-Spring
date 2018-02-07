package com.BEANS;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Aeroport {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	@OneToMany(mappedBy="AeroportArrive",fetch=FetchType.LAZY)
	private Collection<Vol> vols_A;
	@OneToMany(mappedBy="AeroportDepart",fetch=FetchType.LAZY)
	private Collection<Vol> vols_D;
	@ManyToOne
	@JoinColumn(name="id_ville")
	private Ville ville;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Collection<Vol> getVols_A() {
		return vols_A;
	}
	public void setVols_A(Collection<Vol> vols_A) {
		this.vols_A = vols_A;
	}
	public Collection<Vol> getVols_D() {
		return vols_D;
	}
	public void setVols_D(Collection<Vol> vols_D) {
		this.vols_D = vols_D;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	
	
}


