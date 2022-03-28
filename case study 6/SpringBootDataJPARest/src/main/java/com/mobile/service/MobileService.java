package com.mobile.service;

import java.util.Optional;

import com.mobile.entity.Mobile;



public interface MobileService {
	Mobile addMobile(Mobile mobile);

	Mobile updateMobile(Mobile mobile);

	void deleteMobile(int mbId);

	Optional<Mobile> getMobile(int mbId);

	Iterable<Mobile> getAllMobiles();
}