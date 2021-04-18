package com.gh.healthuser.controller;

import com.alibaba.fastjson.JSON;
import com.gh.domain.User;
import com.gh.healthuser.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 20:06
 */

@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/{uid}")
	public User user(@PathVariable("uid")Integer uid){
		log.info("Query for user{}", uid);
		User user = userService.getUserByUid(uid);
		log.info("query result :{}", JSON.toJSONString(user));

		return user;
	}

}
