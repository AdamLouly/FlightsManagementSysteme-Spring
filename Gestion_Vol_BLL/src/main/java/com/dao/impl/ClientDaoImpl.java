package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.BEANS.Client;
import com.dao.ClientDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;
@Repository
public class ClientDaoImpl extends HibernateSpringGenericDaoImpl<Client, String> implements ClientDao {

	public ClientDaoImpl()
	{
		super(Client.class);
	}

}
