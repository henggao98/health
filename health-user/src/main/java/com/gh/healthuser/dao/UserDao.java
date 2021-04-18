package com.gh.healthuser.dao;

import com.gh.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 20:06
 */

@Repository
public interface UserDao extends JpaRepository<User,Integer> {
}
