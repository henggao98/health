package com.gh.healthuser.service;

import com.gh.domain.User;
import org.springframework.stereotype.Service;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 20:07
 */

@Service
public interface UserService {
	public User getUserByUid(Integer uid);
}
