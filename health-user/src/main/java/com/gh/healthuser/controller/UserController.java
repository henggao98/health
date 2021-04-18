package com.gh.healthuser.controller;

import com.alibaba.fastjson.JSON;
import com.gh.domain.User;
import com.gh.healthuser.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 20:06
 */

@Api(tags = "User Management")
@RestController
@RequestMapping(value = "/user")
@Slf4j
public class UserController {

	@Resource
	UserService userService;

	/**
	 * QueryOneUserByUid
	 *
	 * @param uid main key
	 * @return single data
	 */
	@ApiOperation(value = "QueryOneUserByUid", notes = "no null check yet")
	@GetMapping("/{uid}")
	public User selectOne(@PathVariable("uid") Integer uid) {
		log.info("Query for user{}", uid);
		User user = userService.getUserByUid(uid);
		log.info("query result :{}", JSON.toJSONString(user));

		return user;
	}

}
