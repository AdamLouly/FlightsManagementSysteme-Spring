package com.services;

import java.util.Collection;

import com.BEANS.Client;

public interface ClientService {
	public String addClient(Client c);
	public void deleteClient(String idClient);
	public Client getClientById(String idClient);
	public void updateClient(Client c);
	public Collection<Client> getAllClients();
	//retourne la liste des clients d'une compagnie
	public Collection<Client> getClientCompagnie(Long idCompagnie);
}
