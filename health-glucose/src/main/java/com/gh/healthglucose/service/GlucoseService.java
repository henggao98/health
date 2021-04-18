package com.gh.healthglucose.service;

import org.springframework.stereotype.Service;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 23:26
 */

@Service
public interface GlucoseService {
	Double getGlucoseByUid(Integer uid);
}
