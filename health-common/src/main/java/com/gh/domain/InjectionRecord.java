package com.gh.domain;

import lombok.Data;
import org.springframework.stereotype.Component;
import javax.persistence.*;

/**
 * @author HENG GAO
 * @version 1.0
 * @date 2021/4/18 18:21
 */

@Entity(name = "health_injection_record")
@Data
public class InjectionRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rid;

    //用户
    private Integer uid;
    private String username;

    //    胰岛素
//    @Enumerated(EnumType.ORDINAL)
    @Enumerated(EnumType.STRING)
    private InsulinType insulinType;

    //数量
    private Double amount;
}
