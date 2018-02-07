package com.BEANS;


import java.sql.Date;
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
public class Vol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private Date date_depart;
   private Date date_arrivee;
   @ManyToOne
   @JoinColumn(name="id_compagnie")
   private Compagnie compagnie;
   @OneToMany(mappedBy="vol",fetch=FetchType.LAZY)
   private Collection<Reservation> reservations;
   @ManyToOne
   @JoinColumn(name="aeroport_depart")
   private Aeroport AeroportDepart;
   @ManyToOne
   @JoinColumn(name="aeroport_arrive")
   private Aeroport AeroportArrive;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDate_depart() {
	return date_depart;
}
public void setDate_depart(Date date_depart) {
	this.date_depart = date_depart;
}
public Date getDate_arrivee() {
	return date_arrivee;
}
public void setDate_arrivee(Date date_arrivee) {
	this.date_arrivee = date_arrivee;
}
public Compagnie getCompagnie() {
	return compagnie;
}
public void setCompagnie(Compagnie compagnie) {
	this.compagnie = compagnie;
}
public Collection<Reservation> getReservations() {
	return reservations;
}
public void setReservations(Collection<Reservation> reservations) {
	this.reservations = reservations;
}
public Aeroport getAeroportDepart() {
	return AeroportDepart;
}
public void setAeroportDepart(Aeroport aeroportDepart) {
	AeroportDepart = aeroportDepart;
}
public Aeroport getAeroportArrive() {
	return AeroportArrive;
}
public void setAeroportArrive(Aeroport aeroportArrive) {
	AeroportArrive = aeroportArrive;
}

   
   

}