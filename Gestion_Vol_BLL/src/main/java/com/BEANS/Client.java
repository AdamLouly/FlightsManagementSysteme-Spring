package com.BEANS;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client {
	@Id
 private String login;
 private String password;
 private String nom,prenom,adresse,tel;
 @OneToMany(mappedBy="client",fetch=FetchType.LAZY)
 private Collection<Reservation> reservations;
 @ManyToOne
 @JoinColumn(name="id_compagnie")
 private Compagnie compagnie;
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public Collection<Reservation> getReservations() {
	return reservations;
}
public void setReservations(Collection<Reservation> reservations) {
	this.reservations = reservations;
}
public Compagnie getCompagnie() {
	return compagnie;
}
public void setCompagnie(Compagnie compagnie) {
	this.compagnie = compagnie;
}

 
 
}