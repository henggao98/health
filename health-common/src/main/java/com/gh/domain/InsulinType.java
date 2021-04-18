package com.gh.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 18:25
 */

public enum InsulinType {
    BOLUS("1", "BOLUS", "Bolus");

    private int value;
    private String s1;
    private String s2;

    InsulinType(String value, String s1, String s2) {
    }
}
