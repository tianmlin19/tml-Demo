package com.tmldemo.commonservice.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private static final long serialVersionUID = -500491387049775892L;

    private String userName;

    public Integer age;

}
