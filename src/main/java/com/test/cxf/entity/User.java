package com.test.cxf.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Justyn
 * @date 2018/10/13 10:20
 */
@Data
public class User implements Serializable {
    private Integer userId;
    private String userName;
    private String email;
}
