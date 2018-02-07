package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.BEANS.Compagnie;
import com.dao.CompagnieDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;
@Repository
public class CompagnieDaoImpl extends HibernateSpringGenericDaoImpl<Compagnie, Long> implements CompagnieDao {

	public CompagnieDaoImpl()
	{
		super(Compagnie.class);
	}

}
