package com.gh.healthglucose.controller;

import com.alibaba.fastjson.JSON;
import com.gh.domain.InjectionRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 22:42
 */

@RestController
@RequestMapping("/glucose")
@Slf4j
public class GlucoseController {

    @GetMapping("/user/{uid}")
    public Double glucose(@PathVariable("uid") Integer uid){
        log.info("Will Query for user{}'s current glucose", uid);

        Double currentGlucose = new Random().nextDouble();

        log.info("Query Success,Content is {}", JSON.toJSONString(currentGlucose));

        return currentGlucose;
    }
}
