package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.BEANS.Vol;
import com.dao.VolDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;
@Repository
public class VolDaoImpl extends HibernateSpringGenericDaoImpl<Vol, Long> implements VolDao {

	public VolDaoImpl()
	{
		super(Vol.class);
	}


}
