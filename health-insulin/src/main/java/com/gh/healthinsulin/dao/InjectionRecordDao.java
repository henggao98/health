package com.gh.healthinsulin.dao;

import com.gh.domain.InjectionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 20:47
 */

@Repository
public interface InjectionRecordDao extends JpaRepository<InjectionRecord,Integer> {
}
