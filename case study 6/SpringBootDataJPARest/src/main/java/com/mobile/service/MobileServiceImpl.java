package com.mobile.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.MobileDAO;
import com.mobile.entity.Mobile;

@Service
@Transactional
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileDAO dao;
	@Override
	public Mobile addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.save(mobile);
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.save(mobile);
	}

	@Override
	public void deleteMobile(int mbId) {
		// TODO Auto-generated method stub
		dao.deleteById(mbId);
	}

	@Override
	public Optional<Mobile> getMobile(int mbId) {
		// TODO Auto-generated method stub
		return dao.findById(mbId);
		
	}

	@Override
	public Iterable<Mobile> getAllMobiles() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}