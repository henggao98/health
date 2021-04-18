package com.gh.healthinsulin.service;

import com.gh.domain.InjectionRecord;
import org.springframework.stereotype.Service;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 20:07
 */

@Service
public interface InjectionRecordService {
    /**
     * @param rid
     * @return InjectionRecord
     */
    public InjectionRecord findByRid(Integer rid);
}
