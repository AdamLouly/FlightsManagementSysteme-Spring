package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.BEANS.Reservation;
import com.dao.ReservationDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;
@Repository
public class ReservationDaoImpl extends HibernateSpringGenericDaoImpl<Reservation, Long> implements ReservationDao {

	public ReservationDaoImpl()
	{
		super(Reservation.class);
	}

}
