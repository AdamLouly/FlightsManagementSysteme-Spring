package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.BEANS.Passager;
import com.dao.PassagerDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;
@Repository
public class PassagerDaoImpl extends HibernateSpringGenericDaoImpl<Passager, Long> implements PassagerDao {

	public PassagerDaoImpl()
	{
		super(Passager.class);
	}

}
