package com.BEANS;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Passager {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String cin;
private String nom,prenom;

@OneToMany(mappedBy="passager",fetch=FetchType.LAZY)
private Collection<Reservation> reservations;


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getCin() {
	return cin;
}


public void setCin(String cin) {
	this.cin = cin;
}


public String getNom() {
	return nom;
}


public void setNom(String nom) {
	this.nom = nom;
}


public String getPrenom() {
	return prenom;
}


public void setPrenom(String prenom) {
	this.prenom = prenom;
}


public Collection<Reservation> getReservations() {
	return reservations;
}


public void setReservations(Collection<Reservation> reservations) {
	this.reservations = reservations;
}



}