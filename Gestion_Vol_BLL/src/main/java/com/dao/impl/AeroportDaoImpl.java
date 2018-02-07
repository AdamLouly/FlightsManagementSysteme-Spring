package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.BEANS.Aeroport;
import com.dao.AeroportDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;
@Repository
public class AeroportDaoImpl extends HibernateSpringGenericDaoImpl<Aeroport, Long> implements AeroportDao {

	public AeroportDaoImpl()
	{
		super(Aeroport.class);
	}

}
