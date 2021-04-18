package com.gh.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 18:12
 */

@Entity(name = "health_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;

    private String username;
    private String password;

    private Double iob;
}
