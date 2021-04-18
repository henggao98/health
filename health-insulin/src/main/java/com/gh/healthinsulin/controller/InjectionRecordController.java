package com.gh.healthinsulin.controller;

import com.alibaba.fastjson.JSON;
import com.gh.domain.InjectionRecord;
import com.gh.healthinsulin.service.InjectionRecordService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/insulin")
@Slf4j
public class InjectionRecordController {

    @Autowired
    private InjectionRecordService injectionRecordService;

    @GetMapping("/injectionRecord/{rid}")
    public InjectionRecord record(@PathVariable("rid") Integer rid){
      log.info("Will Query for Record{}", rid);
      InjectionRecord record = injectionRecordService.findByRid(rid);
      log.info("Query Success,Content is {}", JSON.toJSONString(record));

      return record;
    }
}
