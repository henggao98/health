package com.gh.healthglucose.service.serviceimpl;

import com.gh.healthglucose.service.GlucoseService;

import java.util.Random;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 23:28
 */


public class GlucoseServiceImpl implements GlucoseService {

	// get user{uid} 's current glucose
	@Override
	public Double getGlucoseByUid(Integer uid) {

		return new Random().nextDouble() * 5;
	}

}
