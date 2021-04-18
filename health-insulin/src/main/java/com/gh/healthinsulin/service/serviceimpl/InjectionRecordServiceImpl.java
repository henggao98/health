package com.gh.healthinsulin.service.serviceimpl;

import com.gh.domain.InjectionRecord;
import com.gh.healthinsulin.dao.InjectionRecordDao;
import com.gh.healthinsulin.service.InjectionRecordService;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 20:08
 */

@Service
public class InjectionRecordServiceImpl implements InjectionRecordService {

    @Autowired
    private InjectionRecordDao injectionRecordDao;

    @Override
    public InjectionRecord findByRid(Integer rid) {
        return injectionRecordDao.findById(rid).get();
    }
}
