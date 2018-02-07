package com.BEANS;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
  boolean confirmee;
  boolean annulee;
  @ManyToOne
  @JoinColumn(name="id_passager")
  Passager passager;
  @ManyToOne
  @JoinColumn(name="id_client")
  Client client;
  @ManyToOne
  @JoinColumn(name="id_vol")
  private Vol vol;
  
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public boolean isConfirmee() {
	return confirmee;
}
public void setConfirmee(boolean confirmee) {
	this.confirmee = confirmee;
}
public boolean isAnnulee() {
	return annulee;
}
public void setAnnulee(boolean annulee) {
	this.annulee = annulee;
}
public Passager getPassager() {
	return passager;
}
public void setPassager(Passager passager) {
	this.passager = passager;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Vol getVol() {
	return vol;
}
public void setVol(Vol vol) {
	this.vol = vol;
}

  
  
  

   

   

   
}