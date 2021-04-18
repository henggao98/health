package com.gh.healthuser.service.serviceimpl;

import com.gh.domain.User;
import com.gh.healthuser.dao.UserDao;
import com.gh.healthuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 20:08
 */

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User getUserByUid(Integer uid) {
		return userDao.findById(uid).get();
	}
}
