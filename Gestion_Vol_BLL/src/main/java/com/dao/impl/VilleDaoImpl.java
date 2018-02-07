package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.BEANS.Ville;
import com.dao.VilleDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;
@Repository
public class VilleDaoImpl extends HibernateSpringGenericDaoImpl<Ville, Long> implements VilleDao {

	public VilleDaoImpl()
	{
		super(Ville.class);
	}

}
