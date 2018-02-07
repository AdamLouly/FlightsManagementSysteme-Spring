package com.BEANS;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Compagnie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nom;
   @OneToMany(mappedBy="compagnie",fetch=FetchType.LAZY)
   private Collection<Vol> vols;
   @OneToMany(mappedBy="compagnie",fetch=FetchType.LAZY)
   private Collection<Client> clients;
   
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
public Collection<Vol> getVols() {
	return vols;
}
public void setVols(Collection<Vol> vols) {
	this.vols = vols;
}


public Collection<Client> getClients() {
	return clients;
}
public void setClients(Collection<Client> clients) {
	this.clients = clients;
}
   
   
   
  }