package com.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.BEANS.Client;
import com.dao.ClientDao;
import com.services.ClientService;

@Service
@Transactional
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientDao clientDao;

	public String addClient(Client c) {
		return clientDao.create(c);
		
	}

	public void deleteClient(String idClient) {
		clientDao.delete(idClient);
		
	}

	public Client getClientById(String idClient) {
		
		return clientDao.findById(idClient);
	}

	public void updateClient(Client c) {
		clientDao.update(c);
		
	}

	public Collection<Client> getAllClients() {
		
		return clientDao.getAll();
	}



	public Collection<Client> getClientCompagnie(Long idCompagnie) {
		
		return clientDao.getEntityByColValue("Client", "id_compagnie", String.valueOf(idCompagnie));
	}
}
